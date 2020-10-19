package com.fengxuechao.example.hive.dao;

import com.fengxuechao.example.hive.entity.CapacityStatsLiveAccess;

/**
 * @author fengxuechao
 * @date 2020/10/14
 */
public interface CapacityStatsLiveAccessDao {

    CapacityStatsLiveAccess findOne(Long id);

    CapacityStatsLiveAccess findAll();

    void saveFile(String filepath);

    CapacityStatsLiveAccess save(CapacityStatsLiveAccess access);

    CapacityStatsLiveAccess update(Long id, CapacityStatsLiveAccess access);

    CapacityStatsLiveAccess delete(Long id);

}
