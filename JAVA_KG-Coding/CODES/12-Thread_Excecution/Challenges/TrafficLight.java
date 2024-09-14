package _13Thread_Excecution.Challenges;

public class TrafficLight extends Thread{
    private  final TrafficColor signal;
    public TrafficLight(TrafficColor signal) {
        this.signal=signal;
    }

    @Override
    public void run() {
            System.out.println(signal);
    }

    public static void main(String[] args) throws InterruptedException {
        TrafficLight t1 = new TrafficLight(TrafficColor.RED);
        TrafficLight t2 = new TrafficLight(TrafficColor.GREEN);
        TrafficLight t3 = new TrafficLight(TrafficColor.YELLOW);
//        System.out.println("Thread1"+" state: " + t1.getState());
        t1.start();
        sleep(5000);
//        System.out.println("Thread1"+ " state: " + t1.getState());
//        System.out.println("Thread2"+ " state: " + t2.getState());
        t2.start();
        sleep(5000);
//        System.out.println("Thread2"+ " state: " + t2.getState());
//        System.out.println("Thread3"+ " state: " + t3.getState());
        t3.start();
        sleep(5000);
//        System.out.println("Thread3"+ " state: " + t3.getState());
    }
}
