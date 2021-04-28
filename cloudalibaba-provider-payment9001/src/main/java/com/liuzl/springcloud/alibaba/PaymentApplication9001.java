package com.liuzl.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName: PaymentApplication9001
 * @Description: 支付主启动类
 * @Author: 52945
 * @Date: 2020/5/27 13:58
 * @Version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentApplication9001 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication9001.class, args);
    }

}
