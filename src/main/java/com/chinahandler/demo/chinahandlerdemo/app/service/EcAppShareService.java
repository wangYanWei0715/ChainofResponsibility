package com.chinahandler.demo.chinahandlerdemo.app.service;

import com.chinahandler.demo.chinahandlerdemo.app.entity.EcAppShareEntity;
import com.chinahandler.demo.chinahandlerdemo.chain.common.result.PolymerizationResult;

import java.util.List;

/**
 * (EcAppShare)表服务接口
 *
 * @author makejava
 * @since 2021-01-13 16:10:03
 */
public interface EcAppShareService {

    /**
     * 通过ID查询单条数据
     *
     * @param appShareId 主键
     * @return 实例对象
     */
    EcAppShareEntity queryById(String appShareId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<EcAppShareEntity> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param ecAppShare 实例对象
     * @return 实例对象
     */
    EcAppShareEntity insert(EcAppShareEntity ecAppShare);

    /**
     * 修改数据
     *
     * @param ecAppShare 实例对象
     * @return 实例对象
     */
    EcAppShareEntity update(EcAppShareEntity ecAppShare);

    /**
     * 通过主键删除数据
     *
     * @param appShareId 主键
     * @return 是否成功
     */
    boolean deleteById(String appShareId);

    PolymerizationResult chainTest();
}