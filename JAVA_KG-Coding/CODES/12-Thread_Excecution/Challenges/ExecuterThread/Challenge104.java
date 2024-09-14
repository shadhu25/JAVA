package _13Thread_Excecution.Challenges.ExecuterThread;

import java.util.Stack;

public class Challenge104 implements Runnable{
    public void run() {
            Thread current=Thread.currentThread();
           try {
               System.out.println("started Thraed"+"  "+current.getName());
               Thread.sleep(getRandom()* 1000L);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
        System.out.println("Ended Thraed"+"  "+current.getName());
       }
    public int getRandom(){
           double random=Math.random()*5+1;
           return (int)random;
    }
}
