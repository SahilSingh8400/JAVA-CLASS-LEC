package randomcodes;

import java.util.*;

class InvalidMarksException extends Exception {
    InvalidMarksException(String message) {
        super(message);
    }
}

public class St015a {

    static double calculatePercentage(int marks[]) throws InvalidMarksException {
        int sum = 0;

        for (int m : marks) {
            if (m < 0 || m > 100) {
                throw new InvalidMarksException("Marks should be between 0 and 100, You have entered a negative number");
            }
            sum += m;
        }

        return sum / 5.0;
    }

    static void findGrade(double percentage) {
        if (percentage > 90)
            System.out.println("Grade: A+");
        else if (percentage >= 80)
            System.out.println("Grade: A");
        else if (percentage >= 60)
            System.out.println("Grade: B");
        else if (percentage >= 40)
            System.out.println("Grade: C");
        else
            System.out.println("Fail");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[5];

        try {
            System.out.println("Enter marks of 5 subjects:");

            for (int i = 0; i < 5; i++) {
                marks[i] = sc.nextInt();
            }

            double percentage = calculatePercentage(marks);
            System.out.println("Percentage: " + percentage);

            findGrade(percentage);

        } catch (InvalidMarksException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        sc.close();
    }
}