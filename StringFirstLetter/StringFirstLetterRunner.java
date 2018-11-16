//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

// Lab Chapter 6 - #6  StringFirstLetterCheck    2018

// Uses files StringFirstLetterRunner.java and StringFirstLetterCheck.java


public class StringFirstLetterRunner
{
	public static void main( String args[] )
	{

		out.println("Lab Chapter 6 - #6  StringFirstLetterCheck    2018");
		out.println();
		out.println();

		// ***** fill in your name
		out.println("My name is Neo Wang");
		out.println();
		out.println();

		// this should create a new StringFirstLetterCheck object and sends
		// the values "hello" and "howdy" to the constructor
		// these values will be stored inside the object
	    StringFirstLetterCheck test = new StringFirstLetterCheck("hello", "howdy");

	    out.println(test);  // this calls the toString() method
	    out.println();

      test.setWords("one", "two");
      out.println(test);  // this calls the toString() method
	    out.println();

      test.setWords("three", "two");
      out.println(test);  // this calls the toString() method
	    out.println();

      test.setWords("TCEA", "UIL");
      out.println(test);  // this calls the toString() method
	    out.println();

      test.setWords("State", "Champions");
      out.println(test);  // this calls the toString() method
	    out.println();

      test.setWords("ABC", "DEF");
      out.println(test);  // this calls the toString() method
	    out.println();



		// add more test cases (see the docs)



	}
}
