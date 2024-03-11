import java.io.*;
import java.net.*;

public class Server {

    public static void main(String[] args) {
        int portNumber = 5000;

        try (ServerSocket serverSocket = new ServerSocket(portNumber)) {
            System.out.println("Server is waiting for client on port " + portNumber);

            // Wait for a client to connect
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected");

            // Create a BufferedReader to read data from the client
            BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            // Read and print the message sent by the client
            String clientMessage = reader.readLine();
            System.out.println("Received from client: " + clientMessage);

            // Close the resources
            reader.close();
            clientSocket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
