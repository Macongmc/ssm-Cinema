package com.ydlclass.dao;

import com.ydlclass.entity.TRecord;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (TRecord)表数据库访问层
 *
 * @author makejava
 * @since 2022-04-20 19:27:15
 */
public interface TRecordDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TRecord queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param tRecord 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<TRecord> queryAllByLimit(TRecord tRecord, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param tRecord 查询条件
     * @return 总行数
     */
    long count(TRecord tRecord);

    /**
     * 新增数据
     *
     * @param tRecord 实例对象
     * @return 影响行数
     */
    int insert(TRecord tRecord);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<TRecord> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<TRecord> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<TRecord> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<TRecord> entities);

    /**
     * 修改数据
     *
     * @param tRecord 实例对象
     * @return 影响行数
     */
    int update(TRecord tRecord);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

