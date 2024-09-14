abstract class hello{ // abstract class

}

class hello1 extends hello{

}

public class abstractExample1{
    public static void main(String[] args) {
        // hello obj1=new hello(); we cannot create object of a abstract class
        hello obj2=new hello1(); // but we can create a referance of a abstract class size of child class
    }
}