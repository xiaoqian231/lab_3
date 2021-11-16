package Problem10_jobScheduler;

import java.util.Date;

public class jobTask implements Runnable {


    @Override
    public void run() {
        System.out.println("function called" );
        System.out.println(Thread.currentThread().getName()+" end Time for "+" "+new Date());
    }
}
