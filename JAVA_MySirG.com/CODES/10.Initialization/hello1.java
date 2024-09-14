public class hello1 {
    private int x;
    { // initializatin block
        System.out.println("initialization block: x= "+x);
        x=5;
    }
    public hello1(){
        System.out.println("constructor: x ="+x);
    }
    public static void main(String[] args) {
        hello1 h1=new hello1();
    }
}
