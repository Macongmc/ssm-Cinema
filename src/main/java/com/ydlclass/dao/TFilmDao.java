package com.ydlclass.dao;

import com.ydlclass.entity.TFilm;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (TFilm)表数据库访问层
 *
 * @author makejava
 * @since 2022-04-20 19:27:15
 */
public interface TFilmDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TFilm queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param tFilm 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<TFilm> queryAllByLimit(TFilm tFilm, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param tFilm 查询条件
     * @return 总行数
     */
    long count(TFilm tFilm);

    /**
     * 新增数据
     *
     * @param tFilm 实例对象
     * @return 影响行数
     */
    int insert(TFilm tFilm);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<TFilm> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<TFilm> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<TFilm> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<TFilm> entities);

    /**
     * 修改数据
     *
     * @param tFilm 实例对象
     * @return 影响行数
     */
    int update(TFilm tFilm);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

