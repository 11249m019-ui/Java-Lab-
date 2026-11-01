
import java.util.Scanner;

public class BookArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String books[] = new String[10];

        System.out.println("Enter 10 Book Titles:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Book " + (i + 1) + ": ");
            books[i] = sc.nextLine();
        }

        System.out.println("\nBooks Starting with Letter A:");

        for (int i = 0; i < 10; i++) {
            if (books[i].toUpperCase().startsWith("A")) {
                System.out.println(books[i]);
            }
        }

        sc.close();
    }
}
