package com.swift.springcloud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //开启Eureka提供 服务治理 的功能，表示接受其他服务注册进来
public class SpringCloud_Eureka02 {

	private static Logger logger  = LoggerFactory.getLogger(SpringCloud_Eureka02.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringCloud_Eureka02.class, args);
		logger.info("============>SpringCloud_Eureka02服务启动成功");
	}

}
