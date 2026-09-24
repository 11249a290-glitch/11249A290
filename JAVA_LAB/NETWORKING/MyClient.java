import java.io.*;
import java.net.*;
import java.util.Scanner;

public class MyClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 5000);
            System.out.println("Connected to Server! Start typing messages below:\n");

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            Scanner keyboard = new Scanner(System.in);

            String msgToServer, msgFromServer;

            // Keep chatting until someone types 'exit'
            while (true) {
                // Type message from Client terminal
                System.out.print("Client (You): ");
                msgToServer = keyboard.nextLine();
                out.println(msgToServer);

                if (msgToServer.equalsIgnoreCase("exit")) {
                    break;
                }

                // Read reply from Server
                msgFromServer = in.readLine();
                if (msgFromServer.equalsIgnoreCase("exit")) {
                    System.out.println("Server ended the chat.");
                    break;
                }
                System.out.println("Server: " + msgFromServer);
            }

            socket.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}