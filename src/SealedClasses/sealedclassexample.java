package SealedClasses;

sealed class vehicle permits twowheeler, threewheeler, fourwheeler {
    static void display() {
        System.out.println("this is Vehicle");
    }
}

sealed class twowheeler extends vehicle permits e_bikes {
    static void display() {
        System.out.println("this is two wheeler");
    }
}

sealed class threewheeler extends vehicle permits e_rickshaw {
    static void display() {
        System.out.println("this is three wheeler");
    }
}

sealed class fourwheeler extends vehicle permits e_car {
    static void display() {
        System.out.println("this is four wheeler");
    }
}

final class e_bikes extends twowheeler {
    static void display() {
        System.out.println("this is e bikes");
    }
}
final class e_rickshaw extends threewheeler {
    static void display() {
        System.out.println("this is e rickshaw");
    }
}
final class e_car extends fourwheeler {
    static void display() {
        System.out.println("this is e car");
    }
}

public class sealedclassexample {
    public static void main(String[] args) {
        vehicle.display();
        twowheeler.display();
        threewheeler.display();
        fourwheeler.display();
        e_bikes.display();
        e_rickshaw.display();
        e_car.display();
    }
}
