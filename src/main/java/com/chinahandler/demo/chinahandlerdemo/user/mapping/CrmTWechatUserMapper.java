package com.chinahandler.demo.chinahandlerdemo.user.mapping;

import com.chinahandler.demo.chinahandlerdemo.user.entity.CrmTWechatUserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (CrmTWechatUser)表数据库访问层
 *
 * @author makejava
 * @since 2021-01-13 16:03:41
 */
@Mapper
@Repository
public interface CrmTWechatUserMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param userId 主键
     * @return 实例对象
     */
    CrmTWechatUserEntity queryById(String userId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<CrmTWechatUserEntity> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param crmTWechatUser 实例对象
     * @return 对象列表
     */
    List<CrmTWechatUserEntity> queryAll(CrmTWechatUserEntity crmTWechatUser);

    /**
     * 新增数据
     *
     * @param crmTWechatUser 实例对象
     * @return 影响行数
     */
    int insert(CrmTWechatUserEntity crmTWechatUser);

    /**
     * 修改数据
     *
     * @param crmTWechatUser 实例对象
     * @return 影响行数
     */
    int update(CrmTWechatUserEntity crmTWechatUser);

    /**
     * 通过主键删除数据
     *
     * @param userId 主键
     * @return 影响行数
     */
    int deleteById(String userId);

}