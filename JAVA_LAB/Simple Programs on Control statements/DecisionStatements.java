import java.util.Scanner;
public class DecisionStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (1-3): ");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("It is Positive");
        } else {
            System.out.println("It is Not Positive");
        }
        switch (num) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Other number");
        }
    }
}