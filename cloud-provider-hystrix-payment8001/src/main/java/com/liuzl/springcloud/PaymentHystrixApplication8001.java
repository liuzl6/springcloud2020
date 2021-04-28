package com.liuzl.springcloud;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

/**
 * @ClassName: PaymentHystrixApplication8001
 * @Description: 支付主启动类
 * @Author: 52945
 * @Date: 2020/5/22 10:22
 * @Version: 1.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker  /*服务端开启hystrix*/
public class PaymentHystrixApplication8001 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentHystrixApplication8001.class, args);
    }

    /**
     * @Name getServlet
     * @Description 注意spring boot 2.X还要加上这段配置, 否则监控时会看不到数据
     *              此配置时为了服务监控而配置，与服务容错本身无关，springCloud升级后的坑，
     *              ServletRegistrationBean因为springboot的默认路径不是"/hystrix.stream"
     *              只要在自己的项目里配置上下面的servlet就可以了
     * @Date 2020/5/24 15:39
     * @Param []
     * @return org.springframework.boot.web.servlet.ServletRegistrationBean
     **/
    @Bean
    public ServletRegistrationBean getServlet() {
        HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(streamServlet);
        registrationBean.setLoadOnStartup(1);
        registrationBean.addUrlMappings("/hystrix.stream");
        registrationBean.setName("HystrixMetricsStreamServlet");
        return registrationBean;
    }

}
