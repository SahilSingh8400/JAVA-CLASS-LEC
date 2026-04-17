package JavaCollection.List;

import java.util.Stack;

public class Stackdemo {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.add(10);
        s.push(20);
        s.push(30);

        System.out.println("Stack: " + s);

        System.out.println("Top element: " + s.peek());
        

        System.out.println("Removed: " + s.pop());

        System.out.println("Stack after pop: " + s);
    }
}
