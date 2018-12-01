public class Q6
{
	public static void main(String[] args)
	{
		final int DIM = 4;

		// VERSION 1
		// this version uses nested for loops and prints out a
		// number based on a counter variable.
		System.out.println("\nversion 1:");
		int x = 0;
		for (int r = 0; r < DIM; r++)
		{
			for (int c = 0; c < DIM; c++)
			{
				x += 1;
				if (x != 16)
				{
					System.out.printf("%4d", x);
				}
				else
				{
					System.out.printf("%4s", "");
				}
			}

			// end of row, so print new line
			System.out.println("");
		}



		// VERSION 2
		// this version uses nested for loops and prints out a
		// number based on a formula involving the current row,
		// column, and DIM.
		System.out.println("\nversion 2:");
		for (int r = 0; r < DIM; r++)
		{
			for (int c = 0; c < DIM; c++)
			{
				x = (DIM * r) + c + 1;
				if (x != 16)
				{
					System.out.printf("%4d", x);
				}
				else
				{
					System.out.printf("%4s", "");
				}
			}

			// end of row, so print new line
			System.out.println("");
		}



		// VERSION 3
		// this version uses a single for loop and prints out a
		// number based on the loop counter, and prints out a new
		// line based on the modulus of the loop counter.
		System.out.println("\nversion 3:");
		for (int i = 0; i < DIM*DIM; i++)
		{
			if (i%DIM == 0)
			{
				System.out.println("");
			}

			if (i+1 != 16)
			{
				System.out.printf("%4d", i+1);
			}
			else
			{
				System.out.printf("%4s", "");
			}
		}



		// end
		System.out.println("\n");
	}
}
