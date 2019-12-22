package com.swift.config;

import com.netflix.loadbalancer.BestAvailableRule;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
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
    @LoadBalanced
    public RestTemplate restTemplate(){
        logger.info("=============注入restTemplate");
        return new RestTemplate();
    }


    //定义负载均衡策略,总共有7种，默认的是轮回
    @Bean
    public IRule iRule(){
        logger.info("=============注入IRule策略");
        return new RoundRobinRule();
    }
}
