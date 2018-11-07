//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class NumberVerify
{

	// returns true if the number is odd, otherwise
	//     it returns false
	public static boolean isOdd( int num )
	{
		// think about using the mod operator (%)
		// 1 % 2 is 1
		// 3 % 2 is 1
		// 7 % 2 is 1
		// 9 % 2 is 1
		// notice that any odd number % 2 is 1
		// so you will need an if statement
		if((num % 2 == 1)||(num % 2 == -1))
    {
      return true;
    }
    else
    {
      return false;
    }
	}



	// returns true if the number is even, otherwise
	//     it returns false
	public static boolean isEven( int num )
	{
		// think about using the mod operator (%)
		// 0 % 2 is 0
		// 2 % 2 is 0
		// 4 % 2 is 0
		// 6 % 2 is 0
		// 8 % 2 is 0
		// notice that any even number % 2 is 0
		// so you will need an if statement

    if(num % 2 == 0)
    {
      return true;
    }
    else
    {
      return false;
    }
	}
}
