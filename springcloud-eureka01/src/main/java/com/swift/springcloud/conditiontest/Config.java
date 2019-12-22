package com.swift.springcloud.conditiontest;

/**
 * Config
 *
 * @author sqt
 * @date 19-4-22
 **/

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by sqt
 */
@Slf4j
@Configuration
public class Config {
/*
    @Conditional(MyCondition.class)
    @Bean
    public String condition() {
        log.info("自定义的condition的match方法返回值为true时，才会进入该方法创建bean");
        return "";
    }*/

    /**
     * 该Abc class位于类路径上时
     */
   /* @ConditionalOnClass(Abc.class)
    @Bean
    public  Abc abc() {
        log.info("=============> @ConditionalOnClass");
        return new Abc();
    }*/

   /* @ConditionalOnClass(Abc.class)
    @Bean
    public Abc newAbc() {
        log.info("=============> @ConditionalOnClass");
        return new Abc();
    }*/



    @ConditionalOnMissingBean(Abc.class)
    @Bean
    public Abc missBean() {
        log.info("=============>容器中没有配置 Abc的Bean ,生成一个Bean");
        return new Abc();
    }

    /**
     * 存在Abc类的实例时
     */
    @ConditionalOnBean(Abc.class)
    @Bean
    public String bean() {
        log.info("=============>容器中配置了Abc的Bean");
        return "";
    }
    /**
     * 表达式为true时
     */
 /*   @ConditionalOnExpression(value = "true")
    @Bean
    public String expresssion() {
        log.info("=============>@ConditionalOnExpression  ");
        return "";
    }

    *//**
     * 配置文件属性是否为true
     *//*
    @ConditionalOnProperty(
            value = {"abc.property"},
            matchIfMissing = false)
    @Bean
    public String property() {
        log.info("=============> @ConditionalOnProperty  ");
        return "";
    }*/
}
