import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import javax.management.Query;

public class QueueProgram {
    public static void main(String[] args) {
        
        Queue<Integer> q = new LinkedList<>();
        q.offer(50);
        q.offer(40);
        q.offer(30);
        q.offer(20);
        q.offer(10);
        q.offer(5);
        q.offer(1);
        System.out.println(q);
        q.poll();
        System.out.println(q);
        System.out.println(q.peek());

        System.out.println("\n\n");
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.offer(55);
        dq.offer(50);
        dq.offer(45);
        dq.offer(40);
        System.out.println(dq);
        dq.addFirst(55);

    }
}
