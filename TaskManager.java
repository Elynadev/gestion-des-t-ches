
import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager implements TaskOperation {
    static Scanner scanner = new Scanner(System.in);

    // instancier la classe
    static TaskManager TaskManager = new TaskManager();
    // TYPAGE D4UN TABLEAU DE TYPE TASK
    static ArrayList<Task> TaskList = new ArrayList<>();
    static int id = 1;

    @Override
    public void addTask() {
        System.out.println("entrer le  titre de la tâche");
        String title = scanner.nextLine();
        Task Task = new Task(id++, title);
        TaskList.add(Task);
    };

    @Override
    public void displayTask() {
        System.out.println("liste des tâches");
        for (Task task : TaskList) {
            System.out.println(task.getTitle());
        }
    };

    public static void main(String[] args) {

        TaskManager.menu();
    }

    public void menu() {
        while (true) {
            System.out.println("1-TODOLIST");
            System.out.println("2-ADD TASK");
            System.out.println("3-REMOVE TASK");
            System.out.println("4-DISPLAY ALL TASK");
            System.out.println("5- DISPLAY TASK BY ID ");
            System.out.println("6-EXIT ");
            System.out.println("faire un choix  ");
            String choice = scanner.nextLine();

            switch (choice) {

                case "1":
                    TaskManager.addTask();
                    System.out.println("entré valide");
                    break;
                case "2":

                    System.out.println(" invalide");
                    break;
                case "3":

                    System.out.println("invalide");
                    break;
                case "4":

                    displayTask();
                    System.out.println("valid");
                    break;
                case "5":

                    System.out.println("invalide");
                    break;
                case "6":
                    System.out.println("Sortie du programme...");
                    System.exit(0);
                default:
                    System.out.println("Option invalide.");
            }

        }

    }
}
