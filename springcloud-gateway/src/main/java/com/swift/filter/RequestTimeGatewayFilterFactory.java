package com.swift.filter;

import org.slf4j.*;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.http.server.reactive.ServerHttpRequest;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;

/**
 * RequestTimeGatewayFilterFactory
 *
 * @author sqt
 * @date 19-4-29
 **/
public class RequestTimeGatewayFilterFactory extends AbstractGatewayFilterFactory<RequestTimeGatewayFilterFactory.Config> {


    private static final Logger log = LoggerFactory.getLogger(RequestTimeGatewayFilterFactory.class);
    private static final String REQUEST_TIME_BEGIN = "requestTimeBegin";
    private static final String KEY = "withParams";

//    public GatewayFilter apply(Consumer<Config> consumer) {
//        return null;
//    }

    public GatewayFilter apply(Config config) {
        return null;
    }

    public String name() {
        return null;
    }

    public ServerHttpRequest.Builder mutate(ServerHttpRequest request) {
        return null;
    }

    public ShortcutType shortcutType() {
        return null;
    }

    public List<String> shortcutFieldOrder() {
        return null;
    }

    public String shortcutFieldPrefix() {
        return null;
    }

    public static class Config {

        private boolean withParams;

        public boolean isWithParams() {
            return withParams;
        }

        public void setWithParams(boolean withParams) {
            this.withParams = withParams;
        }

    }
}
