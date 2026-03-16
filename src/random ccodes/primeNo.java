public class primeNo {
    public static void main(String[] args) {

        int num = Integer.parseInt(args[0]);
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } 
        else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("It is a prime number");
        } else {
            System.out.println("Not a prime number");
        }
    }
}
