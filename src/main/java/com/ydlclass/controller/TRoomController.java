package com.ydlclass.controller;

import com.ydlclass.entity.TRoom;
import com.ydlclass.service.TRoomService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TRoom)表控制层
 *
 * @author makejava
 * @since 2022-04-20 19:27:15
 */
@RestController
@RequestMapping("tRoom")
public class TRoomController {
    /**
     * 服务对象
     */
    @Resource
    private TRoomService tRoomService;

    /**
     * 分页查询
     *
     * @param tRoom 筛选条件
     * @param
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<TRoom>> queryByPage(TRoom tRoom, int page) {
        return ResponseEntity.ok(this.tRoomService.queryByPage(tRoom, PageRequest.of(page,3)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<TRoom> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.tRoomService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param tRoom 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<TRoom> add(TRoom tRoom) {
        return ResponseEntity.ok(this.tRoomService.insert(tRoom));
    }

    /**
     * 编辑数据
     *
     * @param tRoom 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<TRoom> edit(TRoom tRoom) {
        return ResponseEntity.ok(this.tRoomService.update(tRoom));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.tRoomService.deleteById(id));
    }

}

