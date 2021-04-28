package com.liuzl.springcloud.alibaba.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.liuzl.springcloud.alibaba.handler.CustomerBlockHandler;
import com.liuzl.springcloud.entities.Payment;
import com.liuzl.springcloud.result.CommonResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: RateLimitController
 * @Description: TODO
 * @Author: 52945
 * @Date: 2020/6/1 18:08
 * @Version: 1.0
 */
@RestController
@RequestMapping("/retaLimit")
public class RateLimitController {

    @GetMapping("/byResource")
    @SentinelResource(value = "byResource", blockHandler = "handleException")
    public CommonResult byResource() {
        return new CommonResult(200,"按资源名称限流测试OK", new Payment(2020L, "serial001"));
    }

    public CommonResult handleException(BlockException exception) {
        return new CommonResult(444,exception.getClass().getCanonicalName()+"\t 服务不可用");
    }

    @GetMapping("/byUrl")
    @SentinelResource(value = "byUrl")
    public CommonResult byUrl() {
        return new CommonResult(200,"按URL地址限流测试OK", new Payment(2020L, "serial001"));
    }

    //*******自定义限流
    @GetMapping("/customerBlockHandler")
    @SentinelResource(value = "customerBlockHandler",
                        blockHandlerClass = CustomerBlockHandler.class,  /*指定自定义限流处理的类*/
                        blockHandler = "handleException2")     /*指定自定义限流处理的类中的方法*/
    public CommonResult customerBlockHandler(){
        return new CommonResult(200,"按客户自定义限流测试OK", new Payment(2020L, "serial001"));
    }

}
