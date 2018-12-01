public class Quadratic {
         public static void main(String[] args) {

           Double a;
           Double b;
           Double c;
           Double MyVar1; //My x1
           Double MyVar2; // My x2

           System.out.println("Insert a, b, c"); //Prompting the user to enter numerical values for a, b, c
           a = TextIO.getDouble(); //Using the TextIO.java file
           b = TextIO.getDouble(); //Using the TextIO.java file
           c = TextIO.getDouble(); //Using the TextIO.java file

           MyVar1 = (-b + Math.sqrt( b*b - 4*a*c ) )/ (2*a); // My quadratic equation
           MyVar2 = (-b - Math.sqrt( b*b - 4*a*c ) )/ (2*a); // My quadratic equation

           if (b*b - 4*a*c>=0){
             System.out.println("x1 =" + MyVar1);
             System.out.println("x2 =" + MyVar2);

           } else {
             System.out.println("Error, no real roots");
           }
    } // main method
} // Hello Quadratic
