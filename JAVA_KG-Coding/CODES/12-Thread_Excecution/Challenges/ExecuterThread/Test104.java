package _13Thread_Excecution.Challenges.ExecuterThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Test104 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service= Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            Challenge104 task=new Challenge104();
            service.submit(task);
        }
        service.shutdown();
        if(!service.awaitTermination(10, TimeUnit.SECONDS)){
            System.out.println("EMERGENCY EXIT");
            service.shutdownNow();
        }

    }
}
