public class Rational {

  //attributes
  public int numerator;
  public int denominator;

  //contructors
  public Rational() { }
  public Rational(int numerator, int denominator) {
  this.numerator = numerator;
  this.denominator = denominator;
} //Rational

  //getters and setters
  public int getNumerator() { return numerator; }
  public void setNumerator(int newNumerator) { numerator = newNumerator ;}
  public int getDenominator() { return denominator; }
  public void setDenominator(int newDenominator) { denominator = newDenominator; }

  //methods
  public String toString() {
    return numerator + "/" + denominator;
  }

  public double toDecimal() {
    return (double)numerator / denominator;
  }

  public Rational multiply(Rational r) {
    int multiplyNum = numerator * r.getNumerator();
    int multiplyDen = denominator * r.getDenominator();
    return new Rational(multiplyNum, multiplyDen);
  }

  public Rational add(Rational r){
    int nn = 0;
    int dd = 0;
    int addN;
    if(r.getDenominator() == denominator) {
      dd = denominator;
      nn = numerator + r.getNumerator();
    }
    else if (r.getDenominator() != denominator) {
      dd = r.getDenominator() * denominator;
      numerator = numerator * r.getDenominator();
      addN = r.getNumerator() * denominator;
      nn = addN + numerator;
    }
     return (new Rational(nn, dd));
  }

  public void copy(Rational anotherRational) {

    numerator = anotherRational.getNumerator();
    denominator = anotherRational.getDenominator();

    return;
  }

  public void reduce() {
    int newN = 0;
    int newD = 0;
    int divisor;
    int counter = 0;

    if(numerator >= denominator) {
      divisor = denominator;
    }
    else {
      divisor = numerator;
    }
    while(counter < divisor) {
      if(numerator % divisor == 0 && denominator % divisor == 0) {
        newN = numerator / divisor;
        newD = denominator / divisor;
      }
      else {
        newN = numerator;
        newD = denominator;
      }
      counter++;
    }
    numerator = newN;
    denominator = newD;
    return;
  }

  public Rational clone() {
    int cloneN = numerator;
    int cloneD = denominator;
    Rational rational2 = new Rational(cloneN, cloneD);
    return rational2;


  }



  public static void main(String[] args) {
    Rational r1 = new Rational(1, 2);
    Rational r2 = new Rational(3, 4);
    Rational r3 = new Rational();
    Rational r4 = new Rational();

    r3 = r2.clone();
    System.out.println(r3);



  }
}
