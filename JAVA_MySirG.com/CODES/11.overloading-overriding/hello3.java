// Overloading and Overriding
class A{
    public void f1(int a){
        System.out.println("Class A");
    }
}

class B extends A{
    public void f1(int a){ // overriding
        System.out.println("Class B: overrided");
    }
    public void f1(int a,int b){ // overloading
        System.out.println("Class B");
    }
}

public interface hello3 {
    public static void main(String[] args) {
        B obj = new B();
        obj.f1(0);
        obj.f1(0, 0);
        A obj1 = new A();
        obj1.f1(2);
    }
}
