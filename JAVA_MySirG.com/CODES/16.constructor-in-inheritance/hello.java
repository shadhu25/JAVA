// constructor in inheritance
class A{
    int a;
    A(){
        System.out.println("Class: A");
    }
}
class B extends A{
    int b;
    B(){
        super(); // this is optional
        System.out.println("Class: B");
    }
}
public class hello {
    public static void main(String[] args) {
        B b1=new B();
    }
}
