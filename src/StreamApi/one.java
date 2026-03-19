package StreamApi;

// sourec 
//list.stream()

//intermediate operations
//filter 
//map
//sorted
//distinct

/*
Terminal Operations
forEach()
collect()
count()
reduce()
*/
import java.util.*;
import java.util.stream.*;

class Main {
    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

        List<Integer> result = list.stream()
            .filter(x -> x % 2 == 0)
            .map(x -> x * x)
            .collect(Collectors.toList());

        System.out.println(result);
    }
}
