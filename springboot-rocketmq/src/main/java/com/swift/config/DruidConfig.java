package com.swift.config;

import com.alibaba.druid.support.http.StatViewServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

/**
 * DruidConfig
 *
 * @author sqt
 * @date 19-4-17
 **/
@Configuration
public class DruidConfig {
    /**
     * 配置读取spring数据源
     */
//    @Bean
//    @ConfigurationProperties(prefix="spring.datasource")
//    public DataSource druidDataSource() {
//        return new DruidDataSource();
//    }

    @Bean
    public ServletRegistrationBean druidStatViewServlet() {
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new StatViewServlet(),"/druid/*");
        Map<String, String> initParams = new HashMap<String, String>();
        //　可配的属性都在 StatViewServlet 和其父类下
        initParams.put("loginUsername", "admin");
        initParams.put("loginPassword", "123456");
        servletRegistrationBean.setInitParameters(initParams);
        return servletRegistrationBean;
    }

//    @Bean
//    public FilterRegistrationBean druidWebStatFilter() {
//        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new WebStatFilter());
//        Map<String, String> initParams = new HashMap<String, String>();
//        initParams.put("exclusions", "*.js,*.css,/druid/*");
//        filterRegistrationBean.setInitParameters(initParams);
//        filterRegistrationBean.setUrlPatterns(Arrays.asList("/*"));
//        return filterRegistrationBean;
//    }
}
