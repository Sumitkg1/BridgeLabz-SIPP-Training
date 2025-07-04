abstract class Patient {
    private String patientId, Patientname;
    private int age;

    public Patient(String id, String Patientname, int age) {
        this.patientId = id;
        this.Patientname = Patientname;
        this.age = age;
    }  

    public abstract double calculateBill();

    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId + ", Patientname: " + Patientname);
    }
}

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    private String[] records = new String[5];
    private int index = 0;

    public InPatient(String id, String Patientname, int age) {
        super(id, Patientname, age);
    }

    public double calculateBill() {
        return 5000.0;
    }

    public void addRecord(String record) {
        if (index < records.length) records[index++] = record;
    }

    public void viewRecords() {
        for (String r : records) {
            if (r != null) System.out.println(r);
        }
    }
}
