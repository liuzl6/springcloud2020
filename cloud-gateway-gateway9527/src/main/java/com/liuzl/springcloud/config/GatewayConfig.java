package com.liuzl.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: GatewayConfig
 * @Description: 网关配置
 * @Author: 52945
 * @Date: 2020/5/25 10:18
 * @Version: 1.0
 */
@Configuration
public class GatewayConfig {

    /*定义路由配置*/
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder){
        RouteLocatorBuilder.Builder routes = builder.routes();
        routes.route("guonei_route", r -> r.path("/guonei").uri("http://news.baidu.com/guonei")).build();
        routes.route("guoji_route", r -> r.path("/guoji").uri("http://news.baidu.com/guoji")).build();
        routes.route("mil_route", r -> r.path("/mil").uri("http://news.baidu.com/mil")).build();
        routes.route("finance_route", r -> r.path("/finance").uri("http://news.baidu.com/finance")).build();
        routes.route("ent_route", r -> r.path("/ent").uri("http://news.baidu.com/ent")).build();
        routes.route("sports_route", r -> r.path("/sports").uri("http://news.baidu.com/sports")).build();
        routes.route("internet_route", r -> r.path("/internet").uri("http://news.baidu.com/internet")).build();
        routes.route("tech_route", r -> r.path("/tech").uri("http://news.baidu.com/tech")).build();
        routes.route("game_route", r -> r.path("/game").uri("http://news.baidu.com/game")).build();
        routes.route("lady_route", r -> r.path("/lady").uri("http://news.baidu.com/lady")).build();
        routes.route("auto_route", r -> r.path("/auto").uri("http://news.baidu.com/auto")).build();
        routes.route("house_route", r -> r.path("/house").uri("http://news.baidu.com/house")).build();
        return routes.build();
    }

}
