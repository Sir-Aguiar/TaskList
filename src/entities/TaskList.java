package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.UUID;

public class TaskList {

  String listOwner;
  ArrayList<Task> tasks;

  public TaskList(String listOwner) {
    this.listOwner = listOwner;

    System.out.printf("[SUCCESS] Task list created successfully by %S", listOwner);
  }


  public UUID addTask(String taskTitle, Date taskStart, Date taskEnd) {
    Task createdTask = new Task(taskTitle, taskStart, taskEnd);
    this.tasks.add(createdTask);
    System.out.printf("[SUCCESS] '%S' has been successfully added", taskTitle);
    return createdTask.taskId;
  }

  public void removeTask(UUID taskId) {
    Iterator<Task> iterator = this.tasks.iterator();

    while (iterator.hasNext()) {
      Task task = iterator.next();

      if (task.taskId.equals(taskId)) {
        iterator.remove();
        System.out.println("[SUCCESS] Specified task has been successfully removed");

        break;
      }
    }

  }

}
