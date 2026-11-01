
class PaymentProcess implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Payment Processing...");
        }
    }
}

public class PaymentProcessDemo {
    public static void main(String[] args) {
        PaymentProcess p = new PaymentProcess();

        Thread t = new Thread(p);
        t.start();
    }
}
