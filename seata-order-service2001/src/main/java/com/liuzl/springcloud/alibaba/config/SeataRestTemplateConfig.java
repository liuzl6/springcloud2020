package com.liuzl.springcloud.alibaba.config;

import com.liuzl.springcloud.alibaba.interceptor.SeataRestTemplateInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName: SeataRestTemplateConfig
 * @Description: RestTemplate调用方式配置
 * @Author: 52945
 * @Date: 2020/6/5 15:55
 * @Version: 1.0
 */
@Configuration
public class SeataRestTemplateConfig {

    @Autowired(required = false)
    private Collection<RestTemplate> restTemplates;

    public SeataRestTemplateConfig(Collection<RestTemplate> restTemplates) {
        this.restTemplates = restTemplates;
    }

    public SeataRestTemplateConfig() {
    }

    public SeataRestTemplateInterceptor seataRestTemplateInterceptor() {
        return new SeataRestTemplateInterceptor();
    }

    @PostConstruct
    public void init() {
        if (this.restTemplates != null && this.restTemplates.size() > 0) {
            Iterator var1 = this.restTemplates.iterator();
            while (var1.hasNext()) {
                RestTemplate restTemplate = (RestTemplate) var1.next();
                List<ClientHttpRequestInterceptor> interceptors = new ArrayList(restTemplate.getInterceptors());
                interceptors.add(this.seataRestTemplateInterceptor());
                restTemplate.setInterceptors(interceptors);
            }
        }
    }

}
