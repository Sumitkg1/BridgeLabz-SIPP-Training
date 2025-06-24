package Constructors.Level_1;

class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        if (newSalary >= 0) {
            salary = newSalary;
        } else {
            System.out.println("Invalid salary amount.");
        }
    }

    public void displayEmployeeInfo() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: ₹" + salary);
    }
}

class Manager extends Employee {
    String level;

    public Manager(int employeeID, String department, double salary, String level) {
        super(employeeID, department, salary);
        this.level = level;
    }

    public void displayManagerInfo() {
        System.out.println("Manager Access:");
        System.out.println("Employee ID (public): " + employeeID);
        System.out.println("Department (protected): " + department);
        System.out.println("Manager Level: " + level);
    }
}

public class EmployeeRecords {
    public static void main(String[] args) {
        Employee emp = new Employee(101, "Finance", 45000.0);
        emp.displayEmployeeInfo();
        System.out.println();

        emp.setSalary(50000.0);
        System.out.println("Updated Salary: ₹" + emp.getSalary());
        System.out.println();

        Manager mgr = new Manager(201, "IT", 75000.0, "Senior");
        mgr.displayManagerInfo();
    }
}
 
