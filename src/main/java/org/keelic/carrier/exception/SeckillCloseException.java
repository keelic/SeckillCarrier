package org.keelic.carrier.exception;

/**
 *  秒杀关闭异常
 *
 * @author keelic 2018-04-06
 */
public class SeckillCloseException extends SeckillException{

    public SeckillCloseException(String message) {
        super(message);
    }

    public SeckillCloseException(String message, Throwable cause) {
        super(message, cause);
    }

}
