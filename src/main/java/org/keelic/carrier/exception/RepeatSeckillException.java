package org.keelic.carrier.exception;

/**
 * 重复秒杀异常
 *
 * @author keelic 2018-04-06
 */
public class RepeatSeckillException extends SeckillException{

    public RepeatSeckillException(String message) {
        super(message);
    }

    public RepeatSeckillException(String message, Throwable cause) {
        super(message, cause);
    }
}
