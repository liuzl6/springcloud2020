package com.liuzl.springcloud.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.liuzl.springcloud.entities.Payment;
import com.liuzl.springcloud.dao.PaymentMapper;
import com.liuzl.springcloud.service.PaymentService;

/**
 * @ClassName: PaymentServiceImpl
 * @Description: 支付service实现类
 * @Author: 52945
 * @Date: 2020/5/19 10:02
 * @Version: 1.0
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentMapper paymentMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return paymentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Payment record) {
        return paymentMapper.insert(record);
    }

    @Override
    public int insertSelective(Payment record) {
        return paymentMapper.insertSelective(record);
    }

    @Override
    public Payment selectByPrimaryKey(Long id) {
        return paymentMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Payment record) {
        return paymentMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Payment record) {
        return paymentMapper.updateByPrimaryKey(record);
    }

}
