package com.liuzl.springcloud.alibaba.service;

import java.math.BigDecimal;

/**
 * @ClassName: AccountService
 * @Description: 账户service接口
 * @Author: 52945
 * @Date: 2020/6/4 16:01
 * @Version: 1.0
 */
public interface AccountService {

    /**
     * @Name decrease
     * @Description 扣减账户余额
     * @Date 2020/6/4 15:59
     * @Param [userId, money]
     * @return void
     **/
    void decrease(Long userId, BigDecimal money);

}
