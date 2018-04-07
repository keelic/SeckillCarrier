package org.keelic.carrier.dao;

import org.apache.ibatis.annotations.Param;
import org.keelic.carrier.entity.Seckill;

import java.util.Date;
import java.util.List;

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

    /**
     * 根据偏移量查询秒杀商品列表
     * @param offset
     * @param limit
     * @return
     */
    List<Seckill> queryAll(@Param("offset") int offset,@Param("limit") int limit);

    /**
     * 减库存
     * @param seckillId
     * @param killTime
     * @return 如果影响行数>1，表示更新库存的记录行数
     */
    int reduceNumber(@Param("seckillId") long seckillId, @Param("killTime") Date killTime);

}
