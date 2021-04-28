package com.liuzl.springcloud.service.impl;

import com.liuzl.springcloud.service.PaymentHystrixService;
import org.springframework.stereotype.Service;

/**
 * @ClassName: PaymentFallbackService
 * @Description: 服务降级处理类
 * @Author: 52945
 * @Date: 2020/5/24 11:19
 * @Version: 1.0
 */
@Service
public class PaymentFallbackService implements PaymentHystrixService {

    @Override
    public String paymentInfo_OK(Integer id) {
        return "*****PaymentFallbackService fall back-paymentInfo_OK,/(ㄒoㄒ)/~~";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "*****PaymentFallbackService fall back-paymentInfo_TimeOut,/(ㄒoㄒ)/~~";
    }

}
