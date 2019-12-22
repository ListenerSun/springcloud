package com.swift.job.job2;

import lombok.extern.slf4j.Slf4j;
import org.quartz.*;

import java.util.Date;

/**
 * StatefulDumbJob
 *
 * @author sqt
 * @date 19-5-7
 **/
@Slf4j
//@PersistJobDataAfterExecution  //该注解可以帮助统计该任务的执行次数
@DisallowConcurrentExecution
public class StatefulDumbJob implements Job {

    //用来保存执行次数
    public static final String NUM_EXECUTIONS = "NumExecutions";
    //用来模拟该任务的执行时间
    public static final String EXECUTION_DELAY = "ExecutionDelay";

    public StatefulDumbJob() {
    }
    public void execute(JobExecutionContext context)
            throws JobExecutionException {
        System.err.println("---" + context.getJobDetail().getKey()
                + " executing.[" + new Date() + "]");

        JobDataMap map = context.getJobDetail().getJobDataMap();

        int executeCount = 0;
        if (map.containsKey(NUM_EXECUTIONS)) {
            executeCount = map.getInt(NUM_EXECUTIONS);
        }

        executeCount++;
        map.put(NUM_EXECUTIONS, executeCount);

        Long delay = 5000L;
        if (map.containsKey(EXECUTION_DELAY)) {
            delay = map.getLong(EXECUTION_DELAY);
        }

        try {
//            Thread.sleep(delay);
        } catch (Exception ignore) {
        }

        System.err.println("  -" + context.getJobDetail().getKey()
                + " complete (" + executeCount + ").");
    }
}
