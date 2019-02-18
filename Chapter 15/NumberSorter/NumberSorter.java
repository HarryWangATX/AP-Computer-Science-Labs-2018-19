//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  3-

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter
{
	// instance variables and other methods not needed


	// loop through the number using / to cut the number
	// Example:
	//    735  (before the loop count = 0)

	//    First time through the loop
	//    735 / 10 = 73  and we add 1 to count (number = 73, count = 1)

	//    Second time through the loop
	//    73 / 10 = 7  and we add 1 to count (number = 7, count = 2)

	//    Third time through the loop
	//    7 / 10 = 0  and we add 1 to count (number = 0, count = 3)


	private static int getNumDigits(int number)  // you did this in chapter 9 labs
	{
		int count = 0;

		// loop while number > 0
		//    use / to cut the number down (removing the digit)
		//    add 1 to count
    number = number/1;

    while(number > 0)
    {
      number = number / 10;
      count++;
    }



		return count;
	}



	public static int[] getSortedDigitArray(int number)
	{
		int size = getNumDigits(number); // call getNumDigits to get the number of digits
		int[] sorted = new int[size]; // create the array with size positions

		// This loop fills the array with digits
		// loop while number > 0
		//    each time through the loop use % to get the digit. see how you did this in chapter 9 labs
		//    and put the digit in the ith position of the array
		//    then use / to cut the number down (removing the digit)
		//    dont forget to increment i

    int i = 0;

    while ((number > 0)&&(i < size)) {
        sorted[i] = number % 10;
        number = number / 10;
        i++;
    }

		// now sort the array named sorted
		// DO NOT USE ARRAYS.SORT()
		// ******Use the SELECTION SORT code as found in the power point Lesson 15
		// you do not need the heading of the selection sort method
		// you do not need to declare i as an int because it is alreay done for you (see code above)

    Arrays.sort(sorted);

		// return the sorted array
		return sorted;
	}
}
