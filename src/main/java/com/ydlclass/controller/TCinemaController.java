package com.ydlclass.controller;

import com.ydlclass.entity.TCinema;
import com.ydlclass.service.TCinemaService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TCinema)表控制层
 *
 * @author makejava
 * @since 2022-04-20 19:27:06
 */
@RestController
@RequestMapping("tCinema")
public class TCinemaController {
    /**
     * 服务对象
     */
    @Resource
    private TCinemaService tCinemaService;

    /**
     * 分页查询
     *
     * @param tCinema 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<TCinema>> queryByPage(TCinema tCinema, PageRequest pageRequest) {
        return ResponseEntity.ok(this.tCinemaService.queryByPage(tCinema, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<TCinema> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.tCinemaService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param tCinema 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<TCinema> add(TCinema tCinema) {
        return ResponseEntity.ok(this.tCinemaService.insert(tCinema));
    }

    /**
     * 编辑数据
     *
     * @param tCinema 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<TCinema> edit(TCinema tCinema) {
        return ResponseEntity.ok(this.tCinemaService.update(tCinema));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.tCinemaService.deleteById(id));
    }

}

