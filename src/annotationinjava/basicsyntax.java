package annotationinjava;

class A {
    void show(){
        System.out.println("thhis is of class A");
    }
}

class B extends A{
    void show(){
        System.out.println("this is of class B");
    }
}

public class basicsyntax {

    public static void main(String[] args) {
        B obj=new B();
        obj.show();
    }
}