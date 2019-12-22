package com.swift.job.job1;

import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * MinuteJob
 *
 * @author sqt
 * @date 19-5-6
 **/
@Slf4j
public class MinuteJob implements Job {

    public void execute(JobExecutionContext context) throws JobExecutionException {
        log.info("JobName: {}", context.getJobDetail().getKey().getName());
    }
}
