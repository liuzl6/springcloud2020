package com.liuzl.springcloud.alibaba.service.impl;

import com.liuzl.springcloud.alibaba.dao.StorageMapper;
import com.liuzl.springcloud.alibaba.service.StorageService;
import io.seata.core.context.RootContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName: StorageServiceImpl
 * @Description: 库存服务service实现类
 * @Author: 52945
 * @Date: 2020/6/4 15:28
 * @Version: 1.0
 */
@Service
@Slf4j
public class StorageServiceImpl implements StorageService {

    @Resource
    private StorageMapper storageMapper;

    @Override
    public void decrease(Long productId, Integer count) {
        log.info("------->storage-service中扣减库存开始");
        log.info("分布式事务 xid:{}", RootContext.getXID());
        storageMapper.decrease(productId, count);
        log.info("------->storage-service中扣减库存结束");
    }

}
