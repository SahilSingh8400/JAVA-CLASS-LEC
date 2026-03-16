package ST01;

// class Mythread implements Runnable {
//     public void run() {
//         System.out.println("runnig  " + Thread.currentThread().getName());
//     }
// }

// public class Test{
//     public static void main(String[] args) {
//         Mythread obj=new Mythread();
//         Thread t1 = new Thread(obj);
//         Thread t2 = new Thread(obj);
//         Thread t3 = new Thread(obj);
//         Thread t4 = new Thread(obj);

//         t1.setName("thread 1");
//         t2.setName("thread 2");
//         t3.setName("thread 3");
//         t4.setName("thread 4");

//         t1.start();
//         t2.start();
//         t3.start();
//         t4.start();
//     }
// }

public class Test extends Thread{
    public void run(){
        System.out.println("runngin "+Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        Test t1=new Test();
        Test t2=new Test();
        Test t3=new Test();

        t1.setName("thread 1");
        t2.setName("thread 2");
        t3.setName("thread 3");

        t1.start();
        t2.start();
        t3.start();
    }
    
}