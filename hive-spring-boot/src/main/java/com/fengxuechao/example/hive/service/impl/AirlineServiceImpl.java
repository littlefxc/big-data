package com.fengxuechao.example.hive.service.impl;

import com.fengxuechao.example.hive.dao.AirlineDao;
import com.fengxuechao.example.hive.entity.Airline;
import com.fengxuechao.example.hive.service.AirlineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (Airline)表服务实现类
 *
 * @author makejava
 * @since 2020-11-25 15:45:00
 */
@Service("airlineService")
public class AirlineServiceImpl implements AirlineService {

    @Autowired
    private AirlineDao airlineDao;

    /**
     * 通过ID查询单条数据
     *
     * @param airlineId 主键
     * @return 实例对象
     */
    @Override
    public Airline queryByAirlineId(Long airlineId) {
        return this.airlineDao.queryByAirlineId(airlineId);
    }

    /**
     * 通过实体作为筛选条件查询
     *
     * @param airline 实例对象
     * @param page
     * @param size
     * @return 对象列表
     */
    @Override
    public List<Airline> queryAll(Airline airline, int page, int size) {
        int offset = Math.max((page - 1) * size, 0);
        return this.airlineDao.queryAllByLimit(airline, offset, size);
    }

    @Override
    public void insertFromOutTableOn(String year) {
        this.airlineDao.insertFromOutTableOn(year);
    }

    @Override
    public void deleteByFlightNum(Integer flightnum) {
        this.airlineDao.deleteByFlightNum(flightnum);
    }

    @Override
    public void update(Airline airline) {
        this.airlineDao.update(airline);
    }
}