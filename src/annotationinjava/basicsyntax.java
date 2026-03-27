package annotationinjava;

class A {
    void showdudfufbduffbw(){
        System.out.println("thhis is of class A");
    }
}

class B extends A{
    @Override // it tell that the mistake is made in method name
    void showjadfjkswfb(){
        System.out.println("this is of class B");
    }
}

public class basicsyntax {

    public static void main(String[] args) {
        B obj=new B();
        obj.show();
    }
}