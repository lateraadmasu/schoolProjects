public class Roman {
         public static void main(String[] args) {
           int x;
           System.out.println("Insert number"); // Prompting the user to input a number
           x = TextIO.getInt(); //Using the TextIO.java file

           if (x == 1){
             System.out.println(x+" in Roman Numerals is I");
           }

           else if (x == 2){
             System.out.println(x+" in Roman Numerals is II");
           }

           else if (x == 3){
             System.out.println(x+" in Roman Numerals is III");
           }

           else if (x == 4){
             System.out.println(x+" in Roman Numerals is IV");
           }

           else if (x == 5){
             System.out.println(x+" in Roman Numerals is V");
           }

           else if (x == 6){
             System.out.println(x+" in Roman Numerals is VI");
           }

           else if (x == 7){
             System.out.println(x+" in Roman Numerals is VII");
           }

           else if (x == 8){
             System.out.println(x+" in Roman Numerals is VIII");
           }

           else if (x == 9){
             System.out.println(x+" in Roman Numerals is IX");
           }

           else if (x == 10){
             System.out.println(x+" in Roman Numerals is X");

           } else {
             System.out.println(x+" is outside of the expected range");
           }
         }  // main method
    }  // Hello Roman 
