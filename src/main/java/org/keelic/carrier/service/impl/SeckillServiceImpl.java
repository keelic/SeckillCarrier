package org.keelic.carrier.service.impl;

import org.keelic.carrier.dao.SeckillDao;
import org.keelic.carrier.entity.Seckill;
import org.keelic.carrier.service.SeckillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author keelic 2018-04-07
 */
@Service("seckillService")
public class SeckillServiceImpl implements SeckillService {


    @Autowired
    private SeckillDao seckillDao;

    @Override
    public Seckill getById(long seckillId) {
        return seckillDao.queryById(seckillId);
    }
}
