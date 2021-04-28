package com.liuzl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName: StreamProviderApplication8801
 * @Description: 消息服务提供者主启动类
 * @Author: 52945
 * @Date: 2020/5/26 16:23
 * @Version: 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class StreamProviderApplication8801 {

    public static void main(String[] args) {
        SpringApplication.run(StreamProviderApplication8801.class, args);
    }

}
