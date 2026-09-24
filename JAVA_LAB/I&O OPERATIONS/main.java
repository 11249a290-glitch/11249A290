import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class main {
    public static void main(String[] args) {
        String filename = "user_profile.txt";
        String profileData = "User: John Doe\nAge: 25\nDaily Step Goal: 10000";
        try (FileOutputStream fos = new FileOutputStream(filename)) {
            byte[] bytes = profileData.getBytes(); // Convert string to bytes
            fos.write(bytes);
            System.out.println("Profile data written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
        try (FileInputStream fis = new FileInputStream(filename)) {
            System.out.println("\nReading Profile Data:");
            int ch;
            while ((ch = fis.read()) != -1) { // -1 signals end of file
                System.out.print((char) ch);
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}