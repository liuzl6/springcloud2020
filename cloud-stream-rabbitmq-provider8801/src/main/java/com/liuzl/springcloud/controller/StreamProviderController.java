package com.liuzl.springcloud.controller;

import com.liuzl.springcloud.service.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName: StreamProviderController
 * @Description: 控制层API
 * @Author: 52945
 * @Date: 2020/5/26 16:35
 * @Version: 1.0
 */
@RestController
public class StreamProviderController {

    @Resource
    private IMessageProvider messageProvider;

    @GetMapping("/sendMessage")
    public String sendMessage(){
        return messageProvider.send();
    }

}
