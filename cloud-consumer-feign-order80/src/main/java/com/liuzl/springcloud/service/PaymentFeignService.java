package com.liuzl.springcloud.service;

import com.liuzl.springcloud.entities.Payment;
import com.liuzl.springcloud.result.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @ClassName: PaymentFeignService
 * @Description: 支付提供者的feign接口
 * @Author: 52945
 * @Date: 2020/5/21 14:57
 * @Version: 1.0
 */
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {

    @GetMapping(value = "/payment/get/{id}")
    CommonResult<Payment> findPaymentById(@PathVariable("id") Long id);

    @GetMapping(value = "/payment/timeout")
    String paymentFeignTimeout();

}
