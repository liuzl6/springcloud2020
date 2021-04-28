package com.liuzl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName: ConfigClientApplication3355
 * @Description: 配置客户端主启动类
 * @Author: 52945
 * @Date: 2020/5/25 19:37
 * @Version: 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientApplication3355 {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication3355.class, args);
    }

}
