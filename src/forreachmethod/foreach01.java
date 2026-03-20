package forreachmethod;

import java.util.*;

public class foreach01 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);

        list.forEach(x -> System.out.println(x));

        int b[]={1,2,3,4,5};
        for (int x : b) {
            System.out.println(x);
        }
    }
}
