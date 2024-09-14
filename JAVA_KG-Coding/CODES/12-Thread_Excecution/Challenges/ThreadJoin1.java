package _13Thread_Excecution.Challenges;

public class ThreadJoin1 extends Thread{
    private static int thread=0;
    private  final int numThread;
    public ThreadJoin1() {
        thread++;
        this.numThread = thread;
    }
    public int getNumThread() {
        return numThread;
    }
    @Override
    public void run() {
            System.out.println("Hello from Thread "+numThread);
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadJoin1 t1=new ThreadJoin1();
        ThreadJoin1 t2=new ThreadJoin1();
        ThreadJoin1 t3= new ThreadJoin1();
        System.out.println("Thread"+t1.getNumThread()+" state: "+t1.getState());
        t1.start();
        t1.join();
        System.out.println("Thread"+t1.getNumThread()+" state: "+t1.getState());
        System.out.println("Thread"+t2.getNumThread()+" state: "+t2.getState());
        t2.start();
        t2.join();
        System.out.println("Thread"+t2.getNumThread()+" state: "+t2.getState());
        System.out.println("Thread"+t3.getNumThread()+" state: "+t3.getState());
        t3.start();
        t3.join();
        System.out.println("Thread"+t3.getNumThread()+" state: "+t3.getState());
    }
}
