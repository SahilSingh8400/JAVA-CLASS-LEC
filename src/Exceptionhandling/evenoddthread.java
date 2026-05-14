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
    for(char ch='a'; ch<'f'; ch++){
        System.out.println(ch);
    }
   }
}

class demomain{
    public static void main(String[] args) {
        evenThread e=new evenThread();
        oddThread o= new oddThread();

        e.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e1) {
           System.out.println(e1);
        }

        o.start();
    }
}