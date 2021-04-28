package com.liuzl.springcloud.dao;

import com.liuzl.springcloud.entities.Payment;

/**
 * @ClassName: PaymentMapper
 * @Description: 支付mapper
 * @Author: 52945
 * @Date: 2020/5/19 10:00
 * @Version: 1.0
 */
public interface PaymentMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Payment record);

    int insertSelective(Payment record);

    Payment selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Payment record);

    int updateByPrimaryKey(Payment record);

}