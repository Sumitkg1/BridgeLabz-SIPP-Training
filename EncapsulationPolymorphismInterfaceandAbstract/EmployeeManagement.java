abstract class Employee {
    private int employeeId;
    private String Employeename;
    private double baseSalary;

    public Employee(int employeeId, String Employeename, double baseSalary) {
        this.employeeId = employeeId;
        this.Employeename = Employeename;
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("ID: " + employeeId + ", Employeename: " + Employeename + ", Salary: " + calculateSalary());
    }

    public double getBaseSalary() {
        return baseSalary;
    }
}

interface Department {
    void assignDepartment(String dept);
    String getDepartmentDetails();
}

class FullTimeEmployee extends Employee implements Department {
    private String department;

    public FullTimeEmployee(int id, String Employeename, double salary) {
        super(id, Employeename, salary);
    }

    public double calculateSalary() {
        return getBaseSalary();
    }

    public void assignDepartment(String dept) {
        this.department = dept;
    }

    public String getDepartmentDetails() {
        return department;
    }
}

class PartTimeEmployee extends Employee implements Department {
    private int hoursWorked;
    private String department;

    public PartTimeEmployee(int id, String Employeename, double salary, int hoursWorked) {
        super(id, Employeename, salary);
        this.hoursWorked = hoursWorked;
    }

    public double calculateSalary() {
        return getBaseSalary() * hoursWorked;
    }

    public void assignDepartment(String dept) {
        this.department = dept;
    }

    public String getDepartmentDetails() {
        return department;
    }
}
