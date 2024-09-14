package _13Thread_Excecution.Lectures.ThreadClass;

public class TestThreadClass {
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        ApplyingThread t1=new ApplyingThread('*');
        ApplyingThread t2=new ApplyingThread('$');
        ApplyingThread t3=new ApplyingThread('#');
        t1.start();
        t2.start();
        t3.start();
        long endTime=System.currentTimeMillis();
        System.out.printf("\nThe total time: %d\n",(endTime-startTime));
    }
}
