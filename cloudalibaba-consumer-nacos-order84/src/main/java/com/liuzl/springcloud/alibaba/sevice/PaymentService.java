package com.liuzl.springcloud.alibaba.sevice;

import com.liuzl.springcloud.alibaba.sevice.impl.PaymentFallbackService;
import com.liuzl.springcloud.entities.Payment;
import com.liuzl.springcloud.result.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @ClassName: PaymentService
 * @Description: TODO
 * @Author: 52945
 * @Date: 2020/6/2 11:49
 * @Version: 1.0
 */
@FeignClient(value = "nacos-payment-provider", fallback = PaymentFallbackService.class)
public interface PaymentService {

    @GetMapping(value = "/paymentSQL/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id);

}
