public class hello2 {
    private static int x;
    static{ // static initializatin block
        System.out.println("static initialization block: x= "+x);
        x=5;
    }
    public hello2(){
        System.out.println("constructor: x ="+x);
    }
    public static void main(String[] args) {
        
    }
}