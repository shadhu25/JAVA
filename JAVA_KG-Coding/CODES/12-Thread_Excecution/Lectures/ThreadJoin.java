package _13Thread_Excecution.Lectures;

import _13Thread_Excecution.Lectures.ThreadClass.ApplyingThread;

public class ThreadJoin {
    public static void main(String[] args) throws InterruptedException {
        long startTime=System.currentTimeMillis();
        ApplyingThread t1=new ApplyingThread('*');
        ApplyingThread t2=new ApplyingThread('$');
        ApplyingThread t3=new ApplyingThread('#');
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
        long endTime=System.currentTimeMillis();
        System.out.printf("\nThe total time: %d\n",(endTime-startTime));
    }
}
