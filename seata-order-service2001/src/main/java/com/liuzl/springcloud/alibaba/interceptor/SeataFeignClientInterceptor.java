package com.liuzl.springcloud.alibaba.interceptor;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import io.seata.core.context.RootContext;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;

/**
 * @ClassName: SeataFeignClientInterceptor
 * @Description: FeignClient方式调用  xid拦截器
 * @Author: 52945
 * @Date: 2020/6/5 15:56
 * @Version: 1.0
 */
@Slf4j
public class SeataFeignClientInterceptor implements RequestInterceptor {

    @Override
    public void apply(RequestTemplate requestTemplate) {
        String xid = RootContext.getXID();
        if (StringUtils.isNotBlank(xid)) {
            requestTemplate.header(RootContext.KEY_XID, xid);
            log.info("分布式事务 xid:{}", xid);
        }
    }

}
