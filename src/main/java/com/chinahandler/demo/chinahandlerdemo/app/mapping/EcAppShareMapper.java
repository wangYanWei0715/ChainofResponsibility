package com.chinahandler.demo.chinahandlerdemo.app.mapping;

import com.chinahandler.demo.chinahandlerdemo.app.entity.EcAppShareEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (EcAppShare)表数据库访问层
 *
 * @author makejava
 * @since 2021-01-13 16:10:02
 */
@Mapper
@Repository
public interface EcAppShareMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param appShareId 主键
     * @return 实例对象
     */
    EcAppShareEntity queryById(String appShareId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<EcAppShareEntity> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param ecAppShare 实例对象
     * @return 对象列表
     */
    List<EcAppShareEntity> queryAll(EcAppShareEntity ecAppShare);

    /**
     * 新增数据
     *
     * @param ecAppShare 实例对象
     * @return 影响行数
     */
    int insert(EcAppShareEntity ecAppShare);

    /**
     * 修改数据
     *
     * @param ecAppShare 实例对象
     * @return 影响行数
     */
    int update(EcAppShareEntity ecAppShare);

    /**
     * 通过主键删除数据
     *
     * @param appShareId 主键
     * @return 影响行数
     */
    int deleteById(String appShareId);

}