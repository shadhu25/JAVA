import java.applet.*;
import java.util.*;
import java.awt.*;
/* <applet code="hello" width="300" height="250"> </applet> */
public class hello extends Applet implements Runnable {
    Thread t,t1;
    public void start(){
        t=new Thread(this);
        t.start();
    }
    public void run(){
        t1=Thread.currentThread();
        while(t == t1){
            repaint();
            try{
                t1.sleep(1000);
            }
            catch(InterruptedException e){}
        }
    }
    public void paint(Graphics g){
        Calendar cal =new GregorianCalendar();
        String hour=String.valueOf(cal.get(Calendar.HOUR));
        String minute=String.valueOf(cal.get(Calendar.MINUTE));
        String second=String.valueOf(cal.get(Calendar.SECOND));
        g.drawString(hour+" : "+minute+" : "+second, 30, 30);
    }
}
