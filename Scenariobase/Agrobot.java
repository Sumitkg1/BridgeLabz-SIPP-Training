import java.util.*;

// Interface: SensorReadable
interface SensorReadable {
    void readSensorData();
}

// Abstract base class: IrrigationUnit
abstract class IrrigationUnit {
    private int calibrationLevel;

    // Constructor chaining
    public IrrigationUnit(int level) {
        this.calibrationLevel = level;
        System.out.println("Calibrated at level: " + calibrationLevel);
    }

    // Final method to prevent tampering
    public final void calibrate() {
        System.out.println("Calibration is locked at level: " + calibrationLevel);
    }

    public void stopWatering() {
        System.out.println("Watering stopped.");
    }

    // Abstract method for polymorphism
    public abstract void startWatering();
}

// Subclass: Sprinkler
class Sprinkler extends IrrigationUnit implements SensorReadable {
    public Sprinkler(int level) {
        super(level); // constructor chaining
    }

    @Override
    public void startWatering() {
        System.out.println("Sprinkler: Spraying water in 360 degrees.");
    }

    @Override
    public void readSensorData() {
        System.out.println("Sprinkler: Reading humidity sensor data...");
    }
}

// Subclass: DripSystem
class DripSystem extends IrrigationUnit implements SensorReadable {
    public DripSystem(int level) {
        super(level); // constructor chaining
    }

    @Override
    public void startWatering() {
        System.out.println("DripSystem: Dripping water slowly to roots.");
    }

    @Override
    public void readSensorData() {
        System.out.println("DripSystem: Reading soil moisture sensor...");
    }
}

// Main class
public class Agrobot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<IrrigationUnit> units = new ArrayList<>();

        System.out.println("Welcome to AgroBot Irrigation System!");

        while (true) {
            System.out.println("\nChoose unit to deploy:");
            System.out.println("1. Sprinkler");
            System.out.println("2. Drip System");
            System.out.println("3. Start all units");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            if (choice == 4) break;

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter calibration level: ");
                    int level = sc.nextInt();
                    IrrigationUnit sprinkler = new Sprinkler(level);
                    units.add(sprinkler);
                }
                case 2 -> {
                    System.out.print("Enter calibration level: ");
                    int level = sc.nextInt();
                    IrrigationUnit drip = new DripSystem(level);
                    units.add(drip);
                }
                case 3 -> {
                    System.out.println("\n--- Starting All Units ---");
                    for (IrrigationUnit unit : units) {
                        unit.startWatering();
                        if (unit instanceof SensorReadable sensor) {
                            sensor.readSensorData();
                        }
                        unit.stopWatering();
                        System.out.println();
                    }
                }
                default -> System.out.println("Invalid choice.");
            }
        }

        System.out.println("System shutdown.");
        sc.close();
    }
}
