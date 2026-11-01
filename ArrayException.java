
public class ArrayException {
    public static void main(String[] args) {

        int trainCodes[] = {101, 102, 103, 104, 105};

        try {
            System.out.println("Train Code: " + trainCodes[2]);
            System.out.println("Train Code: " + trainCodes[7]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: Invalid Array Index");
        }

        System.out.println("Program Completed");
    }
}
