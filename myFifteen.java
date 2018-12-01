public class myFifteen {
  public static void main(String[] args) {
    final int NCOLS = 4;
    final int NROWS = 4;
    int[][] puzzle = new int[NROWS][NCOLS];
    int[][] puzzle2 = new int[NROWS][NCOLS];

// initia lize the puzzle to all zeroes and took from fifteen example in class
  for (int rows = 0; rows < NROWS; rows++){
    for (int cols = 0; cols < NCOLS; cols++)
      puzzle[rows][cols] = 0;
  }

  initSolution(puzzle);
  printPuzzle(puzzle);
  initSolution(puzzle2);
  printPuzzle(puzzle2);

  if (puzzleEqual(puzzle, puzzle2)){
     System.out.println("This puzzles match");
   }  else {
         System.out.println("This puzzles are different");}

  } // main

  public static void initSolution(int[][] puzzle){
    for (int row = 0; row < puzzle.length; row++) {
      for (int col = 0; col < puzzle[row].length; col++)  {
          puzzle[row][col] = row * puzzle[row].length + col + 1;
        }
    }
  puzzle[puzzle.length - 1][puzzle[puzzle.length - 1].length - 1] = 0;

  }  // initsolution

  public static void printPuzzle(int[][] puzzle){
  System.out.println();
    for (int rows = 0; rows < puzzle.length; rows++) {
      for (int cols = 0; cols < puzzle[rows].length; cols++) {
        System.out.printf("%4d   ", puzzle[rows][cols]);
      }
      System.out.println();
     }
   }//method printPuzzle

   public static boolean puzzleEqual(int[][] a, int [][] b){
       for (int rows = 0; rows < a.length; rows++) {
         for (int cols = 0; cols < a[rows].length; cols++) {
            if(a[rows][cols] != b[rows][cols]) {
              return false;
            }
       }
     }
       return true;
     }// array check method
} // MyFifteen








































  }
}
