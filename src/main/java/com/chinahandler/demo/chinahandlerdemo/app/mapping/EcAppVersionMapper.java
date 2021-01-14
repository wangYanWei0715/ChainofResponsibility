package com.chinahandler.demo.chinahandlerdemo.app.mapping;

import com.chinahandler.demo.chinahandlerdemo.app.entity.EcAppVersionEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (EcAppVersion)表数据库访问层
 *
 * @author makejava
 * @since 2021-01-13 16:57:12
 */
@Mapper
@Repository
public interface EcAppVersionMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param appVersionId 主键
     * @return 实例对象
     */
    EcAppVersionEntity queryById(String appVersionId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<EcAppVersionEntity> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param ecAppVersion 实例对象
     * @return 对象列表
     */
    List<EcAppVersionEntity> queryAll(EcAppVersionEntity ecAppVersion);

    /**
     * 新增数据
     *
     * @param ecAppVersion 实例对象
     * @return 影响行数
     */
    int insert(EcAppVersionEntity ecAppVersion);

    /**
     * 修改数据
     *
     * @param ecAppVersion 实例对象
     * @return 影响行数
     */
    int update(EcAppVersionEntity ecAppVersion);

    /**
     * 通过主键删除数据
     *
     * @param appVersionId 主键
     * @return 影响行数
     */
    int deleteById(String appVersionId);

}