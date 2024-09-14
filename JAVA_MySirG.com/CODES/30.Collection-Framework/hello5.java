import java.util.*;
public class hello5 {
    public static void main(String[] args) {
        LinkedHashSet lh=new LinkedHashSet();
        lh.add("One");
        lh.add("Two");
        lh.add("Three");
        lh.add("One");
        System.out.println(lh);
    }
}
