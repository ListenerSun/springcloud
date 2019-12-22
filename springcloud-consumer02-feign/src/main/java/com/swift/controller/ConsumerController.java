package com.swift.controller;

import com.swift.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * HelloController
 *
 * @author sqt
 * @date 19-4-19
 **/
@RestController
public class ConsumerController {

    @Autowired
    ProviderService providerService;

    @GetMapping("/hello")
    public String hello(){
        return providerService.callService();
    }

}
