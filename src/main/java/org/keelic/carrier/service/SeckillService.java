package org.keelic.carrier.service;

import org.keelic.carrier.dto.SeckillExecution;
import org.keelic.carrier.dto.UrlExposer;
import org.keelic.carrier.entity.Seckill;
import org.keelic.carrier.exception.RepeatSeckillException;
import org.keelic.carrier.exception.SeckillCloseException;
import org.keelic.carrier.exception.SeckillException;

import java.util.List;

/**
 * 秒杀接口
 *
 * @author keelic 2018-04-07
 */
public interface SeckillService {

    /**
     * 获取秒杀商品列表  ,1ym3u2Kl&PW
     */
    List<Seckill> getSeckillList();

    /**
     * 依据id获取秒杀商品
     */
    Seckill getById(long seckillId);

    /**
     * 秒杀开启时暴露秒杀地址，
     * 否则输出系统时间和秒杀时间
     */
    UrlExposer exportSeckillUrl(long seckillId);

    /**
     * 执行秒杀
     */
    SeckillExecution executeSeckill(long seckillId, long userPhone, String md5)
            throws RepeatSeckillException, SeckillCloseException, SeckillException;


}
