package randomcodes;

class NumberThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class CharThread extends Thread {
    public void run() {
        for (char ch = 'A'; ch <= 'E'; ch++) {
            System.out.println("Character: " + ch);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class multithreading {
    public static void main(String[] args) {
        NumberThread t1 = new NumberThread();
        CharThread t2 = new CharThread();

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        t1.start();

        try {
            t1.join();
        } catch (Exception e) {
            System.out.println(e);
        }

        t2.start();
    }
}