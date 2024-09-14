import javax.swing.*;
public class hello extends JFrame {
    JLabel l1,l2,l3,l4;
    JTextField t1,t2;
    JButton b1;
    hello(){}
    hello(String s){
        super(s);
    }
    public void setComponents(){
        l1=new JLabel("Sum of two numbers");
        l2=new JLabel("First Number");
        l3=new JLabel("Second Number");
        l4=new JLabel();
        t1=new JTextField();
        t2=new JTextField();
        b1=new JButton("ADD");
        add(l1);
        add(l2);
        add(t1);
        add(l3);
        add(t2);
        add(b1);
        add(l4);
        setLayout(null);
        l1.setBounds(70,30,200,20);
        l2.setBounds(30,80,100,20);
        t1.setBounds(130, 80, 100, 20);
        l3.setBounds(30,130,100,20);
        t2.setBounds(130, 130, 100, 20);
        b1.setBounds(90, 160, 100, 30);
        l4.setBounds(50, 200, 100, 20);
    }
    public static void main(String[] args) {
        hello jf=new hello("Radha Krishna");
        jf.setSize(300, 300);
        jf.setComponents();
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
