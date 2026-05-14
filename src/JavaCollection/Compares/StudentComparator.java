package JavaCollection.Compares;
import java.lang.*;
import java.util.*;

class Studentdemo {
    int id;
    int marks;
    String name;

    Studentdemo(int id, int marks, String name) {
        this.id = id;
        this.marks = marks;
        this.name = name;
    }
}


class MarksComparator implements Comparator<Studentdemo> {
    public int compare(Studentdemo s1, Studentdemo s2) {
        return s2.marks - s1.marks; // Descending order
    }
}
public class StudentComparator {
     public static void main(String[] args) {
        ArrayList<Studentdemo> list = new ArrayList<>();

        list.add(new Studentdemo(1, 85, "A"));
        list.add(new Studentdemo(2, 92, "B"));
        list.add(new Studentdemo(3, 78, "C"));

        Collections.sort(list, new MarksComparator());

        for (Studentdemo s : list) {
            System.out.println(s.name + " " + s.marks);
        }
    }
}
