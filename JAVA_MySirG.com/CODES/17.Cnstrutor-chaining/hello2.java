// my experiment
import java.util.Scanner;
class A{
    int a;
    A(){
        this(0);
        System.out.println("default: A");
        a=33;
        System.out.println(a);
    }
    A(int y){
        Scanner cs=new Scanner(System.in);
        System.out.print("Enter a integer of class A: ");
        a=cs.nextInt();
        System.out.println(a);
    }
}
class B extends A{
    int b;
    B(){
        this(0);
        System.out.println("default: B");
        b=33;
        System.out.println(b);
    }
    B(int m){
        super();
        Scanner cs=new Scanner(System.in);
        System.out.print("Enter a integer of class B: ");
        b=cs.nextInt();
        System.out.println(b);
    }
}

public class hello2 {
    public static void main(String[] args) {
        B b1=new B();
    }
}
