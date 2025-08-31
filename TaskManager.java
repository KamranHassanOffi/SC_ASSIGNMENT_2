import java.util.ArrayList;
import java.util.Scanner;
//hey
public class TaskManager {
    private static ArrayList<String> tasks = new ArrayList<>();

    // ✅ Your feature
    public static void addTask(String task) {
        tasks.add(task);
        System.out.println("Task added: " + task);
    }

    //  Teammates will do these
    public static void showTasks() {
    if (tasks.isEmpty()) {
        System.out.println("No tasks available.");
    } else {
        System.out.println("Your Tasks:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }
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
                   public static void deleteTask(int index) {
          if (index > 0 && index <= tasks.size()) {
          String removed = tasks.remove(index - 1);
        System.out.println("Task deleted: " + removed);
       } else {
        System.out.println("Invalid task number.");
    }
}
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
