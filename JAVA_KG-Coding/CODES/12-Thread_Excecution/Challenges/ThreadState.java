package _13Thread_Excecution.Challenges;

public class ThreadState extends Thread{
    @Override
    public void run() {

        try {
            Thread.sleep(5000);
            System.out.println("In run method "+ getState());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadState t1=new ThreadState();
        System.out.println("Thread started "+t1.getState());
        t1.start();
        t1.join();
        System.out.println("after sleep "+t1.getState());
    }
}
