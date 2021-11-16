package Problem10_jobScheduler;

public class main {
    public static void main(String[] args) throws InterruptedException {
        jobScheduler js=new jobScheduler();
       jobTask jt=new jobTask();
       js.JobExecute(jt,1000);
    }
}
