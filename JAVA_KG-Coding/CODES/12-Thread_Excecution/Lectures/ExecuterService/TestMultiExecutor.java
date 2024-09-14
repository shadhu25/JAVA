package _13Thread_Excecution.Lectures.ExecuterService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestMultiExecutor {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service= Executors.newFixedThreadPool(3);
        ApplyingExecutors task1=new ApplyingExecutors('*');
        ApplyingExecutors task2=new ApplyingExecutors('$');
        ApplyingExecutors task3=new ApplyingExecutors('#');
        service.submit(task1);
        service.submit(task2);
        service.submit(task3);
        service.submit(task3);
        service.submit(task3);
        service.submit(task3);
        service.shutdown();
        System.out.println("\n***********************1\n");
        if(!service.awaitTermination(200,TimeUnit.MILLISECONDS)){
            System.out.println("\n***********************2\n");
            service.shutdownNow();
        }
    }
}
