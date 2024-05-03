import entities.TaskList;
import views.TaskListView;

public class Main {

  public static void main(String[] args) {
    TaskList taskList = new TaskList("Felipe");

    TaskListView taskView = new TaskListView(taskList);

    int userAction = 0;

    while (userAction != 5) {
      userAction = taskView.renderMenu();

      switch (userAction) {
        case 1:
          taskView.renderAddTask();
          break;
        case 2:
          taskView.renderRemoveTask();
          break;
        case 3:
          taskView.renderEditTask();
          break;
        case 4:
          taskView.renderTasks();
          break;
      }
    }
  }
}