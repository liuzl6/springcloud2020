package com.liuzl.springcloud.alibaba.controller;

import com.liuzl.springcloud.alibaba.sevice.PaymentService;
import com.liuzl.springcloud.entities.Payment;
import com.liuzl.springcloud.result.CommonResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName: FeignController
 * @Description: TODO
 * @Author: 52945
 * @Date: 2020/6/2 11:53
 * @Version: 1.0
 */
@RestController
public class FeignController {

    // OpenFeign
    @Resource
    private PaymentService paymentService;

    @GetMapping(value = "/consumer/feign/paymentSQL/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id) {
        return paymentService.paymentSQL(id);
    }

}
