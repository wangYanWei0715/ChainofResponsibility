package com.chinahandler.demo.chinahandlerdemo.app.controller;

import com.chinahandler.demo.chinahandlerdemo.app.entity.EcAppVersionEntity;
import com.chinahandler.demo.chinahandlerdemo.app.service.EcAppVersionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (EcAppVersion)表控制层
 *
 * @author makejava
 * @since 2021-01-13 16:57:12
 */
@RestController
@RequestMapping("ecAppVersion")
public class EcAppVersionController {
    /**
     * 服务对象
     */
    @Resource
    private EcAppVersionService ecAppVersionService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public EcAppVersionEntity selectOne(String id) {
        return this.ecAppVersionService.queryById(id);
    }

}