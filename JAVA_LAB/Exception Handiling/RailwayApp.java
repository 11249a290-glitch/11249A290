public class RailwayApp {
    public static void main(String[] args) {
        String[] trainCodes = {"TRN101", "TRN202", "TRN303"};

        try {
            int requestedIndex = 5; 
            System.out.println("Train Code: " + trainCodes[requestedIndex]);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid train index! The requested train code does not exist.");
            System.out.println("Exception Message: " + e.getMessage());
        }
    }
}
