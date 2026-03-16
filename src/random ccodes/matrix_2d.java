import java.util.Scanner;

public class matrix_2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[2][3];
        System.out.println("enter thee elements of array");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();

    }
}
