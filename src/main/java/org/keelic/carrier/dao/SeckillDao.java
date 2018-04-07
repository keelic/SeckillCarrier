package org.keelic.carrier.dao;

import org.apache.ibatis.annotations.Param;
import org.keelic.carrier.entity.Seckill;

/**
 * @author keelic 2018-04-07
 */
public interface SeckillDao {

    /**
     * 根据id查询秒杀的商品信息
     *
     * @param seckillId
     * @return
     */
    Seckill queryById(@Param("seckillId") long seckillId);

}
