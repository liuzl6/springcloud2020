package com.liuzl.springcloud.alibaba.service.impl;

import com.liuzl.springcloud.alibaba.dao.OrderMapper;
import com.liuzl.springcloud.alibaba.domain.Order;
import com.liuzl.springcloud.alibaba.service.AccountService;
import com.liuzl.springcloud.alibaba.service.OrderService;
import com.liuzl.springcloud.alibaba.service.StorageService;
import io.seata.core.context.RootContext;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName: OrderServiceImpl
 * @Description: 订单服务service实现类
 * @Author: 52945
 * @Date: 2020/6/4 15:52
 * @Version: 1.0
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderMapper orderMapper;
    @Resource
    private StorageService storageService;
    @Resource
    private AccountService accountService;

    /**
     * @Name create 
     * @Description 创建订单->调用库存服务扣减库存->调用账户服务扣减账户余额->修改订单状态
     * @Date 2020/6/4 16:11
     * @Param [order]
     * @return void
     **/
    @Override
    @GlobalTransactional(name = "liuzl_tx_group", rollbackFor = Exception.class)
    public void create(Order order) {
        log.info("分布式事务 xid:{}", RootContext.getXID());
        //新建订单
        log.info("----->开始新建订单");
        orderMapper.create(order);

        //扣减库存
        log.info("----->订单服务开始调用库存服务，扣减库存开始");
        storageService.decrease(order.getProductId(), order.getCount());
        log.info("----->订单服务开始调用库存服务，扣减库存结束");

        //扣减账户余额
        log.info("----->订单服务开始调用账户服务，扣减账户余额开始");
        accountService.decrease(order.getUserId(), order.getMoney());
        log.info("----->订单服务开始调用账户服务，扣减账户余额结束");

        //修改订单状态  1：已完成
        log.info("----->修改订单状态开始");
        orderMapper.update(order.getUserId(),0);
        log.info("----->修改订单状态结束");

        log.info("订单创建成功！");
    }

}
