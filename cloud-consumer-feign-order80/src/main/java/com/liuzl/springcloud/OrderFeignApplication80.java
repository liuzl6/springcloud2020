package com.liuzl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName: OrderFeignApplication80
 * @Description: 订单主启动类
 * @Author: 52945
 * @Date: 2020/5/21 14:47
 * @Version: 1.0
 */
@SpringBootApplication
@EnableFeignClients  /*开启feign*/
public class OrderFeignApplication80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderFeignApplication80.class, args);
    }

}
