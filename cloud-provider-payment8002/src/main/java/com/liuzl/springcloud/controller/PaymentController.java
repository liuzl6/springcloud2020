package com.liuzl.springcloud.controller;

import com.liuzl.springcloud.entities.Payment;
import com.liuzl.springcloud.result.CommonResult;
import com.liuzl.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @ClassName: PaymentController
 * @Description: 支付控制层API
 * @Author: 52945
 * @Date: 2020/5/19 10:04
 * @Version: 1.0
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/payment/create", consumes = "application/json;charset=UTF-8")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.insert(payment);
        log.info("****插入结果：" + "\t" + serverPort + result);
        if (result > 0) {
            return new CommonResult(200, "插入数据库成功！" + "\t" + serverPort, result);
        }
        return new CommonResult(-1, "插入数据库失败！");
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> findPaymentById(@PathVariable("id") Long id) {
        Payment result = paymentService.selectByPrimaryKey(id);
        log.info("****查询结果：" + "\t" + serverPort + result);
        if (result != null) {
            return new CommonResult(200, "查询成功！" + "\t" + serverPort, result);
        }
        return new CommonResult(-1, "查询失败！没有对应记录");
    }

    @GetMapping(value = "/payment/timeout")
    public String paymentFeignTimeout() {
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return serverPort;
    }

}
