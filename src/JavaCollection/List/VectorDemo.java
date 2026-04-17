package JavaCollection.List;

import java.util.*;

public class VectorDemo {
    public static void main(String[] args) throws Exception {

        Vector<Integer> v = new Vector<>();

        // modern ways to do synnchronization is like that

        List<Integer> v1 = Collections.synchronizedList(new Vector<>());

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                v.add(i);
                System.out.println("Thread 1 added " + i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                v.add(i);
                System.out.println("Thread 2 added " + i);
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Vector: " + v);
    }
}