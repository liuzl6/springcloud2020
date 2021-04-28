package com.liuzl.springcloud.alibaba.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: NacosConfigClientController
 * @Description: nacos配置客户端控制层API
 * @Author: 52945
 * @Date: 2020/5/28 12:11
 * @Version: 1.0
 */
@RestController
@RefreshScope
public class NacosConfigClientController {

    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/config/info")
    public String getConfigInfo() {
        return configInfo;
    }

}
