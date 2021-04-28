package com.liuzl.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName: NacosConfigClientApplication3377
 * @Description: nacos配置客户端主启动类
 * @Author: 52945
 * @Date: 2020/5/28 12:09
 * @Version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosConfigClientApplication3377 {

    public static void main(String[] args) {
        SpringApplication.run(NacosConfigClientApplication3377.class, args);
    }

}
