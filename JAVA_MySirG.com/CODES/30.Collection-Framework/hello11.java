// Collections class
import java.util.*;
public class hello11 {
    public static void main(String[] args) {
        Vector <Integer> v=new Vector<>();
        v.add(20);
        v.add(40);
        v.add(70);
        v.add(50);
        v.add(30);
        System.out.println(v);
        // Using methods of collections class
        Collections.sort(v);
        System.out.println(v);
        int x=Collections.binarySearch(v,70);
        System.out.println(x);
        Collections.reverse(v);
        System.out.println(v);
        Collections.shuffle(v);
        System.out.println(v);
        Collections.swap(v, 2, 4);
        System.out.println(v);
        Vector <Integer>v1=new Vector<>(10);
        v1.add(0);
        v1.add(0);
        v1.add(0);
        v1.add(0);
        v1.add(0);
        v1.add(0);
        Collections.copy(v1,v);
        System.out.println(v1);
        System.out.println(Collections.min(v));
        System.out.println(Collections.max(v));

    }
}
