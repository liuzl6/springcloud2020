package com.liuzl.springcloud.alibaba.controller;

import com.liuzl.springcloud.alibaba.result.CommonResult;
import com.liuzl.springcloud.alibaba.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @ClassName: AccountController
 * @Description: 账户控制层API
 * @Author: 52945
 * @Date: 2020/6/4 16:04
 * @Version: 1.0
 */
@RestController
@Slf4j
public class AccountController {

    @Resource
    private AccountService accountService;

    @PostMapping("/account/decrease")
    public CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money) {
        accountService.decrease(userId, money);
        return new CommonResult(200, "账户余额扣减成功！");
    }

}
