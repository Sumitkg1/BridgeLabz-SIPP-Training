package Constructors.Level_1;

 class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        if (CGPA >= 0.0 && CGPA <= 10.0) {
            this.CGPA = CGPA;
        } else {
            System.out.println("Invalid CGPA");
        }
    }

    public void displayStudent() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

class PostgraduateStudent extends Student {
    String specialization;

    public PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    public void displayPGStudent() {
        System.out.println("Postgraduate Student:");
        System.out.println("Name (protected): " + name); // Accessing protected member
        System.out.println("Specialization: " + specialization);
    }
}

public class UniversityManagement {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Sumit", 8.5);
        s1.displayStudent();
        System.out.println();

        s1.setCGPA(9.2);
        System.out.println("Updated CGPA: " + s1.getCGPA());
        System.out.println();

        PostgraduateStudent pg1 = new PostgraduateStudent(201, "Anjali", 9.0, "Computer Science");
        pg1.displayPGStudent();
    }
}

