package com.ydlclass.service.impl;

import com.ydlclass.entity.TFilm;
import com.ydlclass.dao.TFilmDao;
import com.ydlclass.service.TFilmService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (TFilm)表服务实现类
 *
 * @author makejava
 * @since 2022-04-20 19:27:15
 */
@Service("tFilmService")
public class TFilmServiceImpl implements TFilmService {
    @Resource
    private TFilmDao tFilmDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TFilm queryById(Integer id) {
        return this.tFilmDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param tFilm 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<TFilm> queryByPage(TFilm tFilm, PageRequest pageRequest) {
        long total = this.tFilmDao.count(tFilm);
        return new PageImpl<>(this.tFilmDao.queryAllByLimit(tFilm, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param tFilm 实例对象
     * @return 实例对象
     */
    @Override
    public TFilm insert(TFilm tFilm) {
        this.tFilmDao.insert(tFilm);
        return tFilm;
    }

    /**
     * 修改数据
     *
     * @param tFilm 实例对象
     * @return 实例对象
     */
    @Override
    public TFilm update(TFilm tFilm) {
        this.tFilmDao.update(tFilm);
        return this.queryById(tFilm.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.tFilmDao.deleteById(id) > 0;
    }
}
