package org.keelic.carrier.exception;

/**
 * 秒杀业务异常
 *
 * @author keelic 2018-04-06
 */
public class SeckillException extends RuntimeException{

    public SeckillException(String message) {
        super(message);
    }

    public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }
}
