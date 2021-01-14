package com.chinahandler.demo.chinahandlerdemo.app.mapping;

import com.chinahandler.demo.chinahandlerdemo.app.entity.EcAppTokenEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (EcAppToken)表数据库访问层
 *
 * @author makejava
 * @since 2021-01-13 16:56:56
 */
@Mapper
@Repository
public interface EcAppTokenMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param appTokenId 主键
     * @return 实例对象
     */
    EcAppTokenEntity queryById(String appTokenId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<EcAppTokenEntity> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param ecAppToken 实例对象
     * @return 对象列表
     */
    List<EcAppTokenEntity> queryAll(EcAppTokenEntity ecAppToken);

    /**
     * 新增数据
     *
     * @param ecAppToken 实例对象
     * @return 影响行数
     */
    int insert(EcAppTokenEntity ecAppToken);

    /**
     * 修改数据
     *
     * @param ecAppToken 实例对象
     * @return 影响行数
     */
    int update(EcAppTokenEntity ecAppToken);

    /**
     * 通过主键删除数据
     *
     * @param appTokenId 主键
     * @return 影响行数
     */
    int deleteById(String appTokenId);

}