abstract class hello{
    abstract void show(); // abstract method
}

class hello1 extends hello{
    // The type hello1 must implement the inherited abstract method hello.show()
    void show(){

    }
}

public class abstractExample2 {
    public static void main(String[] args) {
        hello1 obj1=new hello1();
        obj1.show();
    }
}
