package StreamApi;

import java.util.Arrays;
import java.util.List;


public class sqareno {
    public static void main(String[] args) {
        List<Integer> listelement1=Arrays.asList(1,2,3,4);
        listelement1.stream()
        .map(x->x*x)
        .forEach(System.out::println);
    }
}
