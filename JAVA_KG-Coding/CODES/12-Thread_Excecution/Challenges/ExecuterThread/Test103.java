package _13Thread_Excecution.Challenges.ExecuterThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test103 {
    public static void main(String[] args) {
        ExecutorService service= Executors.newSingleThreadExecutor();
        Challenge103 task1=new Challenge103();
        Challenge103 task2=new Challenge103();
        Challenge103 task3=new Challenge103();
        Challenge103 task4=new Challenge103();
        service.submit(task1);
        service.submit(task2);
        service.submit(task3);
        service.submit(task4);
        service.shutdown();
    }
}

/**
 *
 *
 *
 */
