package DynamicProg;

import java.util.Vector;

class Mythreds extends Thread {
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("Thread is running");
        }
    }
}

public class threadsInVector {
    public static void main(String[] args) {

        Vector<Integer> v = new Vector<>();

        System.out.println("Size is: " + v.size());
        System.out.println("Capacity is: " + v.capacity());

        Mythreds t1 = new Mythreds();

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 50; i++) {
                v.add(i);
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Size of Vector: " + v.size());
        System.out.println("Vector Elements: " + v);
    }
}