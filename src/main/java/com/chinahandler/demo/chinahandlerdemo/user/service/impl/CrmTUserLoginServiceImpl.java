package com.chinahandler.demo.chinahandlerdemo.user.service.impl;


import com.chinahandler.demo.chinahandlerdemo.user.entity.CrmTUserLoginEntity;
import com.chinahandler.demo.chinahandlerdemo.user.mapping.CrmTUserLoginMapper;
import com.chinahandler.demo.chinahandlerdemo.user.service.CrmTUserLoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (CrmTUserLogin)表服务实现类
 *
 * @author makejava
 * @since 2021-01-13 15:57:56
 */
@Service("crmTUserLoginService")
public class CrmTUserLoginServiceImpl implements CrmTUserLoginService {
    @Resource
    private CrmTUserLoginMapper crmTUserLoginDao;

    /**
     * 通过ID查询单条数据
     *
     * @param rowId 主键
     * @return 实例对象
     */
    @Override
    public CrmTUserLoginEntity queryById(String rowId) {
        return this.crmTUserLoginDao.queryById(rowId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<CrmTUserLoginEntity> queryAllByLimit(int offset, int limit) {
        return this.crmTUserLoginDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param crmTUserLogin 实例对象
     * @return 实例对象
     */
    @Override
    public CrmTUserLoginEntity insert(CrmTUserLoginEntity crmTUserLogin) {
        this.crmTUserLoginDao.insert(crmTUserLogin);
        return crmTUserLogin;
    }

    /**
     * 修改数据
     *
     * @param crmTUserLogin 实例对象
     * @return 实例对象
     */
    @Override
    public CrmTUserLoginEntity update(CrmTUserLoginEntity crmTUserLogin) {
        this.crmTUserLoginDao.update(crmTUserLogin);
        return this.queryById(crmTUserLogin.getRowId());
    }

    /**
     * 通过主键删除数据
     *
     * @param rowId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String rowId) {
        return this.crmTUserLoginDao.deleteById(rowId) > 0;
    }
}