import java.applet.*;
import java.awt.event.*;
import java.awt.*;
/* <applet code="hello" width="300" height="250">
    <param name="site" value="Iron Man"/>
 </applet> */
public class hello extends Applet {
    private String defaultMessage="Hello World";
    public void paint(Graphics g){
        String s1=getParameter("site");
        if(s1==null)
            s1=defaultMessage;

        g.drawString(s1, 100, 100);
    }
}
