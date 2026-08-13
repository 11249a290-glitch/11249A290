interface AcademicMarks {
    double getAcademicTotal();
}
interface SportsScore {
    double getSportsWeightage();
}
class StudentResult implements AcademicMarks, SportsScore {
    private String name;
    private double theoryMarks;
    private double practicalMarks;
    private double sportsGracePoints;
    public StudentResult(String name, double theoryMarks, double practicalMarks, double sportsGracePoints) {
        this.name = name;
        this.theoryMarks = theoryMarks;
        this.practicalMarks = practicalMarks;
        this.sportsGracePoints = sportsGracePoints;
    }
    @Override
    public double getAcademicTotal() {
        return theoryMarks + practicalMarks;
    }
    @Override
    public double getSportsWeightage() {
        return sportsGracePoints;
    }
    public double calculateOverallScore() {
        return getAcademicTotal() + getSportsWeightage();
    }
    public void displayFinalReport() {
        System.out.println("Student Name       : " + name);
        System.out.println("Academic Total     : " + getAcademicTotal());
        System.out.println("Sports Weightage   : " + getSportsWeightage());
        System.out.println("Final Combined Score: " + calculateOverallScore());
    }
}
public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        StudentResult report = new StudentResult("Emma Watson", 420.0, 80.0, 25.0);
        System.out.println("--- Comprehensive Performance Report ---");
        report.displayFinalReport();
    }
}