package com.swift.job.job1;

import lombok.extern.slf4j.Slf4j;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;


/**
 * HelloJob
 *
 * @author sqt
 * @date 19-5-6
 **/
@Slf4j
public class HelloJob implements Job {
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        // Say Hello to the World and display the date/time
        log.info("Hello World! - 当前线程:{}" + Thread.currentThread().getName());
    }
}
