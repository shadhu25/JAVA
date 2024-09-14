import java.util.*;
import java.io.*;
public class hello {
    public static void main(String[] args) {
        // using Collection interface methods
        ArrayList l=new ArrayList();
        l.add(66); // adding element in ArrayList
        l.add(76);
        l.add(64);
        ArrayList l1=new  ArrayList();
        l.addAll(l1); // we  can add another collection too
        l.remove(76); // removing a specific element in ArrayList
        l.removeAll(l1); // removing collection in ArrayList
        l.retainAll(l1); // only l1 elements will remain rest will deleted
        int i=l.size(); // returns the total number of element in the ArrayList
        boolean b=l.contains(l1); // cheking l1 is present in ArrayList or not
        if(b)
            System.out.println("li exist.");
        else
            System.out.println("li not exist.");
        l.clear(); // crearing all element in the ArrayList
        b=l.isEmpty(); // cheking if Arraylist is empty or not
        if(b)
            System.out.println("empty");
        else
            System.out.println("not empty");
        // printing all elements of the ArrayList
        Iterator it=l.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // using List interface methods
        l.add(3,77); // inserts the specified element at the spedified position in this list(elements may shift)
        l.set(2,98); // inserts the specified element at the spedified position in this list(elements may not shift)
        l.get(3); // returns the element at the specified posision in this list.
        l.indexOf(76); // returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contains the element.
        l.lastIndexOf(98); // returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contains the element.
        l.remove(3); // removes the element at the specified position in this list
        List l3=l.subList(1, 3);

    }
}
