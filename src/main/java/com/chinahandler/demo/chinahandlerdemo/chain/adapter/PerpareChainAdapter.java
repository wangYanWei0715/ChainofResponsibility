package com.chinahandler.demo.chinahandlerdemo.chain.adapter;

import com.chinahandler.demo.chinahandlerdemo.Common.Constants;
import com.chinahandler.demo.chinahandlerdemo.chain.AbstractChainProcessHandler;
import com.chinahandler.demo.chinahandlerdemo.chain.common.ChainProcessManager;
import com.chinahandler.demo.chinahandlerdemo.chain.common.result.PolymerizationResult;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.JarURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 项目名称: chinahandlerdemo
 *
 * @ClassName PerpareChainAdapter
 * @Description
 * @Author wangyanwei wangyanwei003@chinasofti.com   @Date 2021/1/13 19:18
 */
@Component
@Slf4j
public class PerpareChainAdapter {

    private static final List<Class<?>> CHAIN_CLASS = new ArrayList<>();

    private ChainProcessManager chainProcessManager;

    public ChainProcessManager getChainProcessManager() {
        return chainProcessManager;
    }

    @Autowired
    public void setChainProcessManager(ChainProcessManager chainProcessManager) {
        this.chainProcessManager = chainProcessManager;
    }

    public PolymerizationResult handler() throws Exception {
        log.info("责任链预热");
        if (CHAIN_CLASS.isEmpty()){
            this.findChainClass();
        }
        List<AbstractChainProcessHandler> collect = CHAIN_CLASS.stream().map(x -> {
            try {
                Deprecated deprecated = x.getAnnotation(Deprecated.class);
                if (Objects.nonNull(deprecated)) {
                    throw new NullPointerException();
                }
                return (AbstractChainProcessHandler) x.getDeclaredConstructor().newInstance();
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }

        }).filter(Objects::nonNull).collect(Collectors.toList());

        if (collect.isEmpty()){
            log.info("未找到责任链");
            throw new Exception("未找到责任链");
        }
        for (int i = 1; i <collect.size() ; i++) {
            collect.get(i- Constants.SECOND_CHAIN).setHandler(collect.get(i));
        }
        PolymerizationResult polymerizationResult = new PolymerizationResult();
        collect.get(Constants.FIRST_CHAIN).doChain(this.chainProcessManager,polymerizationResult);
        return polymerizationResult;
    }

    /**
     * 反射加载AbstractChainProcessHandler同包下所有的类
     *
     * @throws Exception
     */
    private void findChainClass() throws Exception {
        try {
            log.info("findChainClass方法开始执行了");
            final String packageName = AbstractChainProcessHandler.class.getPackage().getName().replace(Constants.PACKAGE_SPACE_CHARACTER,Constants.PATH_SPACE_CHARACTER);
            ClassLoader classLoader = AbstractChainProcessHandler.class.getClassLoader();
            URL resource = classLoader.getResource(packageName);
            if (Objects.isNull(resource)){
                throw new ClassNotFoundException();
            }
            if (ResourceUtils.isJarURL(resource)){
                log.info("进入scanPackageJar了");
                this.scanPackageJar(resource,packageName);
            }else {
                log.info("进入scanPackageClass了");
                this.scanPackageClass(resource,packageName);
            }
            log.info("findChainClass方法执行结束了");
        }catch (Exception e){
            log.error("加载责任链预热失败,错误内容:{}",e.getMessage());
            e.printStackTrace();
            throw new Exception("加载责任链预热失败");
        }
    }

    private void scanPackageClass(URL resource, String packageName) throws URISyntaxException, IOException {

        List<String> chains;
        try ( Stream<Path> walk =Files.walk(Paths.get(resource.toURI()))){
            chains = walk.map(x-> x.toString().replaceAll(Constants.TRANSFER_SPACE_CHARACTER,Constants.PATH_SPACE_CHARACTER))
                    .map(x -> this.convertPackage(x,packageName)).filter(StringUtils::isNotBlank).collect(Collectors.toList());
        }

        CHAIN_CLASS.addAll(
                chains.stream().map(x -> {

                    try {
                        return Class.forName(x);
                    } catch (ClassNotFoundException e) {
                        return String.class;
                    }

                }).filter(x -> x.getSuperclass() == AbstractChainProcessHandler.class).collect(Collectors.toList())
        );
    }

    private void scanPackageJar(URL resource, String packageName) throws IOException, ClassNotFoundException {
        log.info("进入scanPackageJar方法了");
        JarURLConnection jarURLConnection = (JarURLConnection) resource.openConnection();
        JarFile jarFile = jarURLConnection.getJarFile();
        Enumeration<JarEntry> entries = jarFile.entries();
        while (entries.hasMoreElements()){
            String className = entries.nextElement().getName();
            log.info("scanPackageJar--->className:{}",className);
            className = className.replaceAll(Constants.TRANSFER_SPACE_CHARACTER, Constants.PATH_SPACE_CHARACTER);
            log.info("scanPackageJar-replaceAll后的-->className:{}",className);
            if (!className.endsWith(Constants.CLASS_SUFFIX) || !className.contains(packageName)){
                continue;
            }
           String classFullName =  this.convertPackage(className,packageName);
            Class<?> clazz = Optional.ofNullable(Class.forName(classFullName)).filter(x -> x.getSuperclass() == AbstractChainProcessHandler.class).orElse(null);
            if (Objects.nonNull(clazz)){
                CHAIN_CLASS.add(clazz);
            }
        }
        log.info("结束scanPackageJar方法了,chain_class:{}",CHAIN_CLASS);

    }

    private String convertPackage(String className, String packageName) {
        log.info("进入convertPackage方法了，className参数:{},packageName参数:{}",className,packageName);
        String s = Optional.of(className).filter(x -> x.endsWith(Constants.CLASS_SUFFIX)).filter(x -> x.contains(packageName))
                .map(x -> x.split(packageName)[Constants.VALID_PACKAGE_INDEX])
                .map(x -> packageName + x)
                .map(x -> x.replaceAll(Constants.PATH_SPACE_CHARACTER, Constants.PACKAGE_SPACE_CHARACTER))
                .map(x -> x.replaceAll(Constants.CLASS_SUFFIX, Constants.BLANK_SPACE)).orElse(null);

        log.info("改造后的className对象:{}",s);
        return s;


    }

}