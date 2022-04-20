package com.ydlclass.controller;

import com.ydlclass.entity.TOrder;
import com.ydlclass.service.TOrderService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TOrder)表控制层
 *
 * @author makejava
 * @since 2022-04-20 19:27:15
 */
@RestController
@RequestMapping("tOrder")
public class TOrderController {
    /**
     * 服务对象
     */
    @Resource
    private TOrderService tOrderService;

    /**
     * 分页查询
     *
     * @param tOrder 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<TOrder>> queryByPage(TOrder tOrder, PageRequest pageRequest) {
        return ResponseEntity.ok(this.tOrderService.queryByPage(tOrder, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<TOrder> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.tOrderService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param tOrder 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<TOrder> add(TOrder tOrder) {
        return ResponseEntity.ok(this.tOrderService.insert(tOrder));
    }

    /**
     * 编辑数据
     *
     * @param tOrder 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<TOrder> edit(TOrder tOrder) {
        return ResponseEntity.ok(this.tOrderService.update(tOrder));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.tOrderService.deleteById(id));
    }

}

