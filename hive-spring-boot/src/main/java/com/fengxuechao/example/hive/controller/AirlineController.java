package com.fengxuechao.example.hive.controller;

import com.fengxuechao.example.hive.entity.Airline;
import com.fengxuechao.example.hive.service.AirlineService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * (Airline)表控制层，关于 hive-jdbc 的 CRUD.
 *
 * @author makejava
 * @since 2020-11-25 15:46:23
 */
@Api
@RestController
public class AirlineController {
    /**
     * 服务对象
     */
    @Autowired
    private AirlineService airlineService;

    /**
     * 根据条件查询航班信息
     *
     * @param airline
     * @return 实例对象
     */
    @ApiOperation(value = "根据条件查询航班信息")
    @GetMapping("/airline")
    public List<Airline> queryAll(Airline airline,
                                  @RequestParam(defaultValue = "1") int page,
                                  @RequestParam(defaultValue = "10") int size) {
        return this.airlineService.queryAll(airline, page, size);
    }

    /**
     * 导入外部表数据
     *
     * @param year
     * @return 实例对象
     */
    @ApiOperation(value = "导入外部表数据")
    @GetMapping("/airline/load")
    public void load(String year) {
        this.airlineService.insertFromOutTableOn(year);
    }

    /**
     * 根据航班号删除数据
     *
     * @param flightnum
     */
    @ApiOperation(value = "根据航班号删除数据")
    @DeleteMapping("/airline")
    public void deleteByFlightNum(Integer flightnum) {
        this.airlineService.deleteByFlightNum(flightnum);
    }

    /**
     * 根据航班号修改数据
     * 修改时，不能修改分区字段，否则会报以下错误：
     * FAILED: SemanticException [Error 10292]: Updating values of partition columns is not supported
     *
     * @param airline
     */
    @ApiOperation(value = "根据航班号修改数据", notes = "flightdate 是分区字段，无法修改")
    @PutMapping("/airline")
    public void updateByFlightNum(@RequestParam Integer flightnum, Airline airline) {
        airline.setFlightnum(flightnum);
        this.airlineService.update(airline);
    }

    /**
     * 新增数据
     *
     * @param airline
     */
    @ApiOperation(value = "新增数据")
    @PostMapping("/airline")
    public void insert(Airline airline) {
        this.airlineService.insert(airline);
    }

}