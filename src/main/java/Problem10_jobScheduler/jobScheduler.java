package Problem10_jobScheduler;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


//Implement a job scheduler which takes in a function f and an integer n,
// and calls f after n milliseconds.
public class jobScheduler {
    ScheduledThreadPoolExecutor ST= new ScheduledThreadPoolExecutor(5);
public void JobExecute( jobTask jobTask,long time ) throws InterruptedException {
    System.out.println(Thread.currentThread().getName()+" Start Time for "+" "+new Date());
    ST.schedule(jobTask,time, TimeUnit.MILLISECONDS);
    ST.shutdown();
}
}
