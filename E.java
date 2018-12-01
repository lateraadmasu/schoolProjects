public class E {

  static int fact(int n) {
    int factorial = 1;

    for(int counter = 1; counter <= n; counter++) {
      factorial = factorial * counter;
    }
    return factorial;
  }

  //public static void main(String[] args) {
    //Rational r1 = new Rational(1, 2);
    //Rational r2 = new Rational2(3, 4);
    //Object r3 = new Rational2(5, 6);

    //System.out.println(r1);
    //System.out.println(r2);
    //System.out.println(r3);
  //}

  public static void main(String[] args) {
    int n = Integer.valueOf(args[0]);
    Rational2[] r = new Rational2[n];

    for(int m = 0; m < n; m++) {
      int factorialNew = fact(m);
      r[m] = new Rational2(1, factorialNew);
    }
    double[] array = new double[n];
    Rational2 answer;
    double decimalPlace;
    for(int m = 0; m < n; m++) {
      answer = r[m];
      decimalPlace = answer.toDecimal();
      array[m] = decimalPlace;
    }
    double totalAnswer = 0;
    for(int m = 0; m < n; m++) {
      totalAnswer = array[m] + totalAnswer;
    }

    System.out.println(totalAnswer);



  }
}
