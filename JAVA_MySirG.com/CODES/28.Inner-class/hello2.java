class India{
    public void f1(){
        System.out.println("hii bhai");
    }
}

class Greeting {
    India I=new India(){
        public void f1(){
            System.out.println("hii bhaiya");
        }
    };
}
public class hello2 {
    public static void main(String[] args) {
        Greeting o1=new Greeting();
        o1.I.f1();
    }
    
}
