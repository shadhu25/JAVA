interface myInterface{
    // interface do not have constructor
    int x; // they implicitly as public final static 
    void f1(); // they implicitly as abstract method
    void f2();
    void f3();
}
interface I1{
    void f4();
}
interface I2{
    void f5();
}
interface I3 extends I1,I2{ // a interface can extends multiple interface 
    void f6();
}

class A implements myInterface{
    public void f1(){ } // compulsory
    public void f2(){ } // compulsory
    public void f3(){ } // compulsory
    void fun(){}
}
 abstract class B implements myInterface{ // it must be an abstract class beacuse it has to override every method that are present in the interface
    public void f1(){ }
    public void f2(){ }
}
class C implements I1,I2,I3{
    // a class can implement multiple interfaces
    public void f4(){}
    public void f5(){}
    public void f6(){}
}
class D extends A implements myInterface{
    public void f1(){ }
    public void f2(){ }
    public void f3(){ }
}
public class Interface {
    public static void main(String[] args) {
        // myInterface I=new myInterface(); we cannot create any of a interface
        myInterface I1=new A(); // but we can create a referance vareable of a interface with size of its implemented class
        // I1.fun(); it only call functions that are present in interface myInterface

    }
}
