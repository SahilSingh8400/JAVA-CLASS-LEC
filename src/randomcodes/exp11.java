package randomcodes;

import java.util.Scanner;

// User defined exception
class NegativeAmountException extends Exception {
}

class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount: ");
        int amount = sc.nextInt();

        try {
            if(amount < 0) {
                throw new NegativeAmountException();
            }
            System.out.println("Amount = " + amount);
        }
        catch(NegativeAmountException e) {
            System.out.println("Negative amount not allowed");
        }
        finally {
            System.out.println("final Ammount = " + amount);
        }
        sc.close();
    }
}