package com.liuzl.springcloud.alibaba.controller;

import com.liuzl.springcloud.alibaba.result.CommonResult;
import com.liuzl.springcloud.alibaba.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName: StorageController
 * @Description: 库存管理控制层API
 * @Author: 52945
 * @Date: 2020/6/4 15:30
 * @Version: 1.0
 */
@RestController
@Slf4j
public class StorageController {

    @Resource
    private StorageService storageService;

    @PostMapping("/storage/decrease")
    public CommonResult decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count) {
        storageService.decrease(productId, count);
        return new CommonResult(200, "库存扣减成功！");
    }

}
