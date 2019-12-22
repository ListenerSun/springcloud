package com.swift.config;

import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.ee.servlet.QuartzInitializerListener;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

import java.io.IOException;
import java.util.Properties;

/**
 * 配置任务调度中心
 * [QRTZ_JOB_DETAILS], [QRTZ_TRIGGERS] and [QRTZ_CRON_TRIGGERS]
 * @author lance
 */
@Configuration
public class QuartzConfig {

//	@Autowired
//	private SpringJobFactory springJobFactory;
//
//	@Bean(name="SchedulerFactory")
//	public SchedulerFactoryBean schedulerFactoryBean() throws IOException {
//		SchedulerFactoryBean factory = new SchedulerFactoryBean();
//		factory.setAutoStartup(true);
//		//延时5秒启动
//		factory.setStartupDelay(5);
//		factory.setQuartzProperties(quartzProperties());
//		factory.setJobFactory(springJobFactory);
//		return factory;
//	}
//
//	/**quartz初始化监听器
//	 * @return
//	 */
//
//	@Bean
//	public QuartzInitializerListener executorListener() {
//		return new QuartzInitializerListener();
//	}
//
//	/**
//	 * 通过SchedulerFactoryBean获取Scheduler的实例
//	 */
//	@Bean(name="Scheduler")
//	public Scheduler scheduler() throws IOException {
//		return schedulerFactoryBean().getScheduler();
//	}
//
//	/**
//	 * 设置quartz属性
//	 * @throws IOException
//	 * 2016年10月8日下午2:39:05
//	 */
//	@Bean
//	public Properties quartzProperties() throws IOException {
//		Properties prop = new Properties();
//		prop.put("quartz.scheduler.instanceName", "ServerScheduler");
//		prop.put("org.quartz.scheduler.instanceId", "AUTO");
//		prop.put("org.quartz.scheduler.skipUpdateCheck", "true");
//		prop.put("org.quartz.scheduler.instanceId", "NON_CLUSTERED");
//		prop.put("org.quartz.scheduler.jobFactory.class", "org.quartz.simpl.SimpleJobFactory");
//		prop.put("org.quartz.jobStore.class", "org.quartz.impl.jdbcjobstore.JobStoreTX");
//		prop.put("org.quartz.jobStore.driverDelegateClass", "org.quartz.impl.jdbcjobstore.StdJDBCDelegate");
//		prop.put("org.quartz.jobStore.dataSource", "quartzDataSource");
//		prop.put("org.quartz.jobStore.tablePrefix", "QRTZ_");
//		prop.put("org.quartz.jobStore.isClustered", "true");
//		prop.put("org.quartz.threadPool.class", "org.quartz.simpl.SimpleThreadPool");
//        prop.put("org.quartz.threadPool.threadCount", "5");
//		prop.put("org.quartz.dataSource.quartzDataSource.driver", "com.mysql.jdbc.Driver");
//		prop.put("org.quartz.dataSource.quartzDataSource.URL", "jdbc:mysql://localhost:3306/test01");
//		prop.put("org.quartz.dataSource.quartzDataSource.user", "root");
//		prop.put("org.quartz.dataSource.quartzDataSource.password", "123456");
//		prop.put("org.quartz.dataSource.quartzDataSource.maxConnections", "10");
//		return prop;
//	}
}