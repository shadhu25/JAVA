class Outer{
    public int x;
    public static int y;
    void f1(){
        System.out.println("hello bhai");
    }
    static class Inner1{
        public void f2(){
            System.out.println("y= "+y);
            // System.out.println("x= "+x); error
        } 
    }
    class Inner2{
        public void f2(){
            System.out.println("y= "+y);
            System.out.println("x= "+x);
        } 
    }

}
public class hello{
    public static void main(String[] args) {
        // when the inner class is static
        Outer.Inner1 o1=new Outer.Inner1();
        o1.f2();

        // when the inner class is non static
        Outer o=new Outer();
        Outer.Inner2 o2=o.new Inner2();
        
    }
}