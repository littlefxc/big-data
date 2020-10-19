package com.fengxuechao.example.hive.dao.impl;

import com.fengxuechao.example.hive.dao.CapacityStatsLiveAccessDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author fengxuechao
 * @date 2020/10/14
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CapacityStatsLiveAccessDaoImplTest {

    @Autowired
    private CapacityStatsLiveAccessDao dao;

    @Test
    public void findOne() {
    }

    @Test
    public void findAll() {
    }

    @Test
    public void save() {
        dao.saveFile("");
    }

    @Test
    public void update() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void testSave() {
    }
}