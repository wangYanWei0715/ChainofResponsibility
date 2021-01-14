package com.chinahandler.demo.chinahandlerdemo.app.service;

import com.chinahandler.demo.chinahandlerdemo.app.entity.EcAppTokenEntity;

import java.util.List;

/**
 * (EcAppToken)表服务接口
 *
 * @author makejava
 * @since 2021-01-13 16:56:56
 */
public interface EcAppTokenService {

    /**
     * 通过ID查询单条数据
     *
     * @param appTokenId 主键
     * @return 实例对象
     */
    EcAppTokenEntity queryById(String appTokenId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<EcAppTokenEntity> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param ecAppToken 实例对象
     * @return 实例对象
     */
    EcAppTokenEntity insert(EcAppTokenEntity ecAppToken);

    /**
     * 修改数据
     *
     * @param ecAppToken 实例对象
     * @return 实例对象
     */
    EcAppTokenEntity update(EcAppTokenEntity ecAppToken);

    /**
     * 通过主键删除数据
     *
     * @param appTokenId 主键
     * @return 是否成功
     */
    boolean deleteById(String appTokenId);

}