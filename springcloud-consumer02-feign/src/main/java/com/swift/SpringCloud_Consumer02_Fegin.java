package com.swift;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RestController;

/**
 * SpringCloud_Provider01
 *
 * @author sqt
 * @date 19-4-19
 **/


@SpringBootApplication
@EnableDiscoveryClient //注解用于发现服务和注册服务
@EnableFeignClients(basePackages = "com.swift.service")    //启用Fegin服务,扫描@FeignClient注解，该注解在依赖的第三方包内
public class SpringCloud_Consumer02_Fegin {
    private static Logger logger  = LoggerFactory.getLogger(SpringCloud_Consumer02_Fegin.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringCloud_Consumer02_Fegin.class, args);
        logger.info("============>SpringCloud_Consumer02_Fegin服务启动成功");
    }
}
