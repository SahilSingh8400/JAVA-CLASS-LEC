package randomcodes;

import java.util.*;

// Auto close of resource like sc.close()
public class ressource {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            System.out.println("You entered: " + n);
        }
    }
}
