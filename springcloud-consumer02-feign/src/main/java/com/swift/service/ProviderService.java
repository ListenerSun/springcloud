package com.swift.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * HelloService
 * 使用@FeignClient注解,name为服务的名字
 * @author sqt
 * @date 19-4-20
 **/
@FeignClient("Provier")
public interface ProviderService {

    @GetMapping("/hello")
    public String callService();
}
