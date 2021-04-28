package com.liuzl.springcloud.alibaba.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

/**
 * @ClassName: Account
 * @Description: 账号信息实体类
 * @Author: 52945
 * @Date: 2020/6/4 15:54
 * @Version: 1.0
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Account {

    /**
    * id
    */
    private Long id;

    /**
    * 用户id
    */
    private Long userId;

    /**
    * 总额度
    */
    private BigDecimal total;

    /**
    * 已用余额
    */
    private BigDecimal used;

    /**
    * 剩余可用额度
    */
    private BigDecimal residue;

}