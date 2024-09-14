import java.util.*;

public class dummy {
    public static void main(String[] args) {
        ArrayList l2=new ArrayList<>();
        l2.add("Ram");
        l2.add("Sita");
        l2.add(1,44);
        Iterator it=l2.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
