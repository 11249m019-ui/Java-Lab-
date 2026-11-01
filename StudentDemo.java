
class Student {
    String name;
    int rollNo;
    int marks;

    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
        System.out.println("----------------------");
    }

    String calculateGrade() {
        if (marks >= 90)
            return "A";
        else if (marks >= 80)
            return "B";
        else if (marks >= 70)
            return "C";
        else if (marks >= 60)
            return "D";
        else
            return "F";
    }
}

public class StudentDemo {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Priya";
        s1.rollNo = 101;
        s1.marks = 95;

        s2.name = "Anu";
        s2.rollNo = 102;
        s2.marks = 85;

        System.out.println("STUDENT DETAILS");
        System.out.println("----------------------");

        s1.displayDetails();
        s2.displayDetails();
    }
}
