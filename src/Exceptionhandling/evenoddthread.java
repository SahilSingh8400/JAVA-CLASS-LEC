package Exceptionhandling;

class evenThread extends Thread {
    public void run(){
        for(int i=0; i<6; i++){
            System.out.println(i);
        }
    }
    
}
class oddThread extends Thread {
    public void run(){
        for(char ch='a'; ch<='f'; ch++){
            System.out.println(ch);
        }
    }
    
}

class main{
    public static void main(String[] args) throws InterruptedException {
        evenThread e=new evenThread();
        oddThread o=new oddThread();
        e.setPriority(9);
        o.setPriority(1);
        e.start();
        e.join();
        o.start();
        o.join();
    }
}