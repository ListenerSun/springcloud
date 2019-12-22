package com.swift.controller;

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

    private static final String REST_URL_PREFIX = "http://Provier";
    @Autowired
    private RestTemplate restTemplate;


    @GetMapping("/hello")
    public String hello(){
        return restTemplate.getForObject(REST_URL_PREFIX + "/hello", String.class);
    }

}
