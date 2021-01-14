package com.chinahandler.demo.chinahandlerdemo.app.controller;

import com.chinahandler.demo.chinahandlerdemo.app.entity.EcAppTokenEntity;
import com.chinahandler.demo.chinahandlerdemo.app.service.EcAppTokenService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (EcAppToken)表控制层
 *
 * @author makejava
 * @since 2021-01-13 16:56:56
 */
@RestController
@RequestMapping("ecAppToken")
public class EcAppTokenController {
    /**
     * 服务对象
     */
    @Resource
    private EcAppTokenService ecAppTokenService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public EcAppTokenEntity selectOne(String id) {
        return this.ecAppTokenService.queryById(id);
    }

}