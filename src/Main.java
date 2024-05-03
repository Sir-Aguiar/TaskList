import entities.Task;
import entities.TaskList;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {


  public static void main(String[] args) {
    Scanner Input = new Scanner(System.in);

    System.out.print("Enter your username: ");
    String userName = Input.nextLine().trim();
    System.out.println();

    TaskList taskList = new TaskList(userName);

    String[] USER_ACTIONS = {"1 - Add task", "2 - Remove task", "3 - Edit task", "4 - List Task", "5 - Exit"};

    int userAction = 0;

    while (userAction != 5) {
      System.out.println();
      for (String action : USER_ACTIONS) {
        System.out.println(action);
      }
      System.out.println();

      System.out.print("[INPUT] Type the respective option: ");
      userAction = Input.nextInt();
      Input.nextLine();

      switch (userAction) {
        case 1:
          System.out.println();

          System.out.print("Task title: ");
          String taskTitle = Input.nextLine();

          System.out.print("Task start (yyyy-mm-dd): ");
          LocalDate taskStart = LocalDate.parse(Input.nextLine());

          System.out.print("Task end (yyyy-mm-dd): ");
          LocalDate taskEnd = LocalDate.parse(Input.nextLine());

          taskList.addTask(taskTitle, taskStart, taskEnd);
          break;
        case 2:
          System.out.println();
          System.out.print("Task identifier: ");
          String taskId = Input.nextLine();
          System.out.println();
          taskList.removeTask(taskId);
          break;
        case 4:
          System.out.println();
          for (Task task : taskList.tasks) {
            System.out.printf("%S - %S \n", task.taskId, task.getTaskTitle());
          }
          System.out.println();
          break;
      }

    }
  }
}