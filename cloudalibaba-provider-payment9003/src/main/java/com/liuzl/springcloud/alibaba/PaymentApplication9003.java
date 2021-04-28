package com.liuzl.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName: PaymentApplication9003
 * @Description: 支付主启动类
 * @Author: 52945
 * @Date: 2020/6/2 10:53
 * @Version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentApplication9003 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication9003.class, args);
    }

}
