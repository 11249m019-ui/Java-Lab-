
import java.net.*;
import java.io.*;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(5000);
            System.out.println("Server is waiting for client...");

            Socket s = ss.accept();
            System.out.println("Client Connected!");

            DataInputStream in =
                new DataInputStream(s.getInputStream());

            String message = in.readUTF();
            System.out.println("Client Message: " + message);

            DataOutputStream out =
                new DataOutputStream(s.getOutputStream());

            out.writeUTF("Hello Client! Message Received.");

            s.close();
            ss.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
