package _13Thread_Excecution.Lectures;

public class NeedForThread {
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        // First task
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d* ",i);
        }
        System.out.println("\n* task completed");
        // Second task
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d$ ",i);
        }
        System.out.println("\n$ task completed");
        // Third task
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d# ",i);
        }
        System.out.println("\n# task completed");
        long endTime=System.currentTimeMillis();
        System.out.println("The total time: "+(endTime-startTime));
    }
}
