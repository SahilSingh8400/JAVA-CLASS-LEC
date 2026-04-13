package DynamicProg;

import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {

        // Queue<Integer> q = new LinkedList<>(); //normal queue
        Queue<Integer> pq = new PriorityQueue<>(); //for min heap
        // Queue<Integer> q = new PriorityQueue<>(Collections.reverseOrder()); // for max heap
        Queue<Integer> dq = new ArrayDeque<>();

        pq.offer(40);
        pq.offer(10);
        pq.offer(30);
        dq.addAll(pq);

        
        // System.out.println("Queue is: " + pq);
        // System.out.println("peek" + pq.peek());
        // System.out.println("removed" + pq.poll());
        // System.out.println("final Queue" + pq);
        System.out.println("deque is: "+dq);
        System.out.println(dq.peek());

        // Iterator<Integer> it=pq.iterator(); //iterator method used to iterate over a collection
        // while(it.hasNext()){   //jab tak true hoga 
        //     System.out.println(it.next()); //net karte jao
        // }
    }
}