package com.chinahandler.demo.chinahandlerdemo.app.controller;

import com.chinahandler.demo.chinahandlerdemo.app.entity.EcAppShareEntity;
import com.chinahandler.demo.chinahandlerdemo.app.service.EcAppShareService;
import com.chinahandler.demo.chinahandlerdemo.chain.common.result.PolymerizationResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (EcAppShare)表控制层
 *
 * @author makejava
 * @since 2021-01-13 16:10:04
 */
@RestController
@RequestMapping("ecAppShare")
public class EcAppShareController {
    /**
     * 服务对象
     */
    @Resource
    private EcAppShareService ecAppShareService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public EcAppShareEntity selectOne(String id) {
        return this.ecAppShareService.queryById(id);
    }

    @GetMapping("chainTest")
    public PolymerizationResult chainTest (){
        return ecAppShareService.chainTest();
    }


}