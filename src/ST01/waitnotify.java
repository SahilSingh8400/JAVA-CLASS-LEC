package ST01;

class Test {

    synchronized void display() {

        System.out.println("Waiting...");

        try{
            wait();
        }
        catch(Exception e){}

        System.out.println("Thread resumed");
    }

    synchronized void notifyThread() {

        notify();

    }

}

public class waitnotify {

    public static void main(String[] args) {
        Test obj= new Test();
        obj.display();
    }
}