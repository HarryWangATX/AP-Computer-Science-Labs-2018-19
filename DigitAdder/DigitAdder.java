//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class DigitAdder
{
   public static int sumDigits( int number )
	{
		int sum=0;
    String yes = number + "";

		// use a while loop
		// look at the doc file for help

		// while (?????? > 0)
		// {
			   // int digit = number ??? 10;
			   // now add this digit value to your sum
			   // now strip the right most digit from number (use /10)
		// }

    for(int i = 0; i < yes.length(); i++)
    {
      sum += Integer.parseInt(yes.charAt(i) + "");
    }

		return sum;
	}
}
