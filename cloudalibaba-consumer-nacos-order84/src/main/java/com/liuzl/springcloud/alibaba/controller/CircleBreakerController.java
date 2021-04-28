package com.liuzl.springcloud.alibaba.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.liuzl.springcloud.entities.Payment;
import com.liuzl.springcloud.result.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @ClassName: CircleBreakerController
 * @Description: 服务熔断控制层API
 * @Author: 52945
 * @Date: 2020/6/2 11:19
 * @Version: 1.0
 */
@RestController
@Slf4j
public class CircleBreakerController {

    @Resource
    private RestTemplate restTemplate;

    @Value("${service-url.nacos-user-service}")
    private String serviceUrl;

    @RequestMapping("/consumer/fallback/{id}")
//    @SentinelResource(value = "fallback") //没有配置
//    @SentinelResource(value = "fallback", fallback = "handlerFallback") //fallback只负责业务异常
//    @SentinelResource(value = "fallback", blockHandler = "blockHandler") //blockHandler只负责sentinel控制台配置违规
    @SentinelResource(value = "fallback", fallback = "handlerFallback", blockHandler = "blockHandler",
            exceptionsToIgnore = {IllegalArgumentException.class})
    public CommonResult<Payment> fallback(@PathVariable Long id) {
        CommonResult<Payment> result = restTemplate.getForObject(serviceUrl + "/paymentSQL/"+id, CommonResult.class, id);
        if (id == 4) {
            throw new IllegalArgumentException ("IllegalArgumentException,非法参数异常....");
        }else if (result.getData() == null) {
            throw new NullPointerException ("NullPointerException,该ID没有对应记录,空指针异常");
        }
        return result;
    }

    //fallback
    public CommonResult handlerFallback(@PathVariable Long id, Throwable e) {
        return new CommonResult<>(444, "兜底异常handlerFallback,exception内容: " + e.getMessage(), new Payment(id, "null"));
    }

    //blockHandler
    public CommonResult blockHandler(@PathVariable Long id, BlockException blockException) {
        return new CommonResult<>(445, "blockHandler-sentinel限流,无此流水: blockException: " + blockException.getMessage(), new Payment(id,"null"));
    }

}
