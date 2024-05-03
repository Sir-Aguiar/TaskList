package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class TaskList {

  public ArrayList<Task> tasks;
  String listOwner;

  public TaskList(String listOwner) {
    this.listOwner = listOwner;
    this.tasks = new ArrayList<>();
    System.out.printf("[SUCCESS] Task list created successfully by %S \n", listOwner);
  }


  public String addTask(String taskTitle, LocalDate taskStart, LocalDate taskEnd) {
    Task createdTask = new Task(taskTitle, taskStart, taskEnd);
    this.tasks.add(createdTask);
    System.out.printf("[SUCCESS] '%S' has been successfully added \n", taskTitle);
    return createdTask.taskId;
  }

  public void removeTask(String taskId) {
    Iterator<Task> iterator = this.tasks.iterator();

    while (iterator.hasNext()) {
      Task task = iterator.next();

      if (Objects.equals(task.taskId.toLowerCase(), taskId.toLowerCase())) {
        iterator.remove();
        System.out.println("[SUCCESS] Specified task has been successfully removed \n");

        break;
      }
    }

  }

}
