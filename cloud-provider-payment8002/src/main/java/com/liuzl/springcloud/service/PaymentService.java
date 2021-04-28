package com.liuzl.springcloud.service;

import com.liuzl.springcloud.entities.Payment;

/**
 * @ClassName: PaymentService
 * @Description: 支付service接口
 * @Author: 52945
 * @Date: 2020/5/19 10:01
 * @Version: 1.0
 */
public interface PaymentService{

    int deleteByPrimaryKey(Long id);

    int insert(Payment record);

    int insertSelective(Payment record);

    Payment selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Payment record);

    int updateByPrimaryKey(Payment record);

}
