package com.liuzl.springcloud.alibaba.dao;

import com.liuzl.springcloud.alibaba.domain.Order;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName: OrderMapper
 * @Description: 订单mapper
 * @Author: 52945
 * @Date: 2020/6/4 15:51
 * @Version: 1.0
 */
public interface OrderMapper {

    /**
     * @Name create 
     * @Description 新建订单
     * @Date 2020/6/4 16:18
     * @Param [order]
     * @return void
     **/
    void create(Order order);

    /**
     * @Name update
     * @Description 修改订单状态，从零改为1
     * @Date 2020/6/4 16:17
     * @Param [userId, status]
     * @return void
     **/
    void update(@Param("userId") Long userId, @Param("status") Integer status);

}