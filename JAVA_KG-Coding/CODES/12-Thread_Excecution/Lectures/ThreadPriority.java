package _13Thread_Excecution.Lectures;

import _13Thread_Excecution.Lectures.ThreadClass.ApplyingThread;

public class ThreadPriority {
    public static void main(String[] args) throws InterruptedException {
        long startTime=System.currentTimeMillis();
        ApplyingThread t1=new ApplyingThread('*');
        t1.setPriority(Thread.MIN_PRIORITY); // 1
        ApplyingThread t2=new ApplyingThread('$');
        t2.setPriority(Thread.NORM_PRIORITY); // default: 5
        ApplyingThread t3=new ApplyingThread('#');
        t3.setPriority(Thread.MAX_PRIORITY); // 10
        t1.start();
        t2.start();
        t3.start();
        long endTime=System.currentTimeMillis();
        System.out.printf("\nThe total time: %d\n",(endTime-startTime));
    }
}
