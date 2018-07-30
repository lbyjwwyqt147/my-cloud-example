package com.cloud.example.gateway.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.GatewayFilterFactory;

/***
 * 检测token 是否合法
 */
@Slf4j
public class TokenCheckGatewayFilterFactory implements GatewayFilterFactory<Object> {
    @Override
    public GatewayFilter apply(Object config) {
        log.info("     TokenCheckGatewayFilterFactory ........................................      ");
        return null;
    }
}
