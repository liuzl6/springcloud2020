package com.liuzl.springcloud.service;

/**
 * @ClassName: PaymentService
 * @Description: 支付service接口
 * @Author: 52945
 * @Date: 2020/5/22 10:24
 * @Version: 1.0
 */
public interface PaymentService {

    String paymentInfo_OK(Integer id);

    String paymentInfo_TimeOut(Integer id);

    String paymentCircuitBreaker(Integer id);

}
