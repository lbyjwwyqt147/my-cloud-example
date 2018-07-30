package com.cloud.example.gateway.filter;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.core.Ordered;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/***
 * 排序的网关路由过滤器，用于包装真实的网关过滤器，已达到过滤器可排序
 * 主要目的是为了将目标过滤器包装成可排序的对象类型。是目标过滤器的包装类
 */
public class CustomFilter implements GatewayFilter,Ordered {

    //目标过滤器
    private final GatewayFilter delegate;
    //排序字段
    private final int order;

    public CustomFilter(GatewayFilter delegate, int order) {
        this.delegate = delegate;
        this.order = order;
    }

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        return this.delegate.filter(exchange, chain);
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
