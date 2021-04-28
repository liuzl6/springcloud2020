package com.liuzl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName: StreamConsumerApplication8802
 * @Description: 消息消费者主启动类
 * @Author: 52945
 * @Date: 2020/5/26 16:42
 * @Version: 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class StreamConsumerApplication8802 {

    public static void main(String[] args) {
        SpringApplication.run(StreamConsumerApplication8802.class, args);
    }

}
