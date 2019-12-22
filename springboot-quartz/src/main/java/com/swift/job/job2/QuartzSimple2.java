package com.swift.job.job2;

import com.swift.job.job1.HelloJob;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import java.util.Date;

import static org.quartz.CronScheduleBuilder.cronSchedule;
import static org.quartz.DateBuilder.evenSecondDate;
import static org.quartz.JobBuilder.newJob;
import static org.quartz.SimpleScheduleBuilder.simpleSchedule;
import static org.quartz.TriggerBuilder.newTrigger;

/**
 * QuartzSimple
 *
 * @author sqt
 * @date 19-5-6
 **/
public class QuartzSimple2 {

    public static void main(String[] args) throws SchedulerException {
        //这是通过创建StdSchedulerFactory然后使用它来创建调度程序来完成的。这将创建一个简单的，基于RAM的调度程序
        SchedulerFactory sf = new StdSchedulerFactory();
        Scheduler sched = sf.getScheduler();
        // 使用JobDetail类将HelloJob定义为Job to Quartz
        JobDetail job = newJob(StatefulDumbJob.class)
                .withIdentity("statefulJob1", "group1")
                .usingJobData(StatefulDumbJob.EXECUTION_DELAY, 1000L)
                .build();

        SimpleTrigger trigger = newTrigger()
                .withIdentity("trigger1", "group1")
                .startAt(new Date())
                .withSchedule(simpleSchedule()
                        //每隔2秒触发一次任务
                        .withIntervalInSeconds(2)
                        .repeatForever())
                .build();

        sched.scheduleJob(job, trigger);
        sched.start();
    }
}
