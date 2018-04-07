package org.keelic.carrier.service;

import org.keelic.carrier.entity.Seckill;

/**
 * 秒杀接口
 *
 * @author keelic 2018-04-07
 */
public interface SeckillService {

    /**
     * 依据id获取秒杀商品
     */
    Seckill getById(long seckillId);

}
