// Queue : Priority Queue
import java.util.PriorityQueue;

public class hello9 {
    public static void main(String[] args) {
        PriorityQueue pq=new PriorityQueue<>();
        //pq.offer("A"); // another way pq.add("A");
        pq.offer("C");
        pq.offer("D");
        pq.offer("B");
        pq.offer("F");
        System.out.println(pq.peek()); // another way pq.element();
        System.out.println(pq);
        System.out.println(pq.poll()); // another way pq.remove();
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        
    }
}
