package inteerface;

abstract class Shape {
    abstract void area();   // abstract method

    void display() {        // normal method
        System.out.println("This is shape class");
    }
}

class Circle extends Shape {
    void area() {
        System.out.println("Area of Circle");
    }
}

public class ab01 {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.area();
        c.display();
    }
}