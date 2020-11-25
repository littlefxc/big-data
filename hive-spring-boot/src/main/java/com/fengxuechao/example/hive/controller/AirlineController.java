package com.fengxuechao.example.hive.controller;

import com.fengxuechao.example.hive.entity.Airline;
import com.fengxuechao.example.hive.service.AirlineService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * (Airline)表控制层
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

}