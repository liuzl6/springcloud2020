package com.liuzl.springcloud.controller;

import com.liuzl.springcloud.service.PaymentHystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName: OrderHystrixController
 * @Description: 订单控制层API
 * @Author: 52945
 * @Date: 2020/5/22 11:56
 * @Version: 1.0
 */
@RestController
@Slf4j
//@DefaultProperties(defaultFallback = "payment_Global_FallbackHandler")  /*指定全局降级方法(默认降级方法)*/
public class OrderHystrixController {

    @Resource
    private PaymentHystrixService paymentHystrixService;

    @GetMapping("/consumer/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id) {
        return paymentHystrixService.paymentInfo_OK(id);
    }

    @GetMapping("/consumer/payment/hystrix/timeout/{id}")
//    @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler", commandProperties = {
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1500")
//    })
//    @HystrixCommand  /*不指定降级方法，就使用默认的降级方法*/
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id) {
        return paymentHystrixService.paymentInfo_TimeOut(id);
    }

    public String paymentInfo_TimeOutHandler(@PathVariable("id") Integer id) {
        return "我是消费者80,服务端支付系统繁忙,请稍后重试或者检查自身是否出错,/(ㄒoㄒ)/~~";
    }

    /*定义全局服务降级处理方法，避免代码冗余膨胀，未指定服务降级的都使用这个全局的*/
    public String payment_Global_FallbackHandler(){
        return "Global异常处理,请稍后重试,/(ㄒoㄒ)/~~";
    }

}
