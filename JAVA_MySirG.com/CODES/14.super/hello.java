// super
class A{
    int z;
    public void f1(){ }
}

class B extends A{
    private int z;
    public void f1(){
        super.f1(); // f1 of class A will invoke
    }
    public void f2(){
        int z; 
        z=5;
        this.z=6; // assine in z of class B
        super.z=8; // assine in z of class A
    }
}

public class hello {
    
    public static void main(String[] args) {
        B obj = new B();
        obj.f1();
        obj.f2();
    }
}