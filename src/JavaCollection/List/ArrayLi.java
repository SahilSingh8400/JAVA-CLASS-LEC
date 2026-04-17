package JavaCollection.List;

import java.util.*;

class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        ArrayList<String> name = new ArrayList<>();
        name.add("Sahil");
        name.add("Rahul");

        System.out.println(name);

        list.add(10);
        list.add(20);
        list.add(10); // duplicate allowed
        list.add(50);
        list.add(60);

        System.out.println(list);

        list.remove(2); // takes index

        System.out.println(list);

        System.out.println(list.get(3));

        // methods in Array List
        // Method -- Use
        // add() -- insert
        // remove() -- delete
        // get() -- access
        // size() -- length
        // contains() -- check
    }
}