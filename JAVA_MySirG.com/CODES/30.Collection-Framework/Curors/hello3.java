// ListIterator
import java.util.*;

public class hello3 {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.add("C");
        list.add("C++");
        list.add("java");
        list.add("PHP");
        System.out.println(list);
        ListIterator lit=list.listIterator();

        while(lit.hasNext()){
            String s=(String)lit.next();
            if (s.equals("C"))
                lit.add("DSA");
            else if(s.equals("java"))
                lit.set("Java SE");
            else if(s.equals("PHP"))
                lit.remove();
        }
        System.out.println(list);
    }
    
}
