package constructor;

public class student {

    int id;
    String name;
    static String College = "ABESEC";

    // Default Constructor
    student() {
        id = 0;
        name = "Not Assigned";
    }

    // Parameterized Constructor
    student(int i, String n) {
        id = i;
        name = n;
    }

    static void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("College: " + College);
    }

    public static void main(String[] args) {

        student s1 = new student();          
        student s2 = new student(101, "Sahil"); 

        s1.display();
        System.out.println();
        s2.display();
    }
}
