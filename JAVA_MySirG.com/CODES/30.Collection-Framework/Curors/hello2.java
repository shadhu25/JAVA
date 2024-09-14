// Iterator
import java.util.*;

public class hello2 {
    public static void main(String[] args) {
        ArrayList a=new ArrayList();
        for(int i=0;i<10;i++,a.add(i));
        System.out.println(a);
        Iterator it=a.iterator();
        while(it.hasNext()){
            Integer i=(Integer)it.next();
            if(i>3 && i<7)
                it.remove();
        }
        System.out.println(a);
    }
}
