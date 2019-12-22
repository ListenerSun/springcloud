package com.swift.config;

import com.alibaba.druid.pool.DruidDataSource;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.logging.stdout.StdOutImpl;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.boot.autoconfigure.SpringBootVFS;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/**Mybatis配置类
 * MybatisConfig
 *
 * @author sqt
 * @date 19-7-25
 **/
@Slf4j
@Configuration
public class MybatisConfig {

    @Bean(name = "dataSource")
    @ConfigurationProperties(prefix = "spring.datasource.druid")
    public DataSource dataSource(){
        return new DruidDataSource();
    }

    @Bean(name = "sqlSessionFactory")
    @Primary
    public SqlSessionFactoryBean sqlSessionFactoryBean(@Qualifier("dataSource") DataSource dataSource) {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        Set<Resource> result = new LinkedHashSet<Resource>(16);
        try {
            result.addAll(Arrays.asList(resolver.getResources("classpath*:mapper/*/*.xml")));
        } catch (IOException e) {
            log.error("获取【classpath*:mapper/*/*.xml】资源错误!异常信息:{}",e);
        }
        bean.setMapperLocations(result.toArray(new Resource[0]));
        //设置mybatis自定义类型转换
//        bean.setTypeHandlersPackage("cn.swifthealth.core.mybatis");
        bean.setVfs(SpringBootVFS.class);
        org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration();
        //设置拦截器
//        configuration.addInterceptor(new OptimisticLocker());
//        configuration.addInterceptor(new CreateTimeInterceptor());
        configuration.setLogImpl(StdOutImpl.class);
        configuration.setMapUnderscoreToCamelCase(true);
        bean.setConfiguration(configuration);
        return bean;
    }

    @Bean(name = "sqlSessionTemplate")
    public SqlSessionTemplate sqlSessionTemplate(@Qualifier("sqlSessionFactory") SqlSessionFactory sqlSessionFactory ) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
