package com.chinahandler.demo.chinahandlerdemo.user.controller;

import com.chinahandler.demo.chinahandlerdemo.user.entity.CrmTWechatUserEntity;
import com.chinahandler.demo.chinahandlerdemo.user.service.CrmTWechatUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (CrmTWechatUser)表控制层
 *
 * @author makejava
 * @since 2021-01-13 16:03:41
 */
@RestController
@RequestMapping("crmTWechatUser")
public class CrmTWechatUserController {
    /**
     * 服务对象
     */
    @Resource
    private CrmTWechatUserService crmTWechatUserService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public CrmTWechatUserEntity selectOne(String id) {
        return this.crmTWechatUserService.queryById(id);
    }

}