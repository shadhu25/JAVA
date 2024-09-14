import java.util.Stack;
public class hello3 {
    public static void main(String[] args) {
        Stack s1=new Stack();
        s1.push(66);
        s1.push("raju");
        s1.push(67);
        s1.push("chandu");
        s1.push(68);
        s1.push("kapil");
        while(!s1.empty()){ System.out.println(s1.pop()); }
    }
}
