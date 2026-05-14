package Exceptionhandling;

import ST01.exceptionhandle;

class A  {
    synchronized void m1(){
        System.out.println("thread 1 is wainting");
        try{
            wait();
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("thread 1 is resumed");
    }
    synchronized void m2(){
        System.out.println("thread 2 is notifying");
        try{
            notify();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}

class X {
    public static void main(String[] args) {
        A obj=new A();
        Thread t1=new Thread(){
            public void run(){
                obj.m1();
            }
        };
        Thread t2=new Thread(){
            public void run(){
                obj.m2();
            }
        };

        t1.start();
        try{
            Thread.sleep(1000);
        }catch(Exception e){
            System.out.println(e);
        }
        t2.start();
    }
}
