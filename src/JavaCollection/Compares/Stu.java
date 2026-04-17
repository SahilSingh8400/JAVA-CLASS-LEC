package JavaCollection.Compares;

import java.util.*;

class Student implements Comparable<Student> {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int compareTo(Student second) {
        return second.id-this.id; // for descending
        // return this.id-second.id;  for assending
    }
}

public class Stu {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        list.add(new Student(3, "Ram"));
        list.add(new Student(1, "Shyam"));
        list.add(new Student(2, "Aman"));

        Collections.sort(list);

        for(Student s : list) {
            System.out.println(s.id + " " + s.name);
        }
    }
}