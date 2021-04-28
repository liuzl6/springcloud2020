package com.liuzl.springcloud.alibaba.service;

import com.liuzl.springcloud.alibaba.domain.Order;

/**
 * @ClassName: OrderService
 * @Description: 订单服务service接口
 * @Author: 52945
 * @Date: 2020/6/4 15:52
 * @Version: 1.0
 */
public interface OrderService {

    /**
     * @Name create
     * @Description 创建订单
     * @Date 2020/6/4 16:20
     * @Param [order]
     * @return void
     **/
    void create(Order order);

}
