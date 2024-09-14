// static members in inheritance
class parent{
    static int y=4;
    public static void f1(){ System.out.println("parent");}
}

class child extends parent{
    static int y;
    static{ y=10;}
    public static void f1(){ System.out.println("child");} // function hiding
}


public class hello {
    public static void main(String[] args) {
        child.f1();
        System.out.println("y = "+child.y); 
    }
    
}
