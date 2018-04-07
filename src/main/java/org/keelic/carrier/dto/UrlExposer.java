package org.keelic.carrier.dto;

/**
 * 秒杀地址暴露DTO
 *
 * @author keelic 2018-04-06
 */
public class UrlExposer {

    // 是否开启
    private boolean exposed;

    // md5加密信息
    private String md5;

    // id
    private long seckillId;

    // 系统当前时间（毫秒）
    private long now;

    // 开启时间（毫秒）
    private long start;

    // 结束时间（毫秒）
    private long end;

    public UrlExposer(boolean exposed, String md5, long seckillId) {
        this.exposed = exposed;
        this.md5 = md5;
        this.seckillId = seckillId;
    }

    public UrlExposer(boolean exposed, long now, long start, long end) {
        this.exposed = exposed;
        this.now = now;
        this.start = start;
        this.end = end;
    }

    public boolean isExposed() {
        return exposed;
    }

    public void setExposed(boolean exposed) {
        this.exposed = exposed;
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public long getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(long seckillId) {
        this.seckillId = seckillId;
    }

    public long getNow() {
        return now;
    }

    public void setNow(long now) {
        this.now = now;
    }

    public long getStart() {
        return start;
    }

    public void setStart(long start) {
        this.start = start;
    }

    public long getEnd() {
        return end;
    }

    public void setEnd(long end) {
        this.end = end;
    }
}
