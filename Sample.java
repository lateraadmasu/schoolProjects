import java.io.File;
import java.util.Scanner;

public class Sample {
  public static void main(String[] args) {

    File myDir = new File(".");

    File[] fileList = myDir.listFiles();

    String[] lineOne = new String[fileList.length];

    Scanner s;


    for(int n = 0; n < fileList.length; n++) {

      try {
        s = new Scanner(fileList[n]);
      }
      catch (Exception e) {
        System.out.println("Oops, file not found");
        return;
      }

      String fileName = fileList[n].getName();
      if(fileName.endsWith(".java"))
        System.out.print(fileName.substring(0, fileName.length() - 5) + " : ");
        if(s.hasNext()) {
          System.out.println(s.nextLine());
        }
      }
    }
  }
