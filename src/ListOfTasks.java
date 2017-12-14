import javax.sound.midi.Soundbank;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ListOfTasks extends Task{
  Integer index;
  List <Task> tasks;
  String path = "tasks.txt";

  //Constructor
  public ListOfTasks (){
    tasks = new ArrayList<>();
    try {
      Path filePath = Paths.get(path);
      List<String> readAllLines = Files.readAllLines(filePath);
//      System.out.println(readAllLines);
    } catch (IOException e) {
      System.out.println("Unable to read the file given...");
    }
  }

  public void addTask (String task, Boolean isDone) {
    Task variableTask = new Task(task, isDone);
    tasks.add(variableTask);
    writeInFile();
    System.out.println(tasks);
    System.out.println("You added an entry to the List");
  }

  public void setTasks (Integer index ,Task task) {
    tasks.set(index, task);
    System.out.println(index + " index value got modified");
  }

  public void removeTask (Integer index) {
    tasks.remove(index);
    System.out.println(index + " index value is deleted.");
  }

  public void writeInFile() {
    try {
      Path filePath = Paths.get(path);
//      List<String> tasks = Files.readAllLines(filePath);
      Files.write(filePath, tasksToList(), StandardOpenOption.APPEND);
      System.out.println(tasks);
      System.out.println("File written");
    } catch (Exception e){
      System.out.println("Unable to write file: " + path);
    }
  }

  public void readFile (){
    try {
      Path filePath = Paths.get(path);
      List<String> readAllLines = Files.readAllLines(filePath);
      System.out.println(readAllLines);
    } catch (IOException e) {
      System.out.println("Unable to read the file given...");
    }
  }

  public List<String> tasksToList (){
    List<String> varList = new ArrayList<>();
    for (int i = 0; i < tasks.size(); i++) {
      varList.add(tasks.get(i).toString());
    }
    return varList;
  }
}
