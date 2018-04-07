package org.keelic.carrier.service;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.keelic.carrier.entity.Seckill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @author keelic 2018-04-07
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:spring/spring-dao.xml","classpath*:spring/spring-service.xml"})
public class SeckillServiceTest {

    @Autowired
    private SeckillService seckillService;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getSeckillList() {
    }

    @Test
    public void getById() {
        Seckill seckill = seckillService.getById(1001);
        System.out.println(seckill);
    }

    @Test
    public void exportSeckillUrl() {
    }

    @Test
    public void executeSeckill() {
    }
}