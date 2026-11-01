
public class MonthlySales {
    public static void main(String[] args) {

        int sales[] = {
            12000, 15000, 18000, 10000,
            22000, 25000, 14000, 30000,
            17000, 28000, 16000, 20000
        };

        int max = sales[0];
        int min = sales[0];

        for (int i = 1; i < sales.length; i++) {

            if (sales[i] > max) {
                max = sales[i];
            }

            if (sales[i] < min) {
                min = sales[i];
            }
        }

        System.out.println("Monthly Sales Details:");

        for (int i = 0; i < sales.length; i++) {
            System.out.println("Month " + (i + 1) + ": " + sales[i]);
        }

        System.out.println("\nHighest Sales: " + max);
        System.out.println("Lowest Sales: " + min);
    }
}
