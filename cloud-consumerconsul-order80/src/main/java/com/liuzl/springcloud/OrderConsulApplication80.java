package com.liuzl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName: OrderConsulApplication80
 * @Description: 订单主启动类
 * @Author: 52945
 * @Date: 2020/5/20 10:49
 * @Version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderConsulApplication80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderConsulApplication80.class, args);
    }

}
