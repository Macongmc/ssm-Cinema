package com.ydlclass.service;

import com.ydlclass.entity.TRoom;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (TRoom)表服务接口
 *
 * @author makejava
 * @since 2022-04-20 19:27:15
 */
public interface TRoomService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TRoom queryById(Integer id);

    /**
     * 分页查询
     *
     * @param tRoom 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<TRoom> queryByPage(TRoom tRoom, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param tRoom 实例对象
     * @return 实例对象
     */
    TRoom insert(TRoom tRoom);

    /**
     * 修改数据
     *
     * @param tRoom 实例对象
     * @return 实例对象
     */
    TRoom update(TRoom tRoom);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
