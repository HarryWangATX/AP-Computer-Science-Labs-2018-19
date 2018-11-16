//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

// Lab Chapter 6 - #5  StringLengthCheck    2018

// Uses files StringLengthRunner.java and StringLengthCheck.java



public class StringLengthRunner
{
	public static void main( String args[] )
	{
		out.println("Lab Chapter 6 - #5  StringLengthCheck    2018");
		out.println();
		out.println();

		// ***** fill in your name
		out.println("My name is Neo Wang");
		out.println();
		out.println();

		// this should create a new StringLengthCheck object and sends
		// the values "hello" and "goodbye" to the constructor
		// these values will be stored inside the object
	    StringLengthCheck test = new StringLengthCheck("hello", "goodbye");

	    out.println(test);  // this calls the toString() method
	    out.println();

			test.setWords("one", "two");
			System.out.println(test);
			System.out.println();

			test.setWords("three", "four");
			System.out.println(test);
			System.out.println();

			test.setWords("TCEA", "UIL");
			System.out.println(test);
			System.out.println();

			test.setWords("State", "Champions");
			System.out.println(test);
			System.out.println();

			test.setWords("ABC", "DEF");
			System.out.println(test);
			System.out.println();

			test.setWords("four", "five");
			System.out.println(test);
			System.out.println();

			test.setWords("whoot", "what");
			System.out.println(test);
			System.out.println();
			

		// add more test cases (see the doc file)



	}
}
