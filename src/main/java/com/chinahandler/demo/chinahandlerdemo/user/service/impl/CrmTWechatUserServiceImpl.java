package com.chinahandler.demo.chinahandlerdemo.user.service.impl;



import com.chinahandler.demo.chinahandlerdemo.user.entity.CrmTWechatUserEntity;
import com.chinahandler.demo.chinahandlerdemo.user.mapping.CrmTWechatUserMapper;
import com.chinahandler.demo.chinahandlerdemo.user.service.CrmTWechatUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (CrmTWechatUser)表服务实现类
 *
 * @author makejava
 * @since 2021-01-13 16:03:41
 */
@Service("crmTWechatUserService")
public class CrmTWechatUserServiceImpl implements CrmTWechatUserService {
    @Resource
    private CrmTWechatUserMapper crmTWechatUserDao;

    /**
     * 通过ID查询单条数据
     *
     * @param userId 主键
     * @return 实例对象
     */
    @Override
    public CrmTWechatUserEntity queryById(String userId) {
        return this.crmTWechatUserDao.queryById(userId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<CrmTWechatUserEntity> queryAllByLimit(int offset, int limit) {
        return this.crmTWechatUserDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param crmTWechatUser 实例对象
     * @return 实例对象
     */
    @Override
    public CrmTWechatUserEntity insert(CrmTWechatUserEntity crmTWechatUser) {
        this.crmTWechatUserDao.insert(crmTWechatUser);
        return crmTWechatUser;
    }

    /**
     * 修改数据
     *
     * @param crmTWechatUser 实例对象
     * @return 实例对象
     */
    @Override
    public CrmTWechatUserEntity update(CrmTWechatUserEntity crmTWechatUser) {
        this.crmTWechatUserDao.update(crmTWechatUser);
        return this.queryById(crmTWechatUser.getUserId());
    }

    /**
     * 通过主键删除数据
     *
     * @param userId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String userId) {
        return this.crmTWechatUserDao.deleteById(userId) > 0;
    }
}