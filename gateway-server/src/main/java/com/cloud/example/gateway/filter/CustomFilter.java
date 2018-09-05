package com.cloud.example.gateway.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/***
 * 排序的网关路由过滤器，用于包装真实的网关过滤器，已达到过滤器可排序
 * 主要目的是为了将目标过滤器包装成可排序的对象类型。是目标过滤器的包装类
 */
@Component
@Slf4j
public class CustomFilter implements GatewayFilter,Ordered {

    private static final String COUNT_Start_TIME = "countStartTime";


    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        exchange.getAttributes().put(COUNT_Start_TIME, System.currentTimeMillis());
        return chain.filter(exchange).then(
                Mono.fromRunnable(() -> {
                    log.info(" ==========================  ============================== ");
                    Long startTime = exchange.getAttribute(COUNT_Start_TIME);
                    Long endTime=(System.currentTimeMillis() - startTime);
                    if (startTime != null) {
                        log.info("接口访问执行时长 == " + exchange.getRequest().getURI().getRawPath() + ": " + endTime + "ms");
                    }
                    log.info(" ==========================  ============================== ");
                })
        );
    }

    @Override
    public int getOrder() {
        return Ordered.LOWEST_PRECEDENCE;
    }
}
