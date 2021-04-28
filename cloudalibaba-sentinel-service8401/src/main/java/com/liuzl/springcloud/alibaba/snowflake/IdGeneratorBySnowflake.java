package com.liuzl.springcloud.alibaba.snowflake;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.net.NetUtil;
import cn.hutool.core.util.IdUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @ClassName: IdGeneratorBySnowflake
 * @Description: ID生成器（雪花算法）
 * @Author: 52945
 * @Date: 2020/6/6 18:21
 * @Version: 1.0
 */
@Component
@Slf4j
public class IdGeneratorBySnowflake {

    /*机器标识*/
    private long workerId = 0;
    /*数据中心ID*/
    private long datacenterId = 1;

    /*雪花算法*/
    private Snowflake snowflake = new Snowflake(workerId, datacenterId);

    @PostConstruct
    public void init() {
        try {
            log.info("当前机器的IP:{}", NetUtil.getLocalhostStr());
            workerId = NetUtil.ipv4ToLong(NetUtil.getLocalhostStr());
            log.info("当前机器的workerId:{}", workerId);
        } catch (Exception e) {
            log.info("获取当前机器的workId异常", e);
            workerId = NetUtil.getLocalhostStr().hashCode();
        }

    }

    public synchronized long Snowflake(){
        return snowflake.nextId();
    }

    public synchronized long Snowflake(long workerId, long datacenterId) {
        Snowflake snowflake = IdUtil.createSnowflake(workerId, datacenterId);
        return snowflake.nextId();
    }

    public static void main(String[] args) {
        System.out.println(new IdGeneratorBySnowflake().Snowflake());
    }

}
