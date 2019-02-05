//© A+ Computer Science  -  www.apluscompsci.com - 2019
//Name -
//Date -
//Class -
//Lab  -


public class Fibonacci
{
	// instance variable to hold the list of fibo numbers
	private long [] fibo;


	// constructor
	public Fibonacci()
	{
		// we create the fibo array
		fibo = new long[50];

		// now fill the array with the fibonacci numbers

		// the first two numbers are both 1
		fibo[0] = 1;
		fibo[1] = 1;


		// now fill in the rest of the numbers in the array
		for (int i=2;  i<fibo.length; i++)
		{
			fibo[i] = fibo[i-1] + fibo[i-2];
		}

	}




	// toString() method
	// this method should return the list of numbers
	public String toString()
	{
		String output = "";


		// we need to loop through (traverse) the list of fibo numbers
		for (int i=0; i<fibo.length; i++)
		{
			output += fibo[i] + "\n";
		}

		output += "\n";

		return output;
	}



}
