package SealedClasses;

sealed interface Payments permits UPI, CreditCard, Cash {
    void paymentMethod();
}

final class UPI implements Payments {
    public void paymentMethod() {
        System.out.println("This is for UPI payment");
    }
}

final class CreditCard implements Payments {
    public void paymentMethod() {
        System.out.println("This is for Credit Card payment");
    }
}

final class Cash implements Payments {
    public void paymentMethod() {
        System.out.println("This is for Cash payment");
    }
}

// Main class
public class sealedinterfaceexample {
    public static void main(String[] args) {

        Payments p;  
        p = new UPI();
        p.paymentMethod();

        p = new CreditCard();
        p.paymentMethod();

        p = new Cash();
        p.paymentMethod();
    }
}