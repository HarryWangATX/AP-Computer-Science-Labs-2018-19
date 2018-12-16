//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

// Lab Chapter 9 - #1  DigitCounter    2018

// Uses files DigitCounterRunner.java and DigitCounter.java


public class DigitCounterRunner
{
	public static void main( String args[] )
	{
		out.println("Lab Chapter 9 - #1  DigitCounter    2018");
		out.println();
		out.println();

		// ***** fill in your name
		out.println("My name is Neo Wang");
		out.println();
		out.println();

		// STEP 1: **************************************************
		// YOU DO NOT NEED TO create a DigitCounter object
		//     since the method countDigits() is a static method
		//     inside the DigitCounter class.
		// REMEMBER that all static methods are loaded into RAM memory
		//     when your program starts up.
		// So, we will call the countDigits() method inside a println() method

    System.out.println("234 contains " + DigitCounter.countDigits(234) + " digits");
    System.out.println();
    System.out.println("10000 contains " + DigitCounter.countDigits(10000) + " digits");
    System.out.println();
    System.out.println("111 contains " + DigitCounter.countDigits(111) + " digits");
    System.out.println();
    System.out.println("9005 contains " + DigitCounter.countDigits(9005) + " digits");
    System.out.println();
    System.out.println("84645 contains " + DigitCounter.countDigits(84645) + " digits");
    System.out.println();
    System.out.println("8547 contains " + DigitCounter.countDigits(8547) + " digits");
    System.out.println();
    System.out.println("123456789 contains " + DigitCounter.countDigits(123456789) + " digits");

		// out.println(234 + " contains " + ??????.countDigits(234) + " digits");



		// add more test cases




	}
}
