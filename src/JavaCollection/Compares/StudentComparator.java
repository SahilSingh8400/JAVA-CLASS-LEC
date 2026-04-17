package JavaCollection.Compares;
import java.lang.*;
import java.util.*;

class Student {
    int id;
    int marks;
    String name;

    Student(int id, int marks, String name) {
        this.id = id;
        this.marks = marks;
        this.name = name;
    }
}


class MarksComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s2.marks - s1.marks; // Descending order
    }
}
public class StudentComparator {
     public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(1, 85, "A"));
        list.add(new Student(2, 92, "B"));
        list.add(new Student(3, 78, "C"));

        Collections.sort(list, new MarksComparator());

        for (Student s : list) {
            System.out.println(s.name + " " + s.marks);
        }
    }
}
