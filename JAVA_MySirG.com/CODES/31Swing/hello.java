import javax.swing.*;
public class hello extends JFrame{
    hello(){}
    hello(String s){
        super(s);
    }
    public static void main(String[] args) {
        hello jf=new hello("Radha Krishna");
        jf.setSize(300, 300);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
