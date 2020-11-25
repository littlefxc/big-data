package com.fengxuechao.example.hive.service;

import com.fengxuechao.example.hive.entity.Airline;

import java.util.List;

/**
 * (Airline)表服务接口
 *
 * @author makejava
 * @since 2020-11-25 15:44:58
 */
public interface AirlineService {

    /**
     * 通过ID查询单条数据
     *
     * @param airlineId 主键
     * @return 实例对象
     */
    Airline queryByAirlineId(Long airlineId);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param airline 实例对象
     * @return 对象列表
     */
    List<Airline> queryAll(Airline airline, int page, int size);

    /**
     * 新增数据
     *
     * @param airline 实例对象
     * @return 实例对象
     */
    Airline insert(Airline airline);

    void insertFromOutTableOn(String year);

    void deleteByFlightNum(Integer flightnum);

    void update(Airline airline);
}