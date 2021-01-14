package com.chinahandler.demo.chinahandlerdemo.chain.common.chain.app;

import com.chinahandler.demo.chinahandlerdemo.app.entity.EcAppTokenEntity;
import com.chinahandler.demo.chinahandlerdemo.app.entity.EcAppVersionEntity;
import com.chinahandler.demo.chinahandlerdemo.app.mapping.EcAppTokenMapper;
import com.chinahandler.demo.chinahandlerdemo.app.mapping.EcAppVersionMapper;
import com.chinahandler.demo.chinahandlerdemo.chain.AbstractChainProcessHandler;
import com.chinahandler.demo.chinahandlerdemo.chain.common.ChainProcessManager;
import com.chinahandler.demo.chinahandlerdemo.chain.common.result.PolymerizationResult;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * 项目名称: chinahandlerdemo
 *
 * @ClassName EcAppVersionChain
 * @Description
 * @Author wangyanwei wangyanwei003@chinasofti.com   @Date 2021/1/13 19:09
 */
@Slf4j
public class EcAppVersionChain extends AbstractChainProcessHandler {
    @Override
    public void doChain(ChainProcessManager chainProcessManager, PolymerizationResult result) {
        log.info("EcAppVersionChain执行了");
        EcAppVersionMapper ecAppVersionMapper = chainProcessManager.getEcAppVersionMapper();
        List<EcAppVersionEntity> ecAppShareEntities = ecAppVersionMapper.queryAll(new EcAppVersionEntity() {{
            setAppType("ANDROID");
        }});
        result.setEcAppVersionEntityList(ecAppShareEntities);
        result.setEcAppVersionCount(ecAppShareEntities.size());
        log.info("EcAppVersionChain执行了结束了,开始下一个");
        this.nextChain(chainProcessManager,result);
    }
}