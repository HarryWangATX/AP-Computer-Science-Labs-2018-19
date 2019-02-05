//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import static java.lang.System.*;


// Lab Chapter 15 - #1  WordSort    2019

// Uses files WordSortRunner.java and WordSort.java


public class WordSortRunner
{
	public static void main(String args[])
	{
		System.out.println("Lab Chapter 15 - #1  WordSort    2019");
		System.out.println();
		System.out.println();

		// ***** fill in your name
		System.out.println("My name is Neo Wang");
		System.out.println();
		System.out.println();




		// first we create a WordSort object
		// and pass (send) to it the list of words "abc ABC 12321 fred alexander"
		// ??????  myWordSortReference = new ??????("abc ABC 12321 fred alexander");

		WordSort test = new WordSort("abc ABC 12321 fred alexander");
		System.out.println(test);
		test.setList("a zebra friendly acrobatics 435 TONER PRinTeR");
		System.out.println(test);
		test.setList("123 ABC abc 034 dog cat sally sue bob 2a2");
		System.out.println(test);

		test.setList("b x 4 r s y $");
		// now we print the return value of our toString() method
		System.out.println(test);


		// add more test cases
	}
}
