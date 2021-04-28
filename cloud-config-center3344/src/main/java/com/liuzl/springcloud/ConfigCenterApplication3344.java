package com.liuzl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @ClassName: ConfigCenterApplication3344
 * @Description: 配置中心主启动类
 * @Author: 52945
 * @Date: 2020/5/25 14:53
 * @Version: 1.0
 */
@SpringBootApplication
@EnableConfigServer /*开启配置server*/
public class ConfigCenterApplication3344 {

    public static void main(String[] args) {
        SpringApplication.run(ConfigCenterApplication3344.class, args);
    }

}
