// MAP : HashMap
import java.util.*;
public class hello10 {
    public static void main(String[] args) {
        HashMap hm=new HashMap<>();
        hm.put(null, null);
        hm.put(1,"Krishna");
        hm.put(2,"Radha");
        hm.put(3,"Sita");
        hm.put(null, null);
        hm.put(4,"Ram");
        hm.put(5,"Nishu");
        hm.putAll(hm);
        System.out.println(hm);
        hm.remove(2);
        System.out.println(hm);
        System.out.println(hm.get(1));
        boolean i=hm.containsKey(4);
        System.out.println(i);
        i=hm.containsValue("Nishu");
        System.out.println(i);
        Set hm1=hm.keySet();
        System.out.println(hm1);
        Set hm2=hm.entrySet();
        System.out.println(hm2);
    }
}
