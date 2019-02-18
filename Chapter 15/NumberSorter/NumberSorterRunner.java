//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import static java.lang.System.*;

// Lab Chapter 15 - #3  NumberSorter    2019

// Uses files NumberSorterRunner.java and NumberSorter.java

public class NumberSorterRunner
{
	public static void main(String args[])
	{

		System.out.println("Lab Chapter 15 - #3  NumberSorter    2019");
		System.out.println();
		System.out.println();

		// ***** fill in your name
		System.out.println("My name is Neo Wang");
		System.out.println();
		System.out.println();




		int[] listOfNumbers = {567891, 901912468, 864213507, 898777, 234422};

    System.out.println("List of numbers :: " + Arrays.toString(listOfNumbers));



		for( int number : listOfNumbers ) // gets the next number from the listOfNumbers
		{
			// this gets the array of digits (sorted) from the number
			int[] sortedListOfDigits = NumberSorter.getSortedDigitArray( number );

			// now we loop through the digits
			for( int digit : sortedListOfDigits ) // gets the next digit from the sortedListOfDigits
			{
				System.out.print(digit + " ");
			}
			System.out.println();
		}


	}

}
