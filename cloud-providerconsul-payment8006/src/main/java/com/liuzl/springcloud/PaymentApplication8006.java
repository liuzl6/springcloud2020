package com.liuzl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName: PaymentApplication8006
 * @Description: 支付主启动类
 * @Author: 52945
 * @Date: 2020/5/20 10:03
 * @Version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentApplication8006 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication8006.class, args);
    }

}
