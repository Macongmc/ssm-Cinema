package com.ydlclass.service;

import com.ydlclass.entity.TRecord;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (TRecord)表服务接口
 *
 * @author makejava
 * @since 2022-04-20 19:27:15
 */
public interface TRecordService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TRecord queryById(Integer id);

    /**
     * 分页查询
     *
     * @param tRecord 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<TRecord> queryByPage(TRecord tRecord, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param tRecord 实例对象
     * @return 实例对象
     */
    TRecord insert(TRecord tRecord);

    /**
     * 修改数据
     *
     * @param tRecord 实例对象
     * @return 实例对象
     */
    TRecord update(TRecord tRecord);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
