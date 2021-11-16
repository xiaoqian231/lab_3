package Problem10_jobScheduler;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class jobSchedulerTest  {
    @Test
    public void jobSchedulerTest() throws InterruptedException {
        jobScheduler js=new jobScheduler();
        jobTask jt=new jobTask();
        js.JobExecute(jt,1000);

    }
}