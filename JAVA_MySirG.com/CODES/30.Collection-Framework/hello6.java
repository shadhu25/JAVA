import java.util.*;
public class hello6 {
    public static void main(String[] args) {
        TreeSet t=new TreeSet();
        t.add("B");
        t.add("A");
        t.add("D");
        t.add("C");
        t.add("F");
        System.out.println(t);
        // using the SortedSet inteface methods
        System.out.println(t.last()); // return the last element of the treeset
        System.out.println(t.first()); // return the first element of the treeset
        System.out.println(t.headSet("C")); // returns the all elements strictly less than given element
        System.out.println(t.tailSet("C")); // returns the all elements greater than given element
        System.out.println(t.subSet("B","D")); // return the itermediat collection in thus set
        // using the NavigableSet interface methods
        System.out.println(t.ceiling("E")); // return the lesser or same value from entered value
        System.out.println(t.floor("E")); // retrun the greater or same value from entered value
        System.out.println(t.higher("E")); // return the graeter value from entered value
        System.out.println(t.lower("E")); // return the lesser value from entered value
        System.out.println(t.pollFirst()); // remove the first element of the set
        System.out.println(t.pollLast()); // remove the last element of the set
        System.out.println(t);
    }
}
