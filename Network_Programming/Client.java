import java.io.*;
import java.net.*;

public class Client {

    public static void main(String[] args) {
        String serverAddress = "localhost";
        int portNumber = 5000;

        try (Socket socket = new Socket(serverAddress, portNumber);
                PrintWriter writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true)) {

            // Send a message to the server
            String message = "Hello, Server I am Gautam!";
            writer.println(message);
            System.out.println("Sent to server: " + message);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
