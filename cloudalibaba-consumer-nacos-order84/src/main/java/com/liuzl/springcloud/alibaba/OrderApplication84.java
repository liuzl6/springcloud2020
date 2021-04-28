package com.liuzl.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName: OrderApplication84
 * @Description: 订单主启动类
 * @Author: 52945
 * @Date: 2020/6/2 11:13
 * @Version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients  /*开启openfeign*/
public class OrderApplication84 {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication84.class, args);
    }

}
