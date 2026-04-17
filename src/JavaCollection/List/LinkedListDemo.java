package JavaCollection.List;

import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList();

        l.add(10);
        l.add(20);
        l.addFirst(5);
        l.addLast(30);

        // System.out.println(l);

        // l.removeFirst();
        // System.out.println(l);

        // for(int i=0; i<l.size(); i++){
        //     System.out.print(l.get(i));
        //     System.out.print(",");
        // }

        //iterable method

        Iterator<Integer> it=l.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }


        // methods
        // addFirst()
        // addLast()
        // removeFirst()
        // removeLast()
    }
}
