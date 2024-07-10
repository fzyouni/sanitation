package com.iben.sanitation.controller;

import com.iben.sanitation.services.impl.RoadWorkService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 环卫道路作业接口
 *
 * @author fangzhuo
 * @version 1.0.0
 * @since 2024/07/04 17:57
 */
@RestController
@RequestMapping("sanitation/roadWork")
public class RoadWorkController {

    @Resource
    RoadWorkService roadWorkService;

    /**
     * 道路作业添加
     */
    @PostMapping
    public void addRoadWork() {

    }

    /**
     * 道路作业列表
     */
    @GetMapping
    public void getRoadWork() {

    }

    /**
     * 道路作业详情
     */
    @GetMapping("{workId}")
    public void getRoadWorkDetail(@PathVariable Integer workId) {

    }

    /**
     * 道路作业删除
     */
    @DeleteMapping("{workId}")
    public void deleteRoadWork(@PathVariable Integer workId) {

    }

    /**
     * 道路作业修改
     */
    @PutMapping("{workId}")
    public void modifyRoadWork(@PathVariable Integer workId) {

    }

    /**
     * 道路作业绑定车辆
     */
    @PostMapping("{workId}/bind")
    public void bindCar(@PathVariable Integer workId) {

    }

    /**
     * 道路作业状态列表
     */
    @GetMapping("roadWorkState")
    public void listRoadWorkState() {

    }

    /**
     * 道路作业实时状态
     */
    @GetMapping("roadWorkState/{workId}")
    public void getRoadWorkState(@PathVariable Integer workId) {

    }
}
