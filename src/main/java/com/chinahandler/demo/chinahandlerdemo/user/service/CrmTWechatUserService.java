package com.chinahandler.demo.chinahandlerdemo.user.service;

import com.chinahandler.demo.chinahandlerdemo.user.entity.CrmTWechatUserEntity;

import java.util.List;

/**
 * (CrmTWechatUser)表服务接口
 *
 * @author makejava
 * @since 2021-01-13 16:03:41
 */
public interface CrmTWechatUserService {

    /**
     * 通过ID查询单条数据
     *
     * @param userId 主键
     * @return 实例对象
     */
    CrmTWechatUserEntity queryById(String userId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<CrmTWechatUserEntity> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param crmTWechatUser 实例对象
     * @return 实例对象
     */
    CrmTWechatUserEntity insert(CrmTWechatUserEntity crmTWechatUser);

    /**
     * 修改数据
     *
     * @param crmTWechatUser 实例对象
     * @return 实例对象
     */
    CrmTWechatUserEntity update(CrmTWechatUserEntity crmTWechatUser);

    /**
     * 通过主键删除数据
     *
     * @param userId 主键
     * @return 是否成功
     */
    boolean deleteById(String userId);

}