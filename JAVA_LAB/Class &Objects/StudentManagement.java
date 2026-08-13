class Student {
    String name;
    int rollnum;
    double marks;
    public Student(String name, int rollnum, double marks) {
        this.name = name;
        this.rollnum = rollnum;
        this.marks = marks;
    }
    public char calculateGrade() {
        if (marks >= 90) {
            return 'A';
        } else if (marks >= 75) {
            return 'B';
        } else if (marks >= 50) {
            return 'C';
        } else {
            return 'F';
        }
    }
    public void displayDetails() {
        // Fixed the typo "rol lnum" to "rollnum" here
        System.out.println("RollNumber:" + rollnum); 
        System.out.println("Name:" + name);
        System.out.println("Marks:" + marks);
        System.out.println("Grade:" + calculateGrade());
        System.out.println(); // Added for clean spacing between records
    }
}
public class StudentManagement {
    public static void main(String[] args) {
        System.out.println("student records\n");
        Student s1 = new Student("john", 101, 92);
        Student s2 = new Student("ash", 102, 62);
        Student s3 = new Student("steve", 103, 42);
        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
    }
}
