package org.keelic.carrier.service.impl;

import org.keelic.carrier.dao.SeckillDao;
import org.keelic.carrier.dao.SuccessKilledDao;
import org.keelic.carrier.dto.SeckillExecution;
import org.keelic.carrier.dto.UrlExposer;
import org.keelic.carrier.entity.Seckill;
import org.keelic.carrier.exception.RepeatSeckillException;
import org.keelic.carrier.exception.SeckillCloseException;
import org.keelic.carrier.exception.SeckillException;
import org.keelic.carrier.service.SeckillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author keelic 2018-04-07
 */
@Service("seckillService")
public class SeckillServiceImpl implements SeckillService {


    @Autowired
    private SeckillDao seckillDao;

    @Autowired
    private SuccessKilledDao successKilledDao;

    @Override
    public List<Seckill> getSeckillList() {
        return null;
    }

    @Override
    public Seckill getById(long seckillId) {
        return seckillDao.queryById(seckillId);
    }

    @Override
    public UrlExposer exportSeckillUrl(long seckillId) {
        return null;
    }

    @Override
    public SeckillExecution executeSeckill(long seckillId, long userPhone, String md5) throws RepeatSeckillException, SeckillCloseException, SeckillException {
        return null;
    }
}
