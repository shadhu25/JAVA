package _13Thread_Excecution.Lectures.ExecuterService;

public class ApplyingExecutors implements Runnable{
    private final char targetChar;

    public ApplyingExecutors(char targetChar) {
        this.targetChar = targetChar;
    }

    public char getTargetChar() {
        return targetChar;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.print("i"+targetChar+" ");
        }
        System.out.printf("\n%s %c task finished\n",Thread.currentThread().getContextClassLoader(),targetChar);
    }
}
