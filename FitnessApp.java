
import java.io.*;

public class FitnessApp {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("profile.txt");

            String data = "Name: Priya\nAge: 20\nWeight: 50 kg";
            fout.write(data.getBytes());
            fout.close();

            FileInputStream fin = new FileInputStream("profile.txt");

            int ch;
            System.out.println("User Profile:");

            while ((ch = fin.read()) != -1) {
                System.out.print((char) ch);
            }

            fin.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
