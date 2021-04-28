package com.liuzl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @ClassName: HystrixDashboardApplication9001
 * @Description: hystrix dashboard主启动类
 * @Author: 52945
 * @Date: 2020/5/24 15:22
 * @Version: 1.0
 */
@SpringBootApplication
@EnableHystrixDashboard  /*开启hystrix dashboard*/
public class HystrixDashboardApplication9001 {

    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboardApplication9001.class, args);
    }

}
