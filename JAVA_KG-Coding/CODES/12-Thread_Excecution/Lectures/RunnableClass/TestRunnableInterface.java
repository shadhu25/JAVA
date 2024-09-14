package _13Thread_Excecution.Lectures.RunnableClass;

public class TestRunnableInterface {
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        ApplyingRunnable p1=new ApplyingRunnable('*');
        ApplyingRunnable p2=new ApplyingRunnable('$');
        ApplyingRunnable p3=new ApplyingRunnable('#');
        Thread t1=new Thread(p1);
        Thread t2=new Thread(p2);
        Thread t3=new Thread(p3);
        t1.start();
        t2.start();
        t3.start();
        long endTime=System.currentTimeMillis();
        System.out.printf("\nThe total time: %d\n",(endTime-startTime));
    }
}
