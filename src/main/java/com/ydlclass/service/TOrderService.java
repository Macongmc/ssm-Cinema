package com.ydlclass.service;

import com.ydlclass.entity.TOrder;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (TOrder)表服务接口
 *
 * @author makejava
 * @since 2022-04-20 19:27:15
 */
public interface TOrderService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TOrder queryById(Integer id);

    /**
     * 分页查询
     *
     * @param tOrder 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<TOrder> queryByPage(TOrder tOrder, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param tOrder 实例对象
     * @return 实例对象
     */
    TOrder insert(TOrder tOrder);

    /**
     * 修改数据
     *
     * @param tOrder 实例对象
     * @return 实例对象
     */
    TOrder update(TOrder tOrder);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
