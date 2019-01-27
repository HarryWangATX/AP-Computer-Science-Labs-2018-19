//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

// Lab Chapter 9 - #3  DigitMath    2018

// Uses files DigitMathRunner.java and DigitMath.java


public class DigitMathRunner
{
	public static void main( String args[] )
	{
		out.println("Lab Chapter 9 - #3  DigitMath    2018");
		out.println();
		out.println();

		// ***** fill in your name
		out.println("My name is Neo Wang");
		out.println();
		out.println();

		// STEP 1: **************************************************
		// YOU DO NOT NEED TO create a DigitMath object
		//     since the method averageDigits() is a static method
		//     inside the DigitMath class.
		// REMEMBER that all static methods are loaded into RAM memory
		//     when your program starts up.
		// So, we will call the averageDigits() method inside a println() method

		out.println(234 + " has a digit average of " + DigitMath.averageDigits(234));
		out.println(10000 + " has a digit average of " + DigitMath.averageDigits(10000));
		out.println(111 + " has a digit average of " + DigitMath.averageDigits(111));
		out.println(9005 + " has a digit average of " + DigitMath.averageDigits(9005));
		out.println(84645 + " has a digit average of " + DigitMath.averageDigits(84645));
		out.println(8547 + " has a digit average of " + DigitMath.averageDigits(8547));
		out.println(123456789 + " has a digit average of " + DigitMath.averageDigits(123456789));
		out.println();






		// add more test cases



	}
}
