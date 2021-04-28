package com.liuzl.springcloud.alibaba.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.liuzl.springcloud.result.CommonResult;

/**
 * @ClassName: CustomerBlockHandler
 * @Description: 自定义异常处理类
 * @Author: 52945
 * @Date: 2020/6/1 18:16
 * @Version: 1.0
 */
public class CustomerBlockHandler {

    /**
     * @Name handleException1
     * @Description 处理方法1
     * @Date 2020/6/1 18:18
     * @Param [exception]
     * @return com.liuzl.springcloud.result.CommonResult
     **/
    public static CommonResult handleException1(BlockException exception) {
        return new CommonResult(4444, "自定义限流处理handleException1, CustomerBlockHandler");
    }

    /**
     * @Name handleException2
     * @Description 处理方法2
     * @Date 2020/6/1 18:18
     * @Param [exception]
     * @return com.liuzl.springcloud.result.CommonResult
     **/
    public static CommonResult handleException2(BlockException exception) {
        return new CommonResult(4444, "自定义限流处理handleException2, CustomerBlockHandler");
    }

}
