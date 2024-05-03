package views;

import entities.Task;
import entities.TaskList;

import java.time.LocalDate;
import java.util.Scanner;

public class TaskListView {
  TaskList taskList;
  Scanner Input;

  public TaskListView(TaskList taskList) {
    this.taskList = taskList;
    this.Input = new Scanner(System.in);
  }

  public int renderMenu() {
    String[] USER_ACTIONS = {"1 - Add task", "2 - Remove task", "3 - Edit task", "4 - List Task", "5 - Exit"};

    System.out.println();
    for (String action : USER_ACTIONS) {
      System.out.println(action);
    }
    System.out.println();

    System.out.print("[INPUT] Type the respective option: ");
    int userAction = Input.nextInt();
    Input.nextLine();

    return userAction;
  }

  public void renderTasks() {
    System.out.println();
    for (Task task : this.taskList.tasks) {
      System.out.printf("%S - %S \n", task.taskId, task.getTaskTitle());
    }
    System.out.println();
  }

  public void renderAddTask() {
    System.out.println();

    System.out.print("Task title: ");
    String taskTitle = Input.nextLine();

    System.out.print("Task start (yyyy-mm-dd): ");
    LocalDate taskStart = LocalDate.parse(Input.nextLine());

    System.out.print("Task end (yyyy-mm-dd): ");
    LocalDate taskEnd = LocalDate.parse(Input.nextLine());

    taskList.addTask(taskTitle, taskStart, taskEnd);
  }

  public void renderRemoveTask() {
    System.out.println();
    System.out.print("Task identifier: ");
    String taskId = Input.nextLine();
    System.out.println();
    taskList.removeTask(taskId);
  }

  public void renderEditTask() {
    System.out.println();
    System.out.print("Task identifier: ");
    String taskId = Input.nextLine();
    System.out.println();

    System.out.print("Task start (yyyy-mm-dd): ");
    LocalDate taskStart = LocalDate.parse(Input.nextLine());

    System.out.print("Task end (yyyy-mm-dd): ");
    LocalDate taskEnd = LocalDate.parse(Input.nextLine());

    taskList.updateTask(taskId, taskStart, taskEnd);
  }
}
