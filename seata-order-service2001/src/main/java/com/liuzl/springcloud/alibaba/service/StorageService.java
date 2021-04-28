package com.liuzl.springcloud.alibaba.service;

import com.liuzl.springcloud.alibaba.result.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName: StorageService
 * @Description: 库存服务feign接口
 * @Author: 52945
 * @Date: 2020/6/4 15:38
 * @Version: 1.0
 */
@FeignClient(name = "seata-storage-service")
public interface StorageService {

    @PostMapping("/storage/decrease")
    public CommonResult decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count);

}
