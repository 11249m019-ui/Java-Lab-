
public class PredefinedException {
    public static void main(String[] args) {

        // ArithmeticException
        try {
            int result = 10 / 0;
            System.out.println(result);
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: Cannot divide by zero");
        }

        // NumberFormatException while reading age
        try {
            String age = "twenty";
            int a = Integer.parseInt(age);
            System.out.println("Age: " + a);
        }
        catch (NumberFormatException e) {
            System.out.println("Number Format Exception: Invalid age input");
        }

        System.out.println("Program Completed");
    }
}
