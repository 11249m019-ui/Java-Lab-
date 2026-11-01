
class Student {
    int rollNo;
    String name;

    void displayStudent() {
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Student Name: " + name);
    }
}

class Marks extends Student {
    int m1, m2, m3, m4, m5;

    void displayMarks() {
        System.out.println("Marks in Five Subjects:");
        System.out.println("Subject 1: " + m1);
        System.out.println("Subject 2: " + m2);
        System.out.println("Subject 3: " + m3);
        System.out.println("Subject 4: " + m4);
        System.out.println("Subject 5: " + m5);
    }
}

class Result extends Marks {

    void calculateResult() {
        int total = m1 + m2 + m3 + m4 + m5;
        double average = total / 5.0;

        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);

        if (average >= 90)
            System.out.println("Grade: A");
        else if (average >= 80)
            System.out.println("Grade: B");
        else if (average >= 70)
            System.out.println("Grade: C");
        else if (average >= 60)
            System.out.println("Grade: D");
        else
            System.out.println("Grade: F");
    }
}

public class StudentResult {
    public static void main(String[] args) {

        Result s = new Result();

        s.rollNo = 101;
        s.name = "Priya";

        s.m1 = 95;
        s.m2 = 90;
        s.m3 = 85;
        s.m4 = 92;
        s.m5 = 88;

        System.out.println("STUDENT RESULT");
        System.out.println("--------------------");

        s.displayStudent();
        s.displayMarks();
        s.calculateResult();
    }
}
