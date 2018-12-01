public class Windchill5 {
  public static void main(String[] args) {
    int temp;
    double wind = 5;

    temp = Integer.valueOf(args[0]);
    int counter = 0;
    double windTemp;
    System.out.println("Temperature         Wind = 5          Wind=10         Wind = 15         Wind = 20");

    while (counter < 20)
    {
      System.out.println("");
      if(counter % 5 == 0){
        System.out.println("-------------------------------------------------------------------------------");
      }
      System.out.println(temp);
      while(wind <= 25) {
        windTemp = (0.6215*temp - 35.75*(Math.pow(wind,0.16)) + 0.4275*temp*(Math.pow(wind, 0.16)) + 35.74);
        wind = wind +5;
        System.out.printf("%18.0f", windTemp);
      }
      temp--;
      counter++;
      wind = 5;
    }

  }

}
