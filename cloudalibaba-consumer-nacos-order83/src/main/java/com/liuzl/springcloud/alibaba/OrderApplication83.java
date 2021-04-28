package com.liuzl.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName: OrderApplication83
 * @Description: 订单主启动类
 * @Author: 52945
 * @Date: 2020/5/27 14:21
 * @Version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderApplication83 {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication83.class, args);
    }

}
