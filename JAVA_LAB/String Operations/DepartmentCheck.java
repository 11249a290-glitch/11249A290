import java.util.Scanner;
public class DepartmentCheck 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Employee 1 Name: ");
        String emp1Name = scanner.nextLine();
        System.out.print("Enter " + emp1Name + "'s Department: ");
        String emp1Dept = scanner.nextLine();
        System.out.print("\nEnter Employee 2 Name: ");
        String emp2Name = scanner.nextLine();
        System.out.print("Enter " + emp2Name + "'s Department: ");
        String emp2Dept = scanner.nextLine();
        if (emp1Dept.equalsIgnoreCase(emp2Dept)) {
            System.out.println("\nResult: Both " + emp1Name + " and " + emp2Name + 
                               " work in the SAME department (" + emp1Dept.toUpperCase() + ").");
        } else {
            System.out.println("\nResult: " + emp1Name + " and " + emp2Name + 
                               " work in DIFFERENT departments.");
        }
        scanner.close();
    }
}