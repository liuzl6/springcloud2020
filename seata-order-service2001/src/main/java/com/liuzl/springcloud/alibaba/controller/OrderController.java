package com.liuzl.springcloud.alibaba.controller;

import com.liuzl.springcloud.alibaba.domain.Order;
import com.liuzl.springcloud.alibaba.result.CommonResult;
import com.liuzl.springcloud.alibaba.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName: OrderController
 * @Description: 订单服务控制层API
 * @Author: 52945
 * @Date: 2020/6/4 15:47
 * @Version: 1.0
 */
@RestController
@Slf4j
public class OrderController {

    @Resource
    private OrderService orderService;

    @PostMapping("/order/create")
    public CommonResult create(Order order) {
        orderService.create(order);
        return new CommonResult(200,"订单创建成功");
    }

}
