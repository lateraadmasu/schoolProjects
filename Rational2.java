public class Rational2 extends Rational {

  public Rational2() { } //default constructor

  public Rational2(int numerator, int denominator) {
    super(numerator, denominator);
    count++;
    index = count;
  }

  private static int count = 0; //how many rational numbers have been created
  private int index; //order in which this Rational2 was created

  private int getIndex() {
    index++;
    return index;
  }

  public String toString() {
    return index + ": " + numerator + "/" + denominator;
  }




  public static void main(String[] args) {
    Rational2 r1 = new Rational2(1,2);
    r1.toString();
    System.out.println(r1);
    Rational2 r2 = new Rational2(1,2);
    r2.toString();
    System.out.println(r2);



  }
}
