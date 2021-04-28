package com.liuzl.springcloud.alibaba.dao;

import org.apache.ibatis.annotations.Param;

/**
 * @ClassName: StorageMapper
 * @Description: 库存mapper
 * @Author: 52945
 * @Date: 2020/6/4 15:29
 * @Version: 1.0
 */
public interface StorageMapper {

    /**
     * @Name decrease 
     * @Description 扣减库存信息
     * @Date 2020/6/4 16:19
     * @Param [productId, count]
     * @return void
     **/
    void decrease(@Param("productId") Long productId, @Param("count") Integer count);

}