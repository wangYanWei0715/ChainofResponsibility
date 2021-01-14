package com.chinahandler.demo.chinahandlerdemo.chain.common.chain.app;

import com.chinahandler.demo.chinahandlerdemo.app.entity.EcAppShareEntity;
import com.chinahandler.demo.chinahandlerdemo.app.entity.EcAppTokenEntity;
import com.chinahandler.demo.chinahandlerdemo.app.mapping.EcAppShareMapper;
import com.chinahandler.demo.chinahandlerdemo.app.mapping.EcAppTokenMapper;
import com.chinahandler.demo.chinahandlerdemo.chain.AbstractChainProcessHandler;
import com.chinahandler.demo.chinahandlerdemo.chain.common.ChainProcessManager;
import com.chinahandler.demo.chinahandlerdemo.chain.common.result.PolymerizationResult;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * 项目名称: chinahandlerdemo
 *
 * @ClassName EcAppTokenChain
 * @Description
 * @Author wangyanwei wangyanwei003@chinasofti.com   @Date 2021/1/13 19:08
 */
@Slf4j
public class EcAppTokenChain extends AbstractChainProcessHandler {
    @Override
    public void doChain(ChainProcessManager chainProcessManager, PolymerizationResult result) {
        log.info("EcAppTokenChain执行了");
        EcAppTokenMapper ecAppTokenMapper = chainProcessManager.getEcAppTokenMapper();
        List<EcAppTokenEntity> ecAppShareEntities = ecAppTokenMapper.queryAll(new EcAppTokenEntity() {{
            setAppTokenId("1");
        }});
        result.setEcAppTokenEntityList(ecAppShareEntities);
        result.setEcAppTokenCount(ecAppShareEntities.size());
        log.info("EcAppTokenChain执行了结束了,开始下一个");
        this.nextChain(chainProcessManager,result);
    }
}