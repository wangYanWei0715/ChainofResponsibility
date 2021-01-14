package com.chinahandler.demo.chinahandlerdemo.chain.common.chain.user;

import com.chinahandler.demo.chinahandlerdemo.chain.AbstractChainProcessHandler;
import com.chinahandler.demo.chinahandlerdemo.chain.common.ChainProcessManager;
import com.chinahandler.demo.chinahandlerdemo.chain.common.result.PolymerizationResult;
import com.chinahandler.demo.chinahandlerdemo.user.entity.CrmTUserLoginEntity;
import com.chinahandler.demo.chinahandlerdemo.user.entity.CrmTWechatUserEntity;
import com.chinahandler.demo.chinahandlerdemo.user.mapping.CrmTUserLoginMapper;
import com.chinahandler.demo.chinahandlerdemo.user.mapping.CrmTWechatUserMapper;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * 项目名称: chinahandlerdemo
 *
 * @ClassName CrmTWechatUserChain
 * @Description
 * @Author wangyanwei wangyanwei003@chinasofti.com   @Date 2021/1/13 19:12
 */
@Slf4j
public class CrmTWechatUserChain extends AbstractChainProcessHandler {


    @Override
    public void doChain(ChainProcessManager chainProcessManager, PolymerizationResult result) {
        log.info("CrmTWechatUserChain执行了");
        CrmTWechatUserMapper crmTWechatUserMapper = chainProcessManager.getCrmTWechatUserMapper();
        List<CrmTWechatUserEntity> crmTWechatUserEntities = crmTWechatUserMapper.queryAll(new CrmTWechatUserEntity() {{
            setOpenId("ob1Dnt73rsrCp7l3PtlGDZ1gPeG4");
        }});
        result.setCrmTWechatUserEntityList(crmTWechatUserEntities);
        result.setCrmTWechatUserCount(crmTWechatUserEntities.size());
        log.info("CrmTWechatUserChain执行了结束了,开始下一个");
        this.nextChain(chainProcessManager,result);
    }
}