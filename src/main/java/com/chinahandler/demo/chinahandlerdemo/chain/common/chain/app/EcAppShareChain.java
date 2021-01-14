package com.chinahandler.demo.chinahandlerdemo.chain.common.chain.app;

import com.chinahandler.demo.chinahandlerdemo.app.entity.EcAppShareEntity;
import com.chinahandler.demo.chinahandlerdemo.app.mapping.EcAppShareMapper;
import com.chinahandler.demo.chinahandlerdemo.chain.AbstractChainProcessHandler;
import com.chinahandler.demo.chinahandlerdemo.chain.common.ChainProcessManager;
import com.chinahandler.demo.chinahandlerdemo.chain.common.result.PolymerizationResult;
import com.chinahandler.demo.chinahandlerdemo.user.entity.CrmTWechatUserEntity;
import com.chinahandler.demo.chinahandlerdemo.user.mapping.CrmTWechatUserMapper;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * 项目名称: chinahandlerdemo
 *
 * @ClassName EcAppShareChainHandler
 * @Description
 * @Author wangyanwei wangyanwei003@chinasofti.com   @Date 2021/1/13 18:59
 */

@Slf4j
public class EcAppShareChain extends AbstractChainProcessHandler {


    @Override
    public void doChain(ChainProcessManager chainProcessManager, PolymerizationResult result) {
        log.info("EcAppShareChain执行了");
        try {
            EcAppShareMapper ecAppShareMapper = chainProcessManager.getEcAppShareMapper();
            List<EcAppShareEntity> ecAppShareEntities = ecAppShareMapper.queryAll(new EcAppShareEntity() {{
                setAppShareId("00ccbf34-4b78-494f-9dc2-92019c892bdc");
            }});
            result.setEcAppShareEntityList(ecAppShareEntities);
            result.setEcAppShareCount(ecAppShareEntities.size());
        }catch (Exception e){
            e.printStackTrace();
        }
        log.info("EcAppShareChain执行了结束了,开始下一个");
        this.nextChain(chainProcessManager,result);
    }
}