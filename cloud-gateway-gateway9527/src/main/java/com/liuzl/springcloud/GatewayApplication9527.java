package com.liuzl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName: GatewayApplication9527
 * @Description: 网关主启动类
 * @Author: 52945
 * @Date: 2020/5/24 17:22
 * @Version: 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class GatewayApplication9527 {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication9527.class, args);
    }

}
