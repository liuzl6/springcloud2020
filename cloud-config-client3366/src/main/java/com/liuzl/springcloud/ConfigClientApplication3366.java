package com.liuzl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName: ConfigClientApplication3366
 * @Description: 配置客户端主启动类
 * @Author: 52945
 * @Date: 2020/5/26 9:35
 * @Version: 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientApplication3366 {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication3366.class, args);
    }

}
