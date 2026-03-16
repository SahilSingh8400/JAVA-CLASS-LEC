package polymorphism;

class Shape{
    void displayArea(){
        System.out.println("area cannot be found");
    }
}

class Rectangle extends Shape{
    void displayArea(){
        System.out.println("this is area of rreectangel");
    }
}

public class A {
    public static void main(String[] args) {
        Rectangle r= new Rectangle();
        r.displayArea();
    }
}
