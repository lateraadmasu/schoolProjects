public class practiceQuestion345
{
  public static void main(String[] args)
  {
    //Variables
    int n = Integer.valueOf(args[0]);
    double namelist[] = new double[n];

    //calling methods
    fill(namelist, n); //calling fill method

    double sum = average(namelist, n); //calling average, must define since returning a number
    System.out.println(sum/n);//prints out average

    double max = largestValue(namelist, n);
    System.out.println("The max value is " + max);//prints out max

    double min = smallestValue(namelist, n);
    System.out.println("The min value is " + min);//prints out max
  }

    public static void fill(double namelist[], double n)
    {
      //filling array w/numbers
      for(int i = 0; i<n; i++)
      {
        namelist[i] = Math.random();
      }

    }


    public static double average(double namelist[], double n)
    {
      //calculating avg
      double sum = 0;

      for(int i = 0; i<n; i++)
      {
        sum = sum + namelist[i];
      }
        return sum;
    }

    public static double largestValue(double namelist[], double n)
    {
      double max = 0;//variable for max value

      for(int i = 0; i<n; i++)
      {
        if(namelist[i]> max)
        {
          max = namelist[i];
        }
      }
      return max;
    }

    public static double smallestValue(double namelist[], double n)
    {
      double min = 0;//variable for max value

      for(int i = 0; i<n; i++)
      {
        if(namelist[i]< min)
        {
          min = namelist[i];
        }
      }
      return min;
    }
}
