package com.liuzl.springcloud.alibaba.dao;

import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @ClassName: AccountMapper
 * @Description: 账号mapper
 * @Author: 52945
 * @Date: 2020/6/4 15:58
 * @Version: 1.0
 */
public interface AccountMapper {

    /**
     * @Name decrease
     * @Description 扣减账户余额
     * @Date 2020/6/4 15:59
     * @Param [userId, money]
     * @return void
     **/
    void decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);

}