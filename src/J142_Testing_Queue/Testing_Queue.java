package J142_Testing_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Testing_Queue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.offer(2);


//        for (Integer i : queue) {
//            System.out.printf("%d ", i);
//        }

        Utility.print(queue);

        System.out.println(queue.peek());
        System.out.println(queue.element());
        System.out.println(queue.remove());
        Utility.print(queue);

        System.out.println(queue.poll());
        Utility.print(queue);

//        System.out.println(queue.remove());
        System.out.println(queue.poll());
    }
}