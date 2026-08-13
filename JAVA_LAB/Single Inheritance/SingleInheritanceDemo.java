class Employee {
    protected int empId;
    protected String name;
    protected double basicSalary;
    public Employee(int empId, String name, double basicSalary) {
        this.empId = empId;
        this.name = name;
        this.basicSalary = basicSalary;
    }
    public void displayBaseInfo() {
        System.out.println("Employee ID   : " + empId);
        System.out.println("Employee Name : " + name);
        System.out.println("Basic Salary  : $" + basicSalary);
    }
}
class PermanentEmployee extends Employee {
    private double hra; // House Rent Allowance
    private double da;  // Dearness Allowance
    public PermanentEmployee(int empId, String name, double basicSalary, double hra, double da) {
        super(empId, name, basicSalary);
        this.hra = hra;
        this.da = da;
    }
    public double calculateGrossSalary() {
        return basicSalary + hra + da;
    }
    public void displayDetails() {
        displayBaseInfo();
       System.out.println("HRA           : $" + hra);
       System.out.println("DA            : $" + da);
       System.out.println("Gross Salary  : $" + calculateGrossSalary());
    }
}
public class SingleInheritanceDemo {
    public static void main(String[] args) {
        PermanentEmployee emp = new PermanentEmployee(101, "Alice Smith", 50000.0, 10000.0, 5000.0);
        System.out.println("--- Employee Details ---");
        emp.displayDetails();
    }
}