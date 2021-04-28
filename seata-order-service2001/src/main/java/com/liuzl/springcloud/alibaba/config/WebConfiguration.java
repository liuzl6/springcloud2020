package com.liuzl.springcloud.alibaba.config;

import com.liuzl.springcloud.alibaba.interceptor.SeataFeignClientInterceptor;
import com.liuzl.springcloud.alibaba.interceptor.SeataHandlerInterceptor;
import feign.RequestInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

import javax.annotation.Resource;

/**
 * @ClassName: WebConfiguration
 * @Description: TODO
 * @Author: 52945
 * @Date: 2020/6/5 15:57
 * @Version: 1.0
 */
@Configuration
public class WebConfiguration extends WebMvcConfigurationSupport {

    @Autowired
    private RequestMappingHandlerAdapter handlerAdapter;

    @Bean
    public RequestInterceptor requestInterceptor() {
        return new SeataFeignClientInterceptor();
    }

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new SeataHandlerInterceptor()).addPathPatterns("/**");
        super.addInterceptors(registry);
    }

}
