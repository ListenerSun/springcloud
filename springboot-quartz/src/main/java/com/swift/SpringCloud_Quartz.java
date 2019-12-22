package com.swift;

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
@SpringBootApplication
public class SpringCloud_Quartz {
    private static Logger logger  = LoggerFactory.getLogger(SpringCloud_Quartz.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringCloud_Quartz.class, args);
        logger.info("============>SpringCloud_Quartz服务启动成功");
    }
}
