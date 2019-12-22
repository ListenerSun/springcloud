package com.swift.job.job1;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import java.util.Date;

import static org.quartz.CronScheduleBuilder.cronSchedule;
import static org.quartz.DateBuilder.evenSecondDate;
import static org.quartz.JobBuilder.newJob;
import static org.quartz.TriggerBuilder.newTrigger;

/**
 * QuartzSimple
 *
 * @author sqt
 * @date 19-5-6
 **/
public class QuartzSimple {

    public static void main(String[] args) throws SchedulerException {
        //这是通过创建StdSchedulerFactory然后使用它来创建调度程序来完成的。这将创建一个简单的，基于RAM的调度程序
        SchedulerFactory sf = new StdSchedulerFactory();
        Scheduler sched = sf.getScheduler();
        // 使用JobDetail类将HelloJob定义为Job to Quartz
        JobDetail job = newJob(HelloJob.class)
                .withIdentity("job1", "group1")
                .build();
        // 我们创建了一个SimpleTrigger，将在下一轮分钟开始：
        Date runTime = evenSecondDate(new Date());

        // Trigger the job to run on the next round minute
        Trigger trigger = newTrigger()
                .withIdentity("trigger1", "group1")
                .withSchedule(cronSchedule("0/2 * * * * ?"))
                .build();
        sched.scheduleJob(job, trigger);
        sched.start();
    }
}
