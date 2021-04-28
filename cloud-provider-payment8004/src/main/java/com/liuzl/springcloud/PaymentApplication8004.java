package com.liuzl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName: PaymentApplication8004
 * @Description: 支付服务主启动类
 * @Author: 52945
 * @Date: 2020/5/19 21:16
 * @Version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient  /*该注解用于向使用consul或者zookeeper作为注册中心时注册服务*/
public class PaymentApplication8004 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication8004.class, args);
    }

}
