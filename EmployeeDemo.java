
class Employee {
    int empId;
    String name;
    double basicSalary;

    void displayDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
    }
}

class PermanentEmployee extends Employee {
    double hra;
    double da;

    void calculateSalary() {
        hra = basicSalary * 0.20;
        da = basicSalary * 0.10;
    }

    void displaySalary() {
        displayDetails();
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);

        double grossSalary = basicSalary + hra + da;

        System.out.println("Gross Salary: " + grossSalary);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {

        PermanentEmployee emp = new PermanentEmployee();

        emp.empId = 101;
        emp.name = "Priya";
        emp.basicSalary = 30000;

        emp.calculateSalary();

        System.out.println("Employee Salary Details");
        System.out.println("------------------------");

        emp.displaySalary();
    }
}
