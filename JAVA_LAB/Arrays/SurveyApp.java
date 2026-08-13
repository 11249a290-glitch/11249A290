import java.util.Scanner;
public class SurveyApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(String.class.cast(""));
	scanner = new Scanner(System.in);
        int[] ratings = new int[5];
        double sum = 0;
        System.out.println("Enter 5 feedback ratings (1 to 5):");
        for (int i = 0; i < ratings.length; i++) {
            System.out.print("Rating " + (i + 1) + ": ");
            ratings[i] = scanner.nextInt();
            sum += ratings[i];
        }
        double average = sum / ratings.length;
        System.out.println("Average Feedback Rating: " + average);
        scanner.close();
    }
}
