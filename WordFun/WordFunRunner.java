//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

// Lab Chapter 6 - #7  WordFun    2018

// Uses files WordFunRunner.java and WordFun.java


public class WordFunRunner
{
	public static void main( String args[] )
	{
		out.println("Lab Chapter 6 - #7  WordFun    2018");
		out.println();
		out.println();

		// ***** fill in your name
		out.println("My name is Neo Wang");
		out.println();
		out.println();

		// this should create a new WordFun object and send
		// the value "Hello World" to the constructor
		// this value will be stored inside the object
	    WordFun test = new WordFun("Hello World");

	    out.println(test); // calls the toString() method

	    test.makeUpper();  // changes the instance variable inside the object
	    out.println(test); // calls the toString() method

	    test.addHyphen();  // changes the instance variable inside the object
	    out.println(test); // calls the toString() method
	    out.println(); // skips a line

	    // add more test cases (see the docs)

      test.setWord("Jim Bob");

      out.println(test); // calls the toString() method

	    test.makeUpper();  // changes the instance variable inside the object
	    out.println(test); // calls the toString() method

	    test.addHyphen();  // changes the instance variable inside the object
	    out.println(test); // calls the toString() method
	    out.println(); // skips a line

      test.setWord("Computer Science");

      out.println(test); // calls the toString() method

	    test.makeUpper();  // changes the instance variable inside the object
	    out.println(test); // calls the toString() method

	    test.addHyphen();  // changes the instance variable inside the object
	    out.println(test); // calls the toString() method
	    out.println(); // skips a line

      test.setWord("UIL TCEA");

      out.println(test); // calls the toString() method

	    test.makeUpper();  // changes the instance variable inside the object
	    out.println(test); // calls the toString() method

	    test.addHyphen();  // changes the instance variable inside the object
	    out.println(test); // calls the toString() method
	    out.println(); // skips a line

      test.setWord("State Champions");
      
      out.println(test); // calls the toString() method

	    test.makeUpper();  // changes the instance variable inside the object
	    out.println(test); // calls the toString() method

	    test.addHyphen();  // changes the instance variable inside the object
	    out.println(test); // calls the toString() method
	    out.println(); // skips a line



	}
}
