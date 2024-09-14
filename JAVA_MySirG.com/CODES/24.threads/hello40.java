class A1 extends Thread{
    public void run(){
        for(int i=0;i<50;i++)
            System.out.println("Thread A: "+i);
    }
}
class B1 extends Thread{
    public void run(){
        for(int i=0;i<50;i++)
            System.out.println("Thread B: "+i);
    }
}
public class hello40 {
    public static void main(String[] args) {
        A1 t1=new A1();
        B1 t2=new B1();
        t1.start();
        t2.start();
    }
}
