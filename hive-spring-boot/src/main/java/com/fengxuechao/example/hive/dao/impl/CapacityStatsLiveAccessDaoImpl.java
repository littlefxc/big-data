/*
 * 版权所有: 爱WiFi无线运营中心
 * 创建日期: 2020/10/14
 * 创建作者: 冯雪超
 * 文件名称: CapacityStatsLiveAccessDaoImpl.java
 * 版本: v1.0
 * 功能:
 * 修改记录：
 */
package com.fengxuechao.example.hive.dao.impl;

import com.fengxuechao.example.hive.dao.CapacityStatsLiveAccessDao;
import com.fengxuechao.example.hive.entity.CapacityStatsLiveAccess;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author fengxuechao
 * @date 2020/10/14
 */
@Slf4j
@Repository
public class CapacityStatsLiveAccessDaoImpl implements CapacityStatsLiveAccessDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public CapacityStatsLiveAccess findOne(Long id) {
        String sql = "select * capacity_stats_live_access where id = ? limit 1";
        List<CapacityStatsLiveAccess> result = jdbcTemplate.query(sql, new CapacityStatsLiveAccess(), id);
        log.info("Load data into table successfully...");
        return result.get(0);
    }

    @Override
    public CapacityStatsLiveAccess findAll() {
        return null;
    }

    @Override
    public void saveFile(String filepath) {
        String format = "load data local inpath '%s' into table capacity_stats_live_access";
        String sql = String.format(format, filepath);
        jdbcTemplate.execute(sql);
        log.info("Load data into table successfully...");
    }

    @Override
    public CapacityStatsLiveAccess save(CapacityStatsLiveAccess access) {
        jdbcTemplate.update("INSERT INTO `awifi_capacity`.`capacity_stats_live_access`(`id`, `device_num`, `start_time`, `finish_time`, `duration`, `response`) VALUES (1, '33010600001327774701', '2020-07-22 09:55:57', '2020-07-22 09:55:57', 1595382957736, 1)");
        return null;
    }

    @Override
    public CapacityStatsLiveAccess update(Long id, CapacityStatsLiveAccess access) {
        return null;
    }

    @Override
    public CapacityStatsLiveAccess delete(Long id) {
        return null;
    }
}
