package com.ydlclass.service;

import com.ydlclass.entity.TFilm;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (TFilm)表服务接口
 *
 * @author makejava
 * @since 2022-04-20 19:27:15
 */
public interface TFilmService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TFilm queryById(Integer id);

    /**
     * 分页查询
     *
     * @param tFilm 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<TFilm> queryByPage(TFilm tFilm, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param tFilm 实例对象
     * @return 实例对象
     */
    TFilm insert(TFilm tFilm);

    /**
     * 修改数据
     *
     * @param tFilm 实例对象
     * @return 实例对象
     */
    TFilm update(TFilm tFilm);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
