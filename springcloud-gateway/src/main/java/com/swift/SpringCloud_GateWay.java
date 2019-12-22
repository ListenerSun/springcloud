package com.swift;

import com.swift.filter.RequestTimeGatewayFilterFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

/**
 * SpringCloud_GateWay
 *
 * @author sqt
 * @date 19-4-19
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloud_GateWay {
    private static Logger logger  = LoggerFactory.getLogger(SpringCloud_GateWay.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringCloud_GateWay.class, args);
        logger.info("============>SpringCloud_GateWay服务启动成功");
    }

    @Bean
    public RequestTimeGatewayFilterFactory requestTimeGatewayFilterFactory() {
        return new RequestTimeGatewayFilterFactory();
    }

}
