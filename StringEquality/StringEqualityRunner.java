//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;


// Lab Chapter 6 - #2  StringEquality    2018

// Uses files StringEqualityRunner.java and StringEquality.java


public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		out.println("Lab Chapter 6 - #2  StringEquality    2018");
		out.println();
		out.println();

		// ***** fill in your name
		out.println("My name is Neo Wang");
		out.println();
		out.println();


		// create a new StringEquality object and send
		// to the constructor the values  "hello" and  "goodbye"
	  StringEquality test = new StringEquality("hello","goodbye");

	  out.println(test);  // this calls the toString() method
		out.println();	// skips a line

    test.setWords("one", "two");
    out.println(test);  // this calls the toString() method
		out.println();	// skips a line

    test.setWords("four", "four");
    out.println(test);  // this calls the toString() method
		out.println();	// skips a line

    test.setWords("TCEA", "UIL");
    out.println(test);  // this calls the toString() method
		out.println();	// skips a line

    test.setWords("State", "Champions");
    out.println(test);  // this calls the toString() method
		out.println();	// skips a line

    test.setWords("ABC", "ABC");
    out.println(test);  // this calls the toString() method
		out.println();	// skips a line

    test.setWords("ABC","CBA");
    out.println(test);  // this calls the toString() method
		out.println();	// skips a line

    test.setWords("Same", "Same");
    out.println(test);  // this calls the toString() method
		out.println();	// skips a line

		// add more test cases (see the docs for the data values)
		// call your set method. Do not make more objects
	}
}
