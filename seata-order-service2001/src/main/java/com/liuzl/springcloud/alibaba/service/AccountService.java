package com.liuzl.springcloud.alibaba.service;

import com.liuzl.springcloud.alibaba.result.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @ClassName: AccountService
 * @Description: 账户服务feign接口
 * @Author: 52945
 * @Date: 2020/6/4 15:46
 * @Version: 1.0
 */
@FeignClient(name = "seata-account-service")
public interface AccountService {

    @PostMapping("/account/decrease")
    public CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);

}
