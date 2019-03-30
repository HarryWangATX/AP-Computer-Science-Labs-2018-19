//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;


// Lab Chapter 18 - #3  Rational    2019

// Uses files RationalRunner.java and Rational.java


public class RationalRunner
{
	public static void main( String args[] )
	{
		System.out.println("Lab Chapter 18 - #3  Rational    2019");
		System.out.println();
		System.out.println();

		// ***** fill in your name
		System.out.println("My name is Neo Wang");
		System.out.println();
		System.out.println();


		// The runner file has been done for you

		Rational fraction1 = new Rational(1,4);
		out.println("fraction1 = " + fraction1.toString());

		Rational fraction2 = new Rational(3,4);
		out.println("fraction2 = "+fraction2.toString());

		out.println("fraction1.equals(fraction2) = "+fraction1.equals(fraction2));

		out.println();
		out.println();


		Rational fraction3 = fraction1.clone();
		out.println("fraction3 after fraction1.clone() = "+fraction3);
		out.println("fraction3.equals(fraction1) = "+fraction3.equals(fraction1));
		out.println();
		out.println();

		out.println("fraction1.compareTo(fraction2) = "+fraction1.compareTo(fraction2));
		out.println("fraction2.compareTo(fraction1) = "+fraction2.compareTo(fraction1));
		out.println("fraction3.compareTo(fraction1) = "+fraction3.compareTo(fraction1));
		out.println();
		out.println();

		Rational fraction4 = fraction1.add(fraction2);
		out.println("\n\nfraction1.add(fraction2) = "+ fraction4);




	}
}
