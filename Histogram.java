  public class Histogram {
    public static void main(String[] args) {
      int [] hist = new int[101];
      int [] intArray = new int[101];
      int m = 0; //max counter
      int n = 0; //min coutner
      int w = 0; //avg divisor
      int row;
      int sum = 0;
      int avg = 0;
      int index;
      int maxFrequency = 0;
      int maxValue = 0;
      int minValue = 100;
      int count = 0;
      int count2 = 0;
      int currentScore;

      //Step 1
      for(row = 0; row < hist.length; row++) {
        hist[row] = 0;
      }

      for(count=0; count < args.length; count++){
        currentScore = Integer.valueOf(args[count]);
        if(currentScore >= 0 && currentScore < 101)
          hist[currentScore]++;
      }

      //Step 2
      for(row = 0; row < hist.length; row++){
        if(hist[row] > 0){
          System.out.println(row + " " + hist[row]);
      }
     }

      //Step 3
        for(n = 0; n < args.length; n++){
          if(Integer.valueOf(args[n]) <= minValue){
            minValue = Integer.valueOf(args[n]);
          }
        }

        for(m = 0; m < args.length; m++){
          if(Integer.valueOf(args[m]) > maxValue){
            maxValue = Integer.valueOf(args[m]);
          }
        }

        for(count = 0; count < hist.length; count++){
          if(hist[count]!= 0){
            if(hist[count] >1 ){
              count2 = count * hist[count];
              w = w + hist[count];
            }

          avg = avg + count + count2;
          w +=1;
          count2 = 0;
          }
        }

      for(count = 0; count < hist.length; count++){
        if(hist[count] != 0){
          if(hist[count]>= maxFrequency){
            maxFrequency = hist[count];
          }
        }
      }

      for(count = 0; count < hist.length; count++){
        if(maxFrequency == hist[count]){
          if(hist[count]>= maxFrequency){
            maxFrequency = hist[count];
          }
        }
      }

      for(row = 0; row < intArray.length; row++) {
        intArray[row] = 0;
      }

      for(int i = 0; i < intArray.length; i++) {
        if (maxFrequency == hist[i]){
          intArray[i] = 1;
          System.out.println("Element at index " + i + " : "+ intArray[i]);
       }
     }

    avg = avg / w;

    System.out.println("Max value is: " +maxValue + ". Min value is: " + minValue);
    System.out.println("Avg score is: " + avg);
    System.out.print("Mode is: " +maxFrequency + " These indices have that mode: ");

    for (int j = 0; j < intArray.length; j++) {
      if (intArray[j] == 1) {
        System.out.print(j + " ");
      }
    }
    System.out.println(" ");
   }
 }
