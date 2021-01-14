package com.chinahandler.demo.chinahandlerdemo.chain.common.chain.user;

import com.chinahandler.demo.chinahandlerdemo.chain.AbstractChainProcessHandler;
import com.chinahandler.demo.chinahandlerdemo.chain.common.ChainProcessManager;
import com.chinahandler.demo.chinahandlerdemo.chain.common.result.PolymerizationResult;
import com.chinahandler.demo.chinahandlerdemo.user.entity.CrmTUserLoginEntity;
import com.chinahandler.demo.chinahandlerdemo.user.mapping.CrmTUserLoginMapper;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * 项目名称: chinahandlerdemo
 *
 * @ClassName CrmTUserLogin
 * @Description
 * @Author wangyanwei wangyanwei003@chinasofti.com   @Date 2021/1/13 19:11
 */
@Slf4j
public class CrmTUserLoginChain  extends AbstractChainProcessHandler {


    @Override
    public void doChain(ChainProcessManager chainProcessManager, PolymerizationResult result) {

        log.info("CrmTUserLoginChain执行了");
        CrmTUserLoginMapper crmTUserLoginMapper = chainProcessManager.getCrmTUserLoginMapper();
        List<CrmTUserLoginEntity> crmTUserLoginEntities = crmTUserLoginMapper.queryAll(new CrmTUserLoginEntity() {{
                setOpenId("ob1Dnt73rsrCp7l3PtlGDZ1gPeG4");
        }});
        result.setCrmTUserLoginEntityList(crmTUserLoginEntities);
        result.setCrmTUserLoginCount(crmTUserLoginEntities.size());
        log.info("CrmTUserLoginChain执行了结束了,开始下一个");
        this.nextChain(chainProcessManager,result);
    }
}