import java.util.Scanner;


public class IO1 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String[] words = new String[4];
    int n = 0;

    System.out.printf("\nPlease enter a word (control d or stop to end): ");
    while(n < 4 && s.hasNext()) {
      words[n] = s.nextLine();
      if(words[n].equals("stop")) {
        words[n] = "null";
        n = 4;
      }
      else {
      System.out.printf("\n\nYou entered: " + words[n]);
      System.out.printf("\n\nPlease enter a word (control d or stop to end): ");
      n++;
    }
  }



    System.out.printf("\nOK\n\n");

    for(n = 0; n < words.length; n++) {
      System.out.printf("\n" + words[n]);
      System.out.println();
    }
  }
}
