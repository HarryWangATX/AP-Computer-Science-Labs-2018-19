//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

// Lab Chapter 7 - #4  MorseCode    2018

// Uses files MorseCodeRunner.java and MorseCode.java

// HINT:  Look back at previous programs that you have
//        written to help you.
//        Draw a picture of your MorseCode object.
//        Look at your doc file to see the correct output.

public class MorseCodeRunner
{
	public static void main( String args[] )
	{
		out.println("Lab Chapter 7 - #4  MorseCode    2018");
		out.println();
		out.println();

		// ***** fill in your name
		out.println("My name is Neo Wang");
		out.println();
		out.println();

		// There is no Scanner object in this lab. No input.

		// Step 1:
		// Construct a new MorseCode object and send
		// the value of 'A' to the constructor
		//    make sure that your reference variable
		//    refers to a MorseCode object
	  MorseCode test = new MorseCode();


		// Step 2:
		// use out.println(...) to print out the morse code
		//    you will need to call your MorseCode object's
		//    getMorseCode() method
		// look at your doc file to see the correct output

    test.setChar('a');
    System.out.println(test);
    System.out.println();

    test.setChar('b');
    System.out.println(test);
    System.out.println();

    test.setChar('3');
    System.out.println(test);
    System.out.println();

    test.setChar('z');
    System.out.println(test);
    System.out.println();

    test.setChar('8');
    System.out.println(test);
    System.out.println();

    test.setChar('f');
    System.out.println(test);
    System.out.println();

    test.setChar('0');
    System.out.println(test);
    System.out.println();



		// Step 3:
		// use out.println(...) to print out the morse code message
		//    you will need to call your MorseCode object's
		//    toString() method
		// look at your doc file to see the correct output



		// add more test cases
		// use your set method

	}
}
