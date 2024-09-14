package _13Thread_Excecution.Challenges;

public class Threads extends Thread{
    private static int thread=0;
    private  final int numThread;
    public Threads() {
        thread++;
        this.numThread = thread;
    }
    public int getNumThread() {
        return numThread;
    }
    @Override
    public void run() {
        for (int i = 0; i < 9; i++)
            System.out.println("Hello from Thread "+numThread);
    }

    public static void main(String[] args) {
        Threads t1=new Threads();
        Thread t2=new Threads();
        t1.start();
        t2.start();
    }
}
