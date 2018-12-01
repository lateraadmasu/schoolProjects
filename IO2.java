import java.io.File;
import java.util.Scanner;

public class IO2 {
  public static void main(String[] args) {

    Scanner s;
    String[] lines = new String[15];
    int count = 0;

    try {
      s = new Scanner(new File("IO.java"));
    }
    catch (Exception e) {
      System.out.println("File not found");
      return;
    }


    for(count = 0; count < lines.length; count++) {
      lines[count] = s.nextLine();
    }

    for(count = 0; count < lines.length; count++) {
      System.out.println();
      System.out.println("Line " + count + ": " + lines[count]);
    }
  }
}
