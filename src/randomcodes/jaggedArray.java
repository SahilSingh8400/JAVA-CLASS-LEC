package randomcodes;

import java.util.Scanner;

public class jaggedArray {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            System.out.println("Enter number of rows:");
            int r = input.nextInt();

            int[][] a = new int[r][];

            // Taking input
            for (int i = 0; i < r; i++) {
                System.out.println("Enter number of columns for row " + i + ":");
                int c = input.nextInt();

                a[i] = new int[c];  // create columns for each row

                System.out.println("Enter elements:");
                for (int j = 0; j < c; j++) {
                    a[i][j] = input.nextInt();
                }
            }

            // Printing array
            System.out.println("\nJagged Array is:");
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}