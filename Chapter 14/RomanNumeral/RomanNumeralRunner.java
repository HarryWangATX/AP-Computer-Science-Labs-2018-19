//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Arrays;

// Lab Chapter 14 - #8 (EXTRA CREDIT - 120 points)  RomanNumeral    2019

// Uses files RomanNumeralRunner.java and RomanNumeral.java

// HINT:  Look at sample arrays to understand what you need to do in your code.
//		  DRAW PICTURES and walk through what you need to do.
//        If you don't know what needs to be done, you certainly cannot give
//        instructions to the computer to tell it what to do.



public class RomanNumeralRunner
{
	public static void main( String args[] )
	{
		System.out.println("Lab Chapter 14 - #8 (Extra Credit 120 points)  RomanNumeral    2019");
		System.out.println();
		System.out.println();

		// ***** fill in your name here ************************************
		String x = "Neo Wang";

		System.out.println("My name is " + verifyName(x));
		System.out.println();
		System.out.println();


		RomanNumeral test = new RomanNumeral(10);
		out.println("10 is " + test.toString());

		test.setNumber(100);
		out.println("100 is " + test.toString());

		test.setNumber(1000);
		out.println("1000 is " + test.toString());

		test.setNumber(2500);
		out.println("2500 is " + test.toString());

		test = new RomanNumeral(1500);
		out.println("1500 is " + test.toString());

		test.setNumber(23);
		out.println("23 is " + test.toString());

		test.setNumber(38);
		out.println("38 is " + test.toString());

		test.setNumber(49);
		out.println("49 is " + test.toString());

		test.setRoman("LXXVII");
		out.println("LXXVII is " + test.getNumber() + "\n");

		test.setRoman("XLIX");
		out.println("XLIX is " + test.getNumber() + "\n");

		test.setRoman("XX");
		out.println("XX is " + test.getNumber() + "\n");

		test.setRoman("XLIX");
		out.println("XLIX is " + test.getNumber() + "\n");
	}












































	public static boolean isOk(String name)
	{
		if (name.equals("????????  ????????????????"))
		{
			return false;
		}

		return true;
	}


	public static String verifyName(String name)
	{
		if (name.equals("????????  ????????????????"))
		{
			String output = "\n";

			for (int i=1; i<=100; i++)
				output += "I DID NOT PUT MY NAME ON THE OUTPUT. OH NO!!!!!!!!!!!!!!!   NO GRADE!\n";

			return output;
		}

		return name;
	}


}
