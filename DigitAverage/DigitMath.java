//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class DigitMath
{

   private static int countDigits( int number )
	{
		String yuv = number + "";
		// look back at a previous lab for help


		return yuv.length();
	}


	private static int sumDigits( int number )
	{
		int sum=0;

		// look back at a previous lab for help

    String stilp = number + "";

    for(char a : stilp.toCharArray())
    {
      sum += Integer.parseInt(a + "");
    }

		return sum;
	}


	public static double averageDigits( int number )
	{
		double average = 0.0;

    average = ((sumDigits(number) + 0.0)/countDigits(number));

		// you can call other static methods
		// you do not need the name of the class

		// be careful, an int divided by an int truncates
		//    your fractional part
		// both methods above return an int (and do not change it)
		//    a little casting may help you or multiply by 1.0


		return average; // replace me with returning the average
	}
}
