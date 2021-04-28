package com.liuzl.springcloud.alibaba.service.impl;

import io.seata.core.context.RootContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.liuzl.springcloud.alibaba.dao.AccountMapper;
import com.liuzl.springcloud.alibaba.domain.Account;
import com.liuzl.springcloud.alibaba.service.AccountService;

import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName: AccountServiceImpl
 * @Description: 账户服务service实现类
 * @Author: 52945
 * @Date: 2020/6/4 16:02
 * @Version: 1.0
 */
@Service
@Slf4j
public class AccountServiceImpl implements AccountService {

    @Resource
    private AccountMapper accountMapper;

    @Override
    public void decrease(Long userId, BigDecimal money) {
        log.info("------->account-service中扣减账户余额开始");
        log.info("分布式事务 xid:{}", RootContext.getXID());
        try {
            int i = 1 / 0;
        } catch (Exception e) {
            throw new RuntimeException();
        }
        accountMapper.decrease(userId, money);
        log.info("------->account-service中扣减账户余额结束");
    }

}
