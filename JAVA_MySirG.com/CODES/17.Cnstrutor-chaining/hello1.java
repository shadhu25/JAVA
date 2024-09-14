// constructor chaining
class A{
    int a;
    A(){
        System.out.println("default: A");
    }
    A(int y){
        a=y;
        System.out.println(a);
    }
}
class B extends A{
    int b;
    B(){
        //super(); // this is optional
        System.out.println("default: B");
    }
    B(int m, int n){
        super(m);
        b=n;
        System.out.println(b);
    }
}

public class hello1 {
    public static void main(String[] args) {
        B b1=new B(7,8);
    }
}
