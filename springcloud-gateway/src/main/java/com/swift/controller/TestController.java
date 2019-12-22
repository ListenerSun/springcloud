package com.swift.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TestController
 *
 * @author sqt
 * @date 19-4-23
 **/
@RestController
@RequestMapping("/gateway")
public class TestController {

    @GetMapping("/test")
    public String test(){
        return "hello gateway!";
    }
}
