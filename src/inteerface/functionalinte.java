package inteerface;

interface A {
    public int prod(int a, int b);
}

public class functionalinte {
    public static void main(String[] args) {
        A obj = (a, b) -> a * b;
        int r = obj.prod(10, 20);
        System.out.println(r);
    }

}
