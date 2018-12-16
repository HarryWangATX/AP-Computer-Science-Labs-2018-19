//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

// Lab Chapter 9 - #2  DigitAdder    2018

// Uses files DigitAdderRunner.java and DigitAdder.java


public class DigitAdderRunner
{
	public static void main( String args[] )
	{
		out.println("Lab Chapter 9 - #2  DigitAdder    2018");
		out.println();
		out.println();

		// ***** fill in your name
		out.println("My name is Neo Wang");
		out.println();
		out.println();

		// STEP 1: **************************************************
		// YOU DO NOT NEED TO create a DigitAdder object
		//     since the method sumDigits() is a static method
		//     inside the DigitAdder class.
		// REMEMBER that all static methods are loaded into RAM memory
		//     when your program starts up.
		// So, we will call the sumDigits() method inside a println() method

		// out.println(??????.sumDigits(234) + " is the sum of the digits of " + 234);

		System.out.println(DigitAdder.sumDigits(234) + " is the sum of the digits of " + 234);
    System.out.println(DigitAdder.sumDigits(10000) + " is the sum of the digits of " + 10000);
    System.out.println(DigitAdder.sumDigits(111) + " is the sum of the digits of " + 111);
    System.out.println(DigitAdder.sumDigits(9005) + " is the sum of the digits of " + 9005);
    System.out.println(DigitAdder.sumDigits(84645) + " is the sum of the digits of " + 84645);
    System.out.println(DigitAdder.sumDigits(8547) + " is the sum of the digits of " + 8547);
    System.out.println(DigitAdder.sumDigits(123456789) + " is the sum of the digits of " + 123456789);





		// add more test cases



	}
}
