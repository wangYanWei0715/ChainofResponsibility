package com.chinahandler.demo.chinahandlerdemo.chain.common;

import com.chinahandler.demo.chinahandlerdemo.app.mapping.EcAppShareMapper;
import com.chinahandler.demo.chinahandlerdemo.app.mapping.EcAppTokenMapper;
import com.chinahandler.demo.chinahandlerdemo.app.mapping.EcAppVersionMapper;
import com.chinahandler.demo.chinahandlerdemo.user.mapping.CrmTUserLoginMapper;
import com.chinahandler.demo.chinahandlerdemo.user.mapping.CrmTWechatUserMapper;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 项目名称: chinahandlerdemo
 *
 * @ClassName ChainProcessManager
 * @Description
 * @Author wangyanwei wangyanwei003@chinasofti.com   @Date 2021/1/13 16:55
 */
@Service
@Data
public class ChainProcessManager {

    @Autowired
    private EcAppShareMapper ecAppShareMapper;

    @Autowired
    private EcAppTokenMapper ecAppTokenMapper;

    @Autowired
    private EcAppVersionMapper ecAppVersionMapper;

    @Autowired
    private CrmTUserLoginMapper crmTUserLoginMapper;

    @Autowired
    private CrmTWechatUserMapper crmTWechatUserMapper;

}