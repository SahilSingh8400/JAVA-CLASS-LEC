package JavaCollection.Set;

import java.util.*;
/*
    Uses Hashing
    No order maintained ❌
    Fast operations ⚡ (O(1) average)
    Allows one null value 
*/
public class HashSetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(10); // duplicate are removerd automatiically

        System.out.println(set);
    }
}