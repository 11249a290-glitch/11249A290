class Student {
    protected int rollNo;
    protected String name;
    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
    public void displayStudentInfo() {
        System.out.println("Roll Number  : " + rollNo);
        System.out.println("Student Name : " + name);
    }
}
class Marks extends Student {
    protected double[] marks;
    public Marks(int rollNo, String name, double[] marks) {
        super(rollNo, name);
        this.marks = marks;
    }
}
class Result extends Marks {
    public Result(int rollNo, String name, double[] marks) {
        super(rollNo, name, marks);
    }
    public double calculateTotal() {
        double total = 0;
        for (double mark : marks) {
            total += mark;
        }
        return total;
    }
    public double calculateAverage() {
        return calculateTotal() / marks.length;
    }
    public String calculateGrade() {
        double avg = calculateAverage();
        if (avg >= 90) return "A+";
        if (avg >= 80) return "A";
        if (avg >= 70) return "B";
        if (avg >= 60) return "C";
        if (avg >= 50) return "D";
        return "F";
    }
    public void displayResult() {
        displayStudentInfo();
        System.out.println("Marks         : ");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("  Subject " + (i + 1) + "  : " + marks[i]);
        }
        System.out.println("Total Marks   : " + calculateTotal() + " / 500");
        System.out.println("Average Marks : " + String.format("%.2f", calculateAverage()));
        System.out.println("Grade         : " + calculateGrade());
    }
}
public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        double[] studentMarks = {85.5, 90.0, 78.0, 88.5, 92.0};
        Result studentResult = new Result(1001, "John Doe", studentMarks);

        System.out.println("--- Student Result Card ---");
        studentResult.displayResult();
    }
}