package com.liuzl.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName: SentinelServiceApplication8401
 * @Description: sentinel服务主启动类
 * @Author: 52945
 * @Date: 2020/5/30 12:50
 * @Version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SentinelServiceApplication8401 {

    public static void main(String[] args) {
        SpringApplication.run(SentinelServiceApplication8401.class, args);
    }

}
