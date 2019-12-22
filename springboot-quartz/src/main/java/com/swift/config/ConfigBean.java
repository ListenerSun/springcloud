package com.swift.config;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * RestTemplateConfig
 * 配置  RestTemplate
 * @author sqt
 * @date 19-4-19
 **/
@Configuration
public class ConfigBean {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Bean("restTemplate")
    public RestTemplate restTemplate(){
        logger.info("=============注入restTemplate");
        return new RestTemplate();
    }


}
