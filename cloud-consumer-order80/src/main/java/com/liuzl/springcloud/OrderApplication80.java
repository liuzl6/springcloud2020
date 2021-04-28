package com.liuzl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName: OrderApplication80
 * @Description: 订单主启动类
 * @Author: 52945
 * @Date: 2020/5/18 14:36
 * @Version: 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class OrderApplication80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication80.class, args);
    }

}
