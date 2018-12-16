//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

// Lab Chapter 9 - #4  Divisors    2018

// Uses files DivisorsRunner.java and Divisors.java


public class DivisorsRunner
{
	public static void main( String args[] )
	{
		out.println("Lab Chapter 9 - #4  Divisors    2018");
		out.println();
		out.println();

		// ***** fill in your name
		out.println("My name is Neo Wang");
		out.println();
		out.println();


		// STEP 1: **************************************************
		// YOU DO NOT NEED TO create a Divisors object
		//     since the method getDivisors() is a static method
		//     inside the Divisors class.
		// REMEMBER that all static methods are loaded into RAM memory
		//     when your program starts up.
		// So, call the getDivisors() method inside a println() method

  	out.println(10 + " has the divisors " + Divisors.getDivisors(10));
  	out.println();

    out.println(45 + " has the divisors " + Divisors.getDivisors(14));
    out.println();

    out.println(1024 + " has the divisors " + Divisors.getDivisors(1024));
    out.println();

    out.println(1254 + " has the divisors " + Divisors.getDivisors(1254));
    out.println();

    out.println(33 + " has the divisors " + Divisors.getDivisors(33));
    out.println();

    out.println(65535 + " has the divisors " + Divisors.getDivisors(65535));
    out.println();


		// add more test cases

	}
}
