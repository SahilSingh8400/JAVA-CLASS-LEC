package DynamicProg;

import java.util.*;

class Student {
    String name;
    int rollNo;
    String section;

    Student(String name, int rollNo, String section) {
        this.name = name;
        this.rollNo = rollNo;
        this.section = section;
    }
}

public class StudentDemo {
    public static void main(String[] args) {

        LinkedList<Student> list = new LinkedList<>();

        list.add(new Student("Rahul", 101, "A"));
        list.add(new Student("Amitabh", 102, "B"));
        list.add(new Student("Neha", 103, "A"));
        list.add(new Student("Priyanshu", 104, "C"));
        list.add(new Student("Alok", 105, "B"));

        System.out.println("Students before sorted by name length:\n");

        for (Student s : list) {
            System.out.println("Name: " + s.name +", Roll No: " + s.rollNo +", Section: " + s.section);
        }
        Collections.sort(list, (s1, s2) -> s1.name.length() - s2.name.length());

        System.out.println("Students sorted by name length:\n");

        for (Student s : list) {
            System.out.println("Name: " + s.name +", Roll No: " + s.rollNo +", Section: " + s.section);
        }
    }
}