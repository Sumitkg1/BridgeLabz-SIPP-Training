import java.util.LinkedList;
import java.util.Scanner;

abstract class Task {
    protected String description;

    public Task(String description) {
        this.description = description;
    }

    public abstract void execute();

    public String getDescription() {
        return description;
    }
}

class Meeting extends Task {
    public Meeting(String description) {
        super(description);
    }

    @Override
    public void execute() {
        System.out.println("Attending meeting: " + description);
    }
}

class Workout extends Task {
    public Workout(String description) {
        super(description);
    }

    @Override
    public void execute() {
        System.out.println("Doing workout: " + description);
    }
}

class CodingSession extends Task {
    public CodingSession(String description) {
        super(description);
    }

    @Override
    public void execute() {
        System.out.println("Working on coding session: " + description);
    }
}

public class DailyTask {

    private static LinkedList<Task> tasks = new LinkedList<>();

    public static void addTask(Task task) {
        tasks.add(task);
        System.out.println("Task added.");
    }

    public static void showAllTasks() {
        System.out.println("\n--- All Tasks ---");
        for (Task task : tasks) {
            task.execute();
        }
    }

    public static void searchTask(String keyword) {
        System.out.println("\n--- Search Results ---");
        boolean found = false;
        for (Task task : tasks) {
            if (task.getDescription().toLowerCase().contains(keyword.toLowerCase())) {
                task.execute();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No matching task found.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Daily Task Planner!");

        // Step 1: Let user add tasks
        while (true) {
            System.out.println("\nAdd a task:");
            System.out.println("1. Meeting");
            System.out.println("2. Workout");
            System.out.println("3. Coding Session");
            System.out.println("4. Done adding tasks");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();  // consume newline

            if (choice == 4) break;

            System.out.print("Enter task description: ");
            String desc = sc.nextLine();

            switch (choice) {
                case 1 -> addTask(new Meeting(desc));
                case 2 -> addTask(new Workout(desc));
                case 3 -> addTask(new CodingSession(desc));
                default -> System.out.println("Invalid choice.");
            }
        }

        // Step 2: Show all tasks
        showAllTasks();

        // Step 3: Allow repeated keyword search
        while (true) {
            System.out.print("\nEnter keyword to search (or type 'exit' to quit): ");
            String keyword = sc.nextLine();
            if (keyword.equalsIgnoreCase("exit")) break;

            searchTask(keyword);
        }
        

        System.out.println("Thank you for using the planner!");
        sc.close();
    }
}
