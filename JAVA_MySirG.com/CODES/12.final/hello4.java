// final keyword
final class dummy { } // final class: we cannot inherit it


public class hello4 {
    private final int a; // final instance member variable
    private final static int b; // final static member variable
    {
        a=10;
        System.out.println(a);
    }

    public final void fun(){ // final instance member function: we cannot override it
        final int x; // final local variable: it cannot initialise after declation it only initialise when we declare it.
     }

    hello4(){
        // a=11;
        // b=11; cannot assign final static vatiable in constructor
        System.out.println(a);
        System.out.println(b); // we can use it in constructor
    }
    static {
        b=11;
        System.out.println(b);
    }
    public static void main(String[] args) {
        hello4 obj = new hello4();
    }
}
