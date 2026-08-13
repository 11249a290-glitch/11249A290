import java.util.Scanner;
public class LibrarySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] books = new String[10];
        System.out.println("--- Enter 10 Book Titles ---");
        for (int i = 0; i < books.length; i++) {
            System.out.print("Book " + (i + 1) + ": ");
            books[i] = scanner.nextLine();
        }
        System.out.println("\n--- Books Starting with 'A' ---");
        boolean foundAny = false;
        for (String book : books) {
            if (book.trim().toUpperCase().startsWith("A")) {
                System.out.println("• " + book);
                foundAny = true;
            }
        }
        if (!foundAny) {
            System.out.println("No books were found starting with 'A'.");
        }
        scanner.close();
    }
}