package com.chinahandler.demo.chinahandlerdemo.user.service;

import com.chinahandler.demo.chinahandlerdemo.user.entity.CrmTUserLoginEntity;

import java.util.List;

/**
 * (CrmTUserLogin)表服务接口
 *
 * @author makejava
 * @since 2021-01-13 15:57:56
 */
public interface CrmTUserLoginService {

    /**
     * 通过ID查询单条数据
     *
     * @param rowId 主键
     * @return 实例对象
     */
    CrmTUserLoginEntity queryById(String rowId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<CrmTUserLoginEntity> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param crmTUserLogin 实例对象
     * @return 实例对象
     */
    CrmTUserLoginEntity insert(CrmTUserLoginEntity crmTUserLogin);

    /**
     * 修改数据
     *
     * @param crmTUserLogin 实例对象
     * @return 实例对象
     */
    CrmTUserLoginEntity update(CrmTUserLoginEntity crmTUserLogin);

    /**
     * 通过主键删除数据
     *
     * @param rowId 主键
     * @return 是否成功
     */
    boolean deleteById(String rowId);

}