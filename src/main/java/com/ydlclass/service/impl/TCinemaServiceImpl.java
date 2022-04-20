package com.ydlclass.service.impl;

import com.ydlclass.entity.TCinema;
import com.ydlclass.dao.TCinemaDao;
import com.ydlclass.service.TCinemaService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (TCinema)表服务实现类
 *
 * @author makejava
 * @since 2022-04-20 19:27:13
 */
@Service("tCinemaService")
public class TCinemaServiceImpl implements TCinemaService {
    @Resource
    private TCinemaDao tCinemaDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TCinema queryById(Integer id) {
        return this.tCinemaDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param tCinema 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<TCinema> queryByPage(TCinema tCinema, PageRequest pageRequest) {
        long total = this.tCinemaDao.count(tCinema);
        return new PageImpl<>(this.tCinemaDao.queryAllByLimit(tCinema, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param tCinema 实例对象
     * @return 实例对象
     */
    @Override
    public TCinema insert(TCinema tCinema) {
        this.tCinemaDao.insert(tCinema);
        return tCinema;
    }

    /**
     * 修改数据
     *
     * @param tCinema 实例对象
     * @return 实例对象
     */
    @Override
    public TCinema update(TCinema tCinema) {
        this.tCinemaDao.update(tCinema);
        return this.queryById(tCinema.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.tCinemaDao.deleteById(id) > 0;
    }
}
