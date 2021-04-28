package com.liuzl.springcloud.alibaba.domain;

import lombok.*;

import java.math.BigDecimal;

/**
 * @ClassName: Order
 * @Description: 订单实体类
 * @Author: 52945
 * @Date: 2020/6/4 15:51
 * @Version: 1.0
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    private Long id;

    /**
    * 用户id
    */
    private Long userId;

    /**
    * 产品id
    */
    private Long productId;

    /**
    * 数量
    */
    private Integer count;

    /**
    * 金额
    */
    private BigDecimal money;

    /**
    * 订单状态：0：创建中; 1：已完结
    */
    private Integer status;

}