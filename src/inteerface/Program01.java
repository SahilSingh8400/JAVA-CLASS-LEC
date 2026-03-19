package inteerface;

interface Calculator {

    static int add(int a, int b) {
        return a + b;
    }

    default void show() {
        System.out.println("This is default method");
    }
}

class Demo implements Calculator {

    public void show() {
        System.out.println("Default method overridden in class");
    }

    public static void main(String[] args) {

        Demo obj = new Demo();

        obj.show();

        int result = Calculator.add(10, 20);
        System.out.println("Sum = " + result);
    }
}