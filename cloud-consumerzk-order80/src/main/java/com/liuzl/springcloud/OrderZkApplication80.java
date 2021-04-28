package com.liuzl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName: OrderZkApplication80
 * @Description: 订单主启动类
 * @Author: 52945
 * @Date: 2020/5/19 21:49
 * @Version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderZkApplication80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderZkApplication80.class, args);
    }

}
