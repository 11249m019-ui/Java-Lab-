
class NumberCounter extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class NumberCounter {
    public static void main(String[] args) {
        NumberCounter t = new NumberCounter();
        t.start();
    }
}
