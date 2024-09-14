package _13Thread_Excecution.Challenges.ExecuterThread;

import java.util.concurrent.*;

public class Test105 {
    public static int getRandom(){
        double random=Math.random()*20+1;
        return Math.abs((int)random);
    }
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service= Executors.newFixedThreadPool(1);
        Challenge105 task1=new Challenge105(getRandom());
        Challenge105 task2=new Challenge105(getRandom());
        Challenge105 task3=new Challenge105(-33);
        Challenge105 task4=new Challenge105(getRandom());
        Challenge105 task5=new Challenge105(getRandom());
        Future<Integer> fact1=service.submit(task1);
        Future<Integer> fact2=service.submit(task2);
        Future<Integer> fact3=service.submit(task3);
        Future<Integer> fact4=service.submit(task4);
        Future<Integer> fact5=service.submit(task5);
        System.out.println("Factorial1"+": "+fact1.get());
        System.out.println("Factorial2"+": "+fact2.get());
        System.out.println("Factorial3"+": "+fact3.get());
        System.out.println("Factorial4"+": "+fact4.get());
        System.out.println("Factorial5"+": "+fact5.get());
        service.shutdown();
        if(!service.awaitTermination(10, TimeUnit.SECONDS)){
            System.out.println("BOHOT HUA BAAS KAR YAAR.....");
            service.shutdownNow();
        }
    }
}
