package _13Thread_Excecution.Lectures.Futures;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestFutures {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(1);
        FetchName task1 = new FetchName("Krishna");
        FetchName task2 = new FetchName("Radha");
        FetchName task3 = new FetchName("Ram");
        FetchName task4 = new FetchName("Sita");
        Future<String> name1 = service.submit(task1);
        Future<String> name2 = service.submit(task2);
        Future<String> name3 = service.submit(task3);
        Future<String> name4 = service.submit(task4);
        System.out.println("Name1: "+name1.get());
        System.out.println("Name2: "+name2.get());
        System.out.println("Name3: "+name3.get());
        System.out.println("Name4: "+name4.get());
        service.shutdown();
    }
}