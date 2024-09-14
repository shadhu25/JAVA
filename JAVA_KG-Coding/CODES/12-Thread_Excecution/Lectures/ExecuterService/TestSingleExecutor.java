package _13Thread_Excecution.Lectures.ExecuterService;

import java.util.concurrent.ExecutorService;

public class TestSingleExecutor {
    public static void main(String[] args) {
        ExecutorService executor= java.util.concurrent.Executors.newSingleThreadExecutor();
        ApplyingExecutors task=new ApplyingExecutors('*');
        executor.submit(task);
        executor.shutdown();
    }
}
