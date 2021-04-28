package com.liuzl.springcloud.controller;

import cn.hutool.core.lang.UUID;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: PaymentController
 * @Description: 支付控制层API
 * @Author: 52945
 * @Date: 2020/5/19 21:19
 * @Version: 1.0
 */
@RestController
@RequestMapping("/payment")
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/consul")
    public String paymentConsul(){
        return "springcloud with consul:" + serverPort + "\t" + UUID.randomUUID().toString();
    }

}
