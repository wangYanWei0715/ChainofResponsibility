package com.chinahandler.demo.chinahandlerdemo.user.mapping;

import com.chinahandler.demo.chinahandlerdemo.user.entity.CrmTUserLoginEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (CrmTUserLogin)表数据库访问层
 *
 * @author makejava
 * @since 2021-01-13 15:57:55
 */
@Mapper
@Repository
public interface CrmTUserLoginMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param rowId 主键
     * @return 实例对象
     */
    CrmTUserLoginEntity queryById(String rowId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<CrmTUserLoginEntity> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param crmTUserLogin 实例对象
     * @return 对象列表
     */
    List<CrmTUserLoginEntity> queryAll(CrmTUserLoginEntity crmTUserLogin);

    /**
     * 新增数据
     *
     * @param crmTUserLogin 实例对象
     * @return 影响行数
     */
    int insert(CrmTUserLoginEntity crmTUserLogin);

    /**
     * 修改数据
     *
     * @param crmTUserLogin 实例对象
     * @return 影响行数
     */
    int update(CrmTUserLoginEntity crmTUserLogin);

    /**
     * 通过主键删除数据
     *
     * @param rowId 主键
     * @return 影响行数
     */
    int deleteById(String rowId);

}