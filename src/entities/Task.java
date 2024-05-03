package entities;

import java.util.Date;
import java.util.UUID;

public class Task {
  public final UUID taskId;
  private final String taskTitle;
  private Date taskStart;
  private Date taskEnd;

  public Task(String taskTitle, Date taskStart, Date taskEnd) {
    this.taskTitle = taskTitle;
    this.taskStart = taskStart;
    this.taskEnd = taskEnd;
    this.taskId = UUID.randomUUID();
  }

  public void updateTaskEnd(Date taskEnd) {
    this.taskEnd = taskEnd;
  }

  public void updateTaskStart(Date taskStart) {
    this.taskStart = taskStart;
  }

  public Date getTaskEnd() {
    return this.taskEnd;
  }

  public Date getTaskStart() {
    return this.taskStart;
  }

  public String getTaskTitle() {
    return this.taskTitle;
  }
}
