package com.liuzl.springcloud.alibaba;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName: SeataAccountApplication2003
 * @Description: 账户服务启动类
 * @Author: 52945
 * @Date: 2020/6/4 16:09
 * @Version: 1.0
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)//取消数据源自动创建的配置
@EnableDiscoveryClient
@EnableFeignClients
@MapperScan(basePackages = {"com.liuzl.springcloud.alibaba.dao"})
public class SeataAccountApplication2003 {

    public static void main(String[] args) {
        SpringApplication.run(SeataAccountApplication2003.class, args);
    }

}
