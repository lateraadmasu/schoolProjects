public class Guess
{
	public static void main(String[] args) {
		       //Variables

		       int lower; //user inputs this number to serve as the lower limit
		       int upper; //user inputs this number to serve as the upper limit
		       int counter; //used to count the amount of tries it takes the program to guess the number
		       int randomNumber; //numbers genreated by the program
		       String userCorrection; //feedback user provides to the computer to help computer guess the correct number
					 counter = 0;

		       System.out.println("Ok, you think of a number, and i'll try and guess it. I wonder how many tries it will take me?");
		       System.out.println("First, you gotta tell me some stuff. What is the lowest your number could be?");
					 lower = TextIO.getInt();//prompts the user to input the lowest possible number his/her number could be

		       System.out.println("Okay. Now, what is the highest your number could be?");
					 upper = TextIO.getInt();//prompts the user to input the highest possible number his/her number could be


		       //While Loop
		       while (upper < lower){
		         System.out.println("That doesn't make sense! The upper bound must be higher lower bound. Please enter another number.");
						 upper = TextIO.getInt();//prompting user to input new upper limit that is greater than the lower limit
					 }

					 randomNumber = randomInt(lower, upper);//prompts the computer to guess a random number within the lower and upper limits
					 counter = ++counter;//counter increases by 1

		       System.out.println("My guess is " + randomNumber);
		       System.out.println("If my guess is correct, type a = ");
		       System.out.println("If my guess is too low, type a < ");
		       System.out.println("If my guess is to high, type a > ");
					 userCorrection = TextIO.getWord();//prompts the user to provide feedback on the computer's guess

		       while(!userCorrection.equals("=")) {

				        if(userCorrection.equals(">")){
				          System.out.println("Hmmm. Okay, i'll guess a little lower");
				          upper = --randomNumber;
				          randomNumber = randomInt(lower, upper);
									counter++;
				        }

				        else if(userCorrection.equals("<")){
				          System.out.println("Hmmm. Okay, i'll guess a little higher");
				          lower = ++randomNumber;
				          randomNumber = randomInt(lower, upper);
									counter++;
				        }

								else {
									System.out.println("Not correct input, try again");
								}

								System.out.println("");
								System.out.println("My guess is " + randomNumber);
								System.out.println("If my guess is correct, type a = ");
								System.out.println("If my guess is too low, type a < ");
								System.out.println("If my guess is to high, type a > ");
								userCorrection = TextIO.getWord();//prompts the user to provide feedback on the computer's guess

					} // end of while

					if (userCorrection.equals("=")){
						System.out.println("Nice! I got it, and it only took me " + counter + " tries");
					}
				} //main
	public static int randomInt(int min, int max)
	{
		return (int)((Math.random()*((max-min)+1))+min);
	}
} // end of Guess2
