
import java.net.*;
import java.io.*;

public class Client {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 5000);

            DataOutputStream out =
                new DataOutputStream(s.getOutputStream());

            out.writeUTF("Hello Server!");

            DataInputStream in =
                new DataInputStream(s.getInputStream());

            String reply = in.readUTF();
            System.out.println("Server Reply: " + reply);

            s.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
