package com.liuzl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName: OrderFeignHystrixApplication80
 * @Description: 订单主启动类
 * @Author: 52945
 * @Date: 2020/5/22 11:52
 * @Version: 1.0
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix   /*客户端开启hystrix*/
public class OrderFeignHystrixApplication80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderFeignHystrixApplication80.class, args);
    }

}
