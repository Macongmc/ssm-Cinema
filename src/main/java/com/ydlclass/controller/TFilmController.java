package com.ydlclass.controller;

import com.ydlclass.entity.TFilm;
import com.ydlclass.service.TFilmService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TFilm)表控制层
 *
 * @author makejava
 * @since 2022-04-20 19:27:15
 */
@RestController
@RequestMapping("tFilm")
public class TFilmController {
    /**
     * 服务对象
     */
    @Resource
    private TFilmService tFilmService;

    /**
     * 分页查询
     *
     * @param tFilm 筛选条件
     * @param page
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<TFilm>> queryByPage(TFilm tFilm, int page) {
        return ResponseEntity.ok(this.tFilmService.queryByPage(tFilm, PageRequest.of(page,3)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<TFilm> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.tFilmService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param tFilm 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<TFilm> add(TFilm tFilm) {
        return ResponseEntity.ok(this.tFilmService.insert(tFilm));
    }

    /**
     * 编辑数据
     *
     * @param tFilm 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<TFilm> edit(TFilm tFilm) {
        return ResponseEntity.ok(this.tFilmService.update(tFilm));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.tFilmService.deleteById(id));
    }

}

