import java.io.File;
import java.util.Scanner;

public class IO3 {
  public static void main(String[] args) {
    String[] lines = new String[15];
    int count = 0;
    Scanner r = new Scanner(System.in);
    String fileName = "";
    System.out.print("Please enter a file name to read: ");
    if(r.hasNext()) {
      fileName = r.nextLine();
    }
    Scanner s;

    try {
      s = new Scanner(new File(fileName));
    }
    catch (Exception e) {
      System.out.println("Oops, file not found");
      return;
    }

    for(int n = 0; n < 15; n++) {
      lines[n] = s.nextLine();
    }

    System.out.println("To lookup a particular line, enter the number, ^d to stop.");
    while(r.hasNextInt()) {
      int i = r.nextInt();
      if(i >= 0 && i < lines.length) {
        System.out.print("\nLine " + i + ": ");
        System.out.println(lines[i]);
      }
      System.out.println("\nNext line, ^d to stop: ");
    }
  }
}
