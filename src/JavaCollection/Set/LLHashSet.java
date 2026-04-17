package JavaCollection.Set;
import java.util.*;
/*
    Features:
    Maintains insertion order ✔️
    Slower than HashSet (slightly)
    Uses Linked List + Hashing
*/

public class LLHashSet {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();

        set.add(10);
        set.add(20);
        set.add(10); // duplicate are removerd automatiically

        System.out.println(set);
    }
}
