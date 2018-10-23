//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

// Lab Chapter 4 - #2 - FirstAndLast    2018

public class FirstRunner
{
	public static void main ( String[] args )
	{

		System.out.println("Lab Chapter 4 - #2 - FirstAndLast    2018");
		System.out.println();
		System.out.println("My name is Neo Wang");
		System.out.println();
		System.out.println();

		// here we create a new FirstAndLast object and we send the
		//    value "hello" to the constructor
		// reference variable demo is assigned the memory address (location) of
		//    the FirstAndLast object

		FirstAndLast demo = new FirstAndLast("Hello");
		demo.findFirstLastLetters(); // calls method findFirstLastLetters();
		out.println(demo); // calls the toString()

    demo.setString("World");
		demo.findFirstLastLetters(); // calls method findFirstLastLetters();
		out.println(demo); // calls the toString()

    demo.setString("JukeBox");
		demo.findFirstLastLetters(); // calls method findFirstLastLetters();
		out.println(demo); // calls the toString()

    demo.setString("TCEA");
		demo.findFirstLastLetters(); // calls method findFirstLastLetters();
		out.println(demo); // calls the toString()

    demo.setString("UIL");
		demo.findFirstLastLetters(); // calls method findFirstLastLetters();
		out.println(demo); // calls the toString()

		// add more test cases
		// look at the doc file to see the test case values

	}
}
