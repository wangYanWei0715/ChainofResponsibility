package com.chinahandler.demo.chinahandlerdemo.app.service.impl;


import com.chinahandler.demo.chinahandlerdemo.app.entity.EcAppShareEntity;
import com.chinahandler.demo.chinahandlerdemo.app.mapping.EcAppShareMapper;
import com.chinahandler.demo.chinahandlerdemo.app.service.EcAppShareService;
import com.chinahandler.demo.chinahandlerdemo.chain.adapter.PerpareChainAdapter;
import com.chinahandler.demo.chinahandlerdemo.chain.common.result.PolymerizationResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (EcAppShare)表服务实现类
 *
 * @author makejava
 * @since 2021-01-13 16:10:04
 */
@Service("ecAppShareService")
public class EcAppShareServiceImpl implements EcAppShareService {
    @Resource
    private EcAppShareMapper ecAppShareDao;

    @Autowired
    private PerpareChainAdapter perpareChainAdapter;
    /**
     * 通过ID查询单条数据
     *
     * @param appShareId 主键
     * @return 实例对象
     */
    @Override
    public EcAppShareEntity queryById(String appShareId) {
        return this.ecAppShareDao.queryById(appShareId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<EcAppShareEntity> queryAllByLimit(int offset, int limit) {
        return this.ecAppShareDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param ecAppShare 实例对象
     * @return 实例对象
     */
    @Override
    public EcAppShareEntity insert(EcAppShareEntity ecAppShare) {
        this.ecAppShareDao.insert(ecAppShare);
        return ecAppShare;
    }

    /**
     * 修改数据
     *
     * @param ecAppShare 实例对象
     * @return 实例对象
     */
    @Override
    public EcAppShareEntity update(EcAppShareEntity ecAppShare) {
        this.ecAppShareDao.update(ecAppShare);
        return this.queryById(ecAppShare.getAppShareId());
    }

    /**
     * 通过主键删除数据
     *
     * @param appShareId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String appShareId) {
        return this.ecAppShareDao.deleteById(appShareId) > 0;
    }

    @Override
    public PolymerizationResult chainTest() {
        try {
            return perpareChainAdapter.handler();
        }catch (Exception e){
            e.printStackTrace();
            return new PolymerizationResult();
        }
    }
}