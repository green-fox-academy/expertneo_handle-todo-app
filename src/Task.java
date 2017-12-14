import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Task {
  private String task;
  private boolean isDone;

  //Constructor basic ---------------------
  public Task (){
    task = "empty";
    isDone = false;
  }

  //Main constructor ---------------------
  public Task (String task, boolean isDone) {
    this.task = task;
    this.isDone = isDone;
  }

  public void setTask(String task) {
    this.task = task;
  }

  public String getTask () {
    return this.task;
  }

  public void setIsDone (boolean isDone) {
    this.isDone = isDone;
  }

  public boolean getIsDone () {
    return isDone;
  }

}
