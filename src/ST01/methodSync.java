package ST01;
class counter{
    int count=0;
    synchronized void increment(){
        count++;
        System.out.println(count);
    }
}
class Mythread1 extends Thread{
    counter c;

    Mythread1(counter c) {
        this.c = c;
    }

    public void run() {
        c.increment();
    }
}

public class methodSync {
    
}
