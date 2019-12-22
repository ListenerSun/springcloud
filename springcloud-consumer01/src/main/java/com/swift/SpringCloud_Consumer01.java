package com.swift;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * SpringCloud_Provider01
 *
 * @author sqt
 * @date 19-4-19
 **/
@SpringBootApplication
@EnableDiscoveryClient //注解用于发现服务和注册服务
public class SpringCloud_Consumer01 {
    private static Logger logger  = LoggerFactory.getLogger(SpringCloud_Consumer01.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringCloud_Consumer01.class, args);
        logger.info("============>SpringCloud_Consumer01服务启动成功");
    }
}
