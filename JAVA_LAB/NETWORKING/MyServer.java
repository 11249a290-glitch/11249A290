import java.io.*;
import java.net.*;
import java.util.Scanner;

public class MyServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(5000);
            System.out.println("Server started. Waiting for Client...");

            Socket socket = serverSocket.accept();
            System.out.println("Client connected! Start typing messages below:\n");

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            Scanner keyboard = new Scanner(System.in);

            String msgFromClient, msgToClient;

            // Keep chatting until someone types 'exit'
            while (true) {
                // Read message from Client
                msgFromClient = in.readLine();
                if (msgFromClient.equalsIgnoreCase("exit")) {
                    System.out.println("Client ended the chat.");
                    break;
                }
                System.out.println("Client: " + msgFromClient);

                // Type reply from Server terminal
                System.out.print("Server (You): ");
                msgToClient = keyboard.nextLine();
                out.println(msgToClient);

                if (msgToClient.equalsIgnoreCase("exit")) {
                    break;
                }
            }

            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}