import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    ListOfTasks asd = new ListOfTasks();
    String input;

    //LIST THE ARGUMENTS ----------------------------------------
    if(args.length == 0) {
      System.out.println("Command Line Todo application\n" +
              "=============================\n" +
              "\n" +
              "Command line arguments:\n" +
              " -l   Lists all the tasks\n" +
              " -a   Adds a new task\n" +
              " -r   Removes an task\n" +
              " -c   Completes an task");
      System.exit(0);
    }

    //LIST THE ITEMS ----------------------------------------
     else if (args[0].equals ("-l")) {
      asd.readFile();
      System.out.println("Items listed");
      System.exit(0);
    }

    //ADD AN ITEM ----------------------------------------
    if(args[0].equals ("-a")) {
      asd.addTask("hello", false);
      System.out.println("Item added to the list");
      System.exit(0);
    }

//    //ADD AN ITEM ----------------------------------------
//    if(args[0] == "-r") {
//
//      System.out.println("write out stored tasks");
//      System.exit(0);
//    }


//    ListOfTasks list = new ListOfTasks();
//
//    System.out.println();
  }
}
