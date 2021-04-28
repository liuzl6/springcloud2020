package com.liuzl.springcloud.alibaba.service;

/**
 * @ClassName: StorageService
 * @Description: 库存service接口
 * @Author: 52945
 * @Date: 2020/6/4 15:29
 * @Version: 1.0
 */
public interface StorageService {

    /**
     * @Name decrease
     * @Description 扣减库存信息
     * @Date 2020/6/4 16:20
     * @Param [productId, count]
     * @return void
     **/
    void decrease(Long productId, Integer count);

}
