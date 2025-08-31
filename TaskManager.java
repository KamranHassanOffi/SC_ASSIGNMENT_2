import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager {
    private static ArrayList<String> tasks = new ArrayList<>();

    // ✅ Your feature
    public static void addTask(String task) {
        tasks.add(task);
        System.out.println("Task added: " + task);
    }

    // ❌ Teammates will do these
    public static void showTasks() {
        System.out.println("Feature not implemented yet.");
    }

    public static void deleteTask(int index) {
        System.out.println("Feature not implemented yet.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nChoose an option: add, show, delete, exit");
            String command = scanner.nextLine().trim();

            switch (command) {
                case "add":
                    System.out.print("Enter task: ");
                    String task = scanner.nextLine();
                    addTask(task);
                    break;

                case "show":
                    showTasks();
                    break;

                case "delete":
                    System.out.print("Enter task number to delete: ");
                    int index = scanner.nextInt();
                    scanner.nextLine();
                    deleteTask(index);
                    break;

                case "exit":
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Unknown command. Try again.");
            }
        }
    }
}
