package _13Thread_Excecution.Lectures;

public class ThreadSleep {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main thread is started");
        Thread.sleep(10000);
        System.out.println("main thread is ended");
    }
}
