package com.liuzl.springcloud.alibaba;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName: SeataStorageApplication2002
 * @Description: 库存服务主启动类
 * @Author: 52945
 * @Date: 2020/6/4 15:41
 * @Version: 1.0
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)//取消数据源自动创建的配置
@EnableDiscoveryClient
@EnableFeignClients
@MapperScan(basePackages = {"com.liuzl.springcloud.alibaba.dao"})
public class SeataStorageApplication2002 {

    public static void main(String[] args) {
        SpringApplication.run(SeataStorageApplication2002.class, args);
    }

}
