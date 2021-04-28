package com.liuzl.springcloud.alibaba.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: FlowLimitController
 * @Description: 服务限流控制层API
 * @Author: 52945
 * @Date: 2020/5/30 12:51
 * @Version: 1.0
 */
@RestController
@Slf4j
public class FlowLimitController {

    @GetMapping("/testA")
    public String testA(){
        log.info("threadName:" + Thread.currentThread().getName() + "-----testA");
        return "------testA";
    }

    @GetMapping("/testB")
    public String testB(){
        return "------testB";
    }

    /*服务降级 -- RT*/
    @GetMapping("/testD")
    public String testD(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("------testD 测试RT");
        return "------testD";
    }

    /*服务降级 -- 异常比例*/
    @GetMapping("/testE")
    public String testE(){
        log.info("------testE 测试异常比例");
        int num = 10/0;
        return "------testE";
    }

    /*服务降级 -- 异常数*/
    @GetMapping("/testF")
    public String testF(){
        log.info("------testF 测试异常数");
        int num = 10/0;
        return "------testF";
    }

    /*热点限流*/
    @GetMapping("/testHotKey")
    @SentinelResource(value = "testHotKey", blockHandler = "testHotKey_handler")
    public String testHotKey(@RequestParam(value = "p1", required = false) String p1,
                             @RequestParam(value = "p2", required = false) String p2){
        log.info("------testHotKey 测试热点限流");
        return "------testHotKey";
    }

    public String testHotKey_handler(String p1, String p2, BlockException exception){
        return "------testHotKey_handler,/(ㄒoㄒ)/~~";
    }

}
