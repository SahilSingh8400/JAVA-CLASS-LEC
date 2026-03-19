package Basee64;

import java.util.Base64;

public class decoding {
    public static void main(String[] args) {
        String encodeString2="c2FoaWwgc2luZ2g=";

        byte[] decodeBytes=Base64.getDecoder().decode(encodeString2);
        String decodedString= new String(decodeBytes);

        System.out.println("Encoded: " + encodeString2);
        System.out.println("Decoded: " + decodedString);
    }
}
