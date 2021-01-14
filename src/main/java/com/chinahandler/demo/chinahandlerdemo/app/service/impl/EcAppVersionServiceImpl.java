package com.chinahandler.demo.chinahandlerdemo.app.service.impl;

import com.chinahandler.demo.chinahandlerdemo.app.entity.EcAppVersionEntity;
import com.chinahandler.demo.chinahandlerdemo.app.mapping.EcAppVersionMapper;
import com.chinahandler.demo.chinahandlerdemo.app.service.EcAppVersionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (EcAppVersion)表服务实现类
 *
 * @author makejava
 * @since 2021-01-13 16:57:12
 */
@Service("ecAppVersionService")
public class EcAppVersionServiceImpl implements EcAppVersionService {
    @Resource
    private EcAppVersionMapper ecAppVersionDao;

    /**
     * 通过ID查询单条数据
     *
     * @param appVersionId 主键
     * @return 实例对象
     */
    @Override
    public EcAppVersionEntity queryById(String appVersionId) {
        return this.ecAppVersionDao.queryById(appVersionId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<EcAppVersionEntity> queryAllByLimit(int offset, int limit) {
        return this.ecAppVersionDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param ecAppVersion 实例对象
     * @return 实例对象
     */
    @Override
    public EcAppVersionEntity insert(EcAppVersionEntity ecAppVersion) {
        this.ecAppVersionDao.insert(ecAppVersion);
        return ecAppVersion;
    }

    /**
     * 修改数据
     *
     * @param ecAppVersion 实例对象
     * @return 实例对象
     */
    @Override
    public EcAppVersionEntity update(EcAppVersionEntity ecAppVersion) {
        this.ecAppVersionDao.update(ecAppVersion);
        return this.queryById(ecAppVersion.getAppVersionId());
    }

    /**
     * 通过主键删除数据
     *
     * @param appVersionId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String appVersionId) {
        return this.ecAppVersionDao.deleteById(appVersionId) > 0;
    }
}