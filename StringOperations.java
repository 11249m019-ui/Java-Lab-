
public class StringOperations {
    public static void main(String[] args) {

        String employee1 = "Priya";
        String employee2 = "Anu";

        System.out.println("Employee 1: " + employee1);
        System.out.println("Employee 2: " + employee2);

        System.out.println("Length of Employee 1: " + employee1.length());
        System.out.println("Length of Employee 2: " + employee2.length());

        System.out.println("Uppercase: " + employee1.toUpperCase());
        System.out.println("Lowercase: " + employee2.toLowerCase());

        if (employee1.equalsIgnoreCase(employee2)) {
            System.out.println("Both employees have the same name.");
        } else {
            System.out.println("Both employees have different names.");
        }

        System.out.println("First Character: " + employee1.charAt(0));

        System.out.println("Combined Names: " + employee1.concat(employee2));
    }
}
