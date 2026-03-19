package Basee64;

import java.util.Base64;

public class encoding {
    public static void main(String[] args) {
        String original = "sahil singh";

        // encode
        String encodedString1 = Base64.getEncoder().encodeToString(original.getBytes());

        System.out.println("Original: " + original);
        System.out.println("Encoded: " + encodedString1);
    }
}


