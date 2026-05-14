package Exceptionhandling;

class MyThread implements Runnable {
    public void run(){
        System.out.println("this thread is implemennted by runnable meethod");
    }
    public static void main(String[] args) {
        MyThread obj= new MyThread();
        Thread t=new Thread(obj);
        t.start();
    }
}
