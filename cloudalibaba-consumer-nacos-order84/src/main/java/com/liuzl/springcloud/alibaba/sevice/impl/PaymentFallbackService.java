package com.liuzl.springcloud.alibaba.sevice.impl;

import com.liuzl.springcloud.alibaba.sevice.PaymentService;
import com.liuzl.springcloud.entities.Payment;
import com.liuzl.springcloud.result.CommonResult;
import org.springframework.stereotype.Service;

/**
 * @ClassName: PaymentFallbackService
 * @Description: TODO
 * @Author: 52945
 * @Date: 2020/6/2 11:51
 * @Version: 1.0
 */
@Service
public class PaymentFallbackService implements PaymentService {

    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(44444, "服务降级返回,---PaymentFallbackService", new Payment(id,"errorSerial"));
    }

}
