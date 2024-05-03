package entities;

import java.time.LocalDate;
import java.util.UUID;

public class Task {
  public final String taskId;
  private final String taskTitle;
  private LocalDate taskStart;
  private LocalDate taskEnd;

  public Task(String taskTitle, LocalDate taskStart, LocalDate taskEnd) {
    this.taskTitle = taskTitle;
    this.taskStart = taskStart;
    this.taskEnd = taskEnd;
    this.taskId = UUID.randomUUID().toString();
  }

  public void updateTaskEnd(LocalDate taskEnd) {
    this.taskEnd = taskEnd;
  }

  public void updateTaskStart(LocalDate taskStart) {
    this.taskStart = taskStart;
  }

  public LocalDate getTaskEnd() {
    return this.taskEnd;
  }

  public LocalDate getTaskStart() {
    return this.taskStart;
  }

  public String getTaskTitle() {
    return this.taskTitle;
  }
}
