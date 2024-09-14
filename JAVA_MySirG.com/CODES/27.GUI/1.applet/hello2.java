import java.applet.*;
import java.awt.event.*;
import java.awt.*;
/* <applet code="hello" width="300" height="250"> </applet> */
public class hello extends Applet {
    Label l1,l2,l3,l4;
    TextField t1,t2;
    Button b1;
    public void init(){
        l1=new Label("First No. :-");
        l2=new Label("Second No. :-");
        l3=new Label("Result :-");
        l4=new Label();
        t1=new TextField();
        t2=new TextField();
        b1=new Button("ADD");
        setLayout(null);
        l1.setBounds(30, 50, 100, 20);
        t1.setBounds(100, 50, 100, 30);
        l2.setBounds(30, 80, 100, 20);
        t2.setBounds(100, 80, 100, 30);
        b1.setBounds(55, 110, 100, 30);
        l3.setBounds(30, 140, 100, 20);
        l4.setBounds(100, 140, 100, 30);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        add(l3);
        add(l4);
        b1.addActionListener(new myHandler());
    }
    class myHandler implements ActionListener {
        public void actionPerformed(ActionEvent e){
            int a,b,s;
            a=Integer.parseInt(t1.getText());
            b=Integer.parseInt(t1.getText());
            s=a+b;
            l4.setText(" "+s);
        }
    }
}
