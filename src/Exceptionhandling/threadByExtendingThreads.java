package Exceptionhandling;

public class threadByExtendingThreads  extends Thread{
    public void run(){
        System.out.println("hello this is for thread learning ");
    }
    public static void main(String[] args) {
        threadByExtendingThreads t=new threadByExtendingThreads();
        t.start();
    }
}
