package com.chinahandler.demo.chinahandlerdemo.app.service;

import com.chinahandler.demo.chinahandlerdemo.app.entity.EcAppVersionEntity;

import java.util.List;

/**
 * (EcAppVersion)表服务接口
 *
 * @author makejava
 * @since 2021-01-13 16:57:12
 */
public interface EcAppVersionService {

    /**
     * 通过ID查询单条数据
     *
     * @param appVersionId 主键
     * @return 实例对象
     */
    EcAppVersionEntity queryById(String appVersionId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<EcAppVersionEntity> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param ecAppVersion 实例对象
     * @return 实例对象
     */
    EcAppVersionEntity insert(EcAppVersionEntity ecAppVersion);

    /**
     * 修改数据
     *
     * @param ecAppVersion 实例对象
     * @return 实例对象
     */
    EcAppVersionEntity update(EcAppVersionEntity ecAppVersion);

    /**
     * 通过主键删除数据
     *
     * @param appVersionId 主键
     * @return 是否成功
     */
    boolean deleteById(String appVersionId);

}