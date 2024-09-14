// linked list
import java.util.*;
public class hello2 {
    public static void main(String[] args) {
        LinkedList l1=new LinkedList();
        l1.addFirst("Krishna");
        l1.addLast("Radha");
        l1.add(1,"Nishu");
        System.out.println(l1.getFirst());
        System.out.println(l1.get(1));
        System.out.println(l1.getLast());
        l1.removeFirst();
        l1.removeLast();
        System.out.println(l1.getFirst());
        System.out.println(l1.getLast());
        l1.remove(0);
        System.out.println(l1.getFirst()); // error
        System.out.println(l1.getLast()); // error

        ArrayList <Integer> I=new ArrayList<>();
        for(int i=1;i<6;i++,I.add(i));
        LinkedList <Integer> list=new LinkedList<Integer>(I);
        Iterator <Integer>i1=list.iterator();
        while(i1.hasNext()){ System.out.println(i1.next()); }
    }
}
