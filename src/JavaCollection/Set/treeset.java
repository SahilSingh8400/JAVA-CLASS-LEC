package JavaCollection.Set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class treeset {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();

        set.add(10);
        set.add(20);
        set.add(5); //automatically sorted
        System.out.println(set);
    }
}

// methods in sets 
/*
set.add(x);        // add element
set.remove(x);     // remove element
set.contains(x);   // check element
set.size();        // size
set.clear();       // remove all

*/
