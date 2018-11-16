//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

// Lab Chapter 6 - #3  WordsCompare    2018

// Uses files WordsCompareRunner.java and WordsCompare.java


public class WordCompareRunner
{
   public static void main( String args[] )
   {
		out.println("Lab Chapter 6 - #3  WordsCompare    2018");
		out.println();
		out.println();

		// ***** fill in your name
		out.println("My name is Neo Wang");
		out.println();
		out.println();

		// this should create a new WordsCompare object and sends
		// the values "abe" and "ape" to the constructor
		// these values will be stored inside the object
	    WordCompare test = new WordCompare("abe", "ape");

	    out.println(test);  // this calls the toString() method
	    out.println();

      test.setWords("giraffe", "gorilla");
      out.println(test);  // this calls the toString() method
	    out.println();

      test.setWords("one", "two");
      out.println(test);  // this calls the toString() method
	    out.println();

      test.setWords("fun", "funny");
      out.println(test);  // this calls the toString() method
	    out.println();

      test.setWords("123", "19");
      out.println(test);  // this calls the toString() method
	    out.println();

      test.setWords("193", "1910");
      out.println(test);  // this calls the toString() method
	    out.println();

      test.setWords("goofy", "godfather");
      out.println(test);  // this calls the toString() method
	    out.println();

      test.setWords("funnel", "fun");
      out.println(test);  // this calls the toString() method
	    out.println();

		// add more test cases (see the docs)
		// call your set method



   }
}
