package com.chinahandler.demo.chinahandlerdemo.app.service.impl;


import com.chinahandler.demo.chinahandlerdemo.app.entity.EcAppTokenEntity;
import com.chinahandler.demo.chinahandlerdemo.app.mapping.EcAppTokenMapper;
import com.chinahandler.demo.chinahandlerdemo.app.service.EcAppTokenService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (EcAppToken)表服务实现类
 *
 * @author makejava
 * @since 2021-01-13 16:56:56
 */
@Service("ecAppTokenService")
public class EcAppTokenServiceImpl implements EcAppTokenService {
    @Resource
    private EcAppTokenMapper ecAppTokenDao;

    /**
     * 通过ID查询单条数据
     *
     * @param appTokenId 主键
     * @return 实例对象
     */
    @Override
    public EcAppTokenEntity queryById(String appTokenId) {
        return this.ecAppTokenDao.queryById(appTokenId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<EcAppTokenEntity> queryAllByLimit(int offset, int limit) {
        return this.ecAppTokenDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param ecAppToken 实例对象
     * @return 实例对象
     */
    @Override
    public EcAppTokenEntity insert(EcAppTokenEntity ecAppToken) {
        this.ecAppTokenDao.insert(ecAppToken);
        return ecAppToken;
    }

    /**
     * 修改数据
     *
     * @param ecAppToken 实例对象
     * @return 实例对象
     */
    @Override
    public EcAppTokenEntity update(EcAppTokenEntity ecAppToken) {
        this.ecAppTokenDao.update(ecAppToken);
        return this.queryById(ecAppToken.getAppTokenId());
    }

    /**
     * 通过主键删除数据
     *
     * @param appTokenId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String appTokenId) {
        return this.ecAppTokenDao.deleteById(appTokenId) > 0;
    }
}