package com.liuzl.springcloud.service.impl;

import cn.hutool.core.util.IdUtil;
import com.liuzl.springcloud.service.PaymentService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

/**
 * @ClassName: PaymentServiceImpl
 * @Description: 支付service实现类
 * @Author: 52945
 * @Date: 2020/5/22 10:24
 * @Version: 1.0
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Override
    public String paymentInfo_OK(Integer id) {
        return "线程池：" + Thread.currentThread().getName() + " paymentInfo_Ok,id：" + id + "\t哈哈";
    }

    /**
     * @Name paymentInfo_TimeOut
     * @Description  fallbackMethod指定的方法表示当需要服务降级时，调用此方法
     *               commandProperties中的属性表示触发降级的条件，此处时线程等待3秒时间，如果3秒内没有响应，触发降级，调用指定方法
     * @Date 2020/5/24 10:25
     * @Param [id]
     * @return java.lang.String
     **/
    @Override
    @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "5000")
    })
    public String paymentInfo_TimeOut(Integer id) {
        int time = 3;
        try {
            Thread.sleep(time*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        int num = 10/0;  /*出现异常也会触发服务降级*/
        return "线程池：" + Thread.currentThread().getName() + " paymentInfo_TimeOut,id：" + id + "\t(*^_^*)" + "\t耗时(秒)：" + time;
    }

    public String paymentInfo_TimeOutHandler(Integer id) {
        return "线程池：" + Thread.currentThread().getName() + " 系统繁忙或者运行出错,请稍后重试,id：" + id + "\t/(ㄒoㄒ)/~~";
    }


    /***********服务熔断************************/
    @Override
    @HystrixCommand(fallbackMethod = "paymentCircuitBreaker_fallback", commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled", value = "true"),   //是否开启断路器
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),   //请求次数，例如：10次
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "10000"),   //时间周期内，例如：10秒内
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "60")  //失败率达到百分之多少后跳闸，例如：60%
    })  /*这里的条件是，当在10秒内，请求次数达到10次，失败率达到60%，即10秒内，请求10次，失败6次，断路器就会开启，服务就会调用失败*/
    public String paymentCircuitBreaker(Integer id) {
        if (id < 0) {
            throw new RuntimeException("********id 不能为负数");
        }
        String serialNumber = IdUtil.simpleUUID();
        return Thread.currentThread().getName() + "调用成功,流水号：" + serialNumber;
    }

    public String paymentCircuitBreaker_fallback(Integer id) {
        return "id不能为负数,请稍后重试,id：" + id + "\t/(ㄒoㄒ)/~~";
    }

}
