package com.swift;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringCloud_Provider01
 *
 * @author sqt
 * @date 19-4-19
 **/
@Slf4j
@SpringBootApplication
public class SpringCloud_RocketMq {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloud_RocketMq.class, args);
        log.info("============>SpringCloud_RocketM服务启动成功");
    }
}
