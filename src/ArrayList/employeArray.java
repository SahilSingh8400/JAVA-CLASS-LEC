package ArrayList;

import java.util.ArrayList;
import java.util.List;

class customizedException extends Exception {
    customizedException(String msg) {
        super(msg);
    }
}

class Employee implements Comparable<Employee> {
    int id;
    String name;
    int salary;

    Employee(int i, String n, int s) {
        this.id = i;
        this.name = n;
        this.salary = s;
    }

    public int compareTo(Employee that) {
        return Integer.compare(that.salary, this.salary);
    }

    public static void validateList(List<Employee> list) throws customizedException {
        for (Employee emp : list) {
            if (emp.name == null || emp.name.isEmpty()) {
                throw new customizedException("Invalid name found for ID: " + emp.id);
            }
        }
    }

    public static void main(String[] args) {
        List<Employee> e = new ArrayList<>();

        e.add(new Employee(1, "sahil", 10000));
        e.add(new Employee(2, "sagar", 12500));
        e.add(new Employee(4, "ram", 12004));
        e.add(new Employee(5, "shyam", 20000));
        e.add(new Employee(3, "", 10520));

        try {
            validateList(e); //
        } catch (customizedException ex) {
            System.out.println(ex.getMessage());
        }

        e.sort(null);

        for (Employee i : e) {
            System.out.println(i.id + ": " + i.name + ": " + i.salary);
        }
    }
}