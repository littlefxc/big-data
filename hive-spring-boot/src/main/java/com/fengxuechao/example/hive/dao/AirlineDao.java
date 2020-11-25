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
     * 通过ID查询单条数据
     *
     * @param airlineId 主键
     * @return 实例对象
     */
    Airline queryByAirlineId(Long airlineId);

    /**
     * 新增数据
     *
     * @param airline 实例对象
     * @return 影响行数
     */
    int insert(Airline airline);

    List<Airline> queryAllByLimit(@Param("airline") Airline airline, @Param("offset") int offset, @Param("limit") int limit);

    void insertFromOutTableOn(String year);

    void deleteByFlightNum(Integer flightnum);

    void update(Airline airline);
}