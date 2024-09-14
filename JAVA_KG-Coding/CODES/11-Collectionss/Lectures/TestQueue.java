package _12Collectionss.Lectures;

import java.util.LinkedList;
import java.util.Queue;

public class TestQueue {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        // add() with exception
        queue.add(66);
        // offer() without exception
        queue.offer(77);
        // peek() with exception
        Utility.print(queue);
        System.out.println(queue.peek());
        // element() without exception
        System.out.println(queue.element());
        // remove() with exception
        System.out.println(queue.remove());
        Utility.print(queue);
        // poll() without exception
        System.out.println(queue.poll());
        Utility.print(queue);
        queue.offer(98);
        queue.offer(64);
        Utility.print(queue);
        System.out.println(queue);
    }
}
