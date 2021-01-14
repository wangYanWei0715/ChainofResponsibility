package com.chinahandler.demo.chinahandlerdemo.chain;

import com.chinahandler.demo.chinahandlerdemo.chain.common.ChainProcessManager;
import com.chinahandler.demo.chinahandlerdemo.chain.common.result.PolymerizationResult;

import java.util.Objects;

/**
 * 项目名称: chinahandlerdemo
 *
 * @ClassName AbstractChainProcessHandler
 * @Description
 * @Author wangyanwei wangyanwei003@chinasofti.com   @Date 2021/1/13 16:51
 */
public abstract class AbstractChainProcessHandler {


    protected AbstractChainProcessHandler handler;


    public AbstractChainProcessHandler getHandler() {
        return handler;
    }

    public void setHandler(AbstractChainProcessHandler handler) {
        this.handler = handler;
    }


    public abstract void doChain(ChainProcessManager chainProcessManager, PolymerizationResult result);


    public  void nextChain(ChainProcessManager chainProcessManager, PolymerizationResult result){
        if (Objects.nonNull(this.getHandler())){
            this.getHandler().doChain(chainProcessManager,result);
        }
    }



}