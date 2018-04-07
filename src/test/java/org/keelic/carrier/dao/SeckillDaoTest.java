package org.keelic.carrier.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.keelic.carrier.entity.Seckill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Spring JUnit4单元测试
 *
 * @author keelic 2018-04-07
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:spring/spring-dao.xml"})
public class SeckillDaoTest {

    @Autowired
    private SeckillDao seckillDao;

    @Test
    public void queryById() {

        Seckill seckill = seckillDao.queryById(1001);
        System.out.println(seckill);

    }

    @Test
    public void queryAll() {
    }

    @Test
    public void reduceNumber() {
    }
}