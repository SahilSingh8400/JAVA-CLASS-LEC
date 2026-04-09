package ArrayList;

import java.util.ArrayList;
import java.util.List;

class Student implements Comparable<Student> {
    int rollno;
    String name;
    int marks;

    public Student(int rollno, String name, int marks) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }

    public int compareTo(Student that) {
        return that.marks - this.marks;
    }
}

public class studentmarkscompare {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "sahil", 85));
        students.add(new Student(2, "sagar", 90));
        students.add(new Student(3, "ram", 75));
        students.add(new Student(3, "shayam", 87));
        students.add(new Student(3, "rita", 92));

        students.sort(null); //

        for (Student i : students) {
            System.out.println(i.rollno + ": " + i.name + ": " + i.marks);
        }
    }
}
