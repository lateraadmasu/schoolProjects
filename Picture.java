public class Picture {
  public static void main(String[] args) {
    int rows = 0;
    int columns = 0;
    int numberOfPixels = 0;
    int chartRow;
    int chartColumn;
    int min = 0;

    rows = Integer.valueOf(args[0]);
    columns = Integer.valueOf(args[1]);
    numberOfPixels = Integer.valueOf(args[2]);

    if(rows < 1 || columns < 1){
      return;
    }

    char frame[][] = new char[rows][columns];

    for(int counter = 0; counter < rows; counter++){
      for(int n = 0; n < columns; n++){
        frame[counter][n] = ' ';
      }
    }

    for(int p = 0; p < numberOfPixels; p++){
      chartRow = randomInt(0, rows-1);
      chartColumn = randomInt(0, columns-1);
      frame[chartRow][chartColumn] = '*';
    }


    for(int n = 0; n < rows; n++){
      for(int m = 0; m < columns; m++){
        System.out.print(frame[n][m]);
      }
      System.out.println("");
    }
  }
  public static int randomInt(int min, int max)
  {
    return(int)((Math.random()*((max-min)+1))+ min);
  }
}
