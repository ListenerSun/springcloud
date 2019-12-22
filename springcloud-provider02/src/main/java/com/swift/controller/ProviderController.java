package com.swift.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloController
 *
 * @author sqt
 * @date 19-4-19
 **/
@RestController
public class ProviderController {


    @GetMapping("/hello")
    public String hello(){
        return "这是Provider02提供的服务";
    }

}
