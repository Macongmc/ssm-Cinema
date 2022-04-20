package com.ydlclass.service.impl;

import com.ydlclass.entity.TRoom;
import com.ydlclass.dao.TRoomDao;
import com.ydlclass.service.TRoomService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (TRoom)表服务实现类
 *
 * @author makejava
 * @since 2022-04-20 19:27:15
 */
@Service("tRoomService")
public class TRoomServiceImpl implements TRoomService {
    @Resource
    private TRoomDao tRoomDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TRoom queryById(Integer id) {
        return this.tRoomDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param tRoom 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<TRoom> queryByPage(TRoom tRoom, PageRequest pageRequest) {
        long total = this.tRoomDao.count(tRoom);
        return new PageImpl<>(this.tRoomDao.queryAllByLimit(tRoom, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param tRoom 实例对象
     * @return 实例对象
     */
    @Override
    public TRoom insert(TRoom tRoom) {
        this.tRoomDao.insert(tRoom);
        return tRoom;
    }

    /**
     * 修改数据
     *
     * @param tRoom 实例对象
     * @return 实例对象
     */
    @Override
    public TRoom update(TRoom tRoom) {
        this.tRoomDao.update(tRoom);
        return this.queryById(tRoom.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.tRoomDao.deleteById(id) > 0;
    }
}
