package com.chinahandler.demo.chinahandlerdemo.user.controller;

import com.chinahandler.demo.chinahandlerdemo.user.entity.CrmTUserLoginEntity;
import com.chinahandler.demo.chinahandlerdemo.user.service.CrmTUserLoginService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (CrmTUserLogin)表控制层
 *
 * @author makejava
 * @since 2021-01-13 15:57:57
 */
@RestController
@RequestMapping("crmTUserLogin")
public class CrmTUserLoginController {
    /**
     * 服务对象
     */
    @Resource
    private CrmTUserLoginService crmTUserLoginService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public CrmTUserLoginEntity selectOne(String id) {
        return this.crmTUserLoginService.queryById(id);
    }

}