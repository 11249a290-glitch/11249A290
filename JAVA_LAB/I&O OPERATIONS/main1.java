import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class main1 {
    public static void main(String[] args) {
        String filename = "editor_note.txt";
        String editorContent = "Welcome to Text Editor!\nThis file is written using FileWriter.";

        // Writing text to file
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(editorContent);
            System.out.println("Content saved successfully.");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }

        // Reading text back from file
        try (FileReader reader = new FileReader(filename)) {
            System.out.println("\nReading File Content:");
            int ch;
            while ((ch = reader.read()) != -1) { // -1 signals end of file
                System.out.print((char) ch);
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}