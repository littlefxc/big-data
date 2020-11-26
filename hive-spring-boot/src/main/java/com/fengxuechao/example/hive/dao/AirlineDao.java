package com.fengxuechao.example.hive.dao;

import com.fengxuechao.example.hive.entity.Airline;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (Airline)表数据库访问层
 *
 * @author makejava
 * @since 2020-11-25 15:44:57
 */
@Repository
public interface AirlineDao {

    /**
     * 通过airlineid查询单条数据
     *
     * @param airlineid
     * @return 实例对象
     */
    Airline queryByAirlineId(@Param("airlineid") Long airlineid);

    List<Airline> queryAllByLimit(@Param("airline") Airline airline, @Param("offset") int offset, @Param("limit") int limit);

    void insertFromOutTableOn(@Param("year") String year);

    void deleteByFlightNum(@Param("flightnum") Integer flightnum);

    void update(@Param("airline") Airline airline);
}