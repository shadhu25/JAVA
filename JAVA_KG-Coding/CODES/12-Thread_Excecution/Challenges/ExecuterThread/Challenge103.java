package _13Thread_Excecution.Challenges.ExecuterThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Challenge103 implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++)
            System.out.print(i+" ");
        System.out.println();
    }
}
