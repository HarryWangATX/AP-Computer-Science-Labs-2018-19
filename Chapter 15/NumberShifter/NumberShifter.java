//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab 2  -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{

	// The method makeLucky7Array(int size)
	// creates an array with size elements and fills it
	// with random numbers from 1 to 10
	// The method then returns it

	// REMEMBER:
	// Math.random() returns a value from 0.0 to 0.99999...

	// So, (int) (Math.random()*6)  returns a value from 0 to 5
	// Substitute the lowest possible value and highest possible value for Math.random()
	// The lowest possible value is 0.0, so (int) (0.0*6) returns 0
	// The highest possible value is 0.99999..., so (int) (0.99999...*6) returns 5


	// (int) (Math.random()*6) + 1 returns a value from 1 to 6
	// The lowest possible value is 0.0, so (int) (0.0*6) + 1  returns 1
	// The highest possible value is 0.99999..., so (int) (0.99999...*6) + 1  returns 6


	public static int[] makeLucky7Array( int size)
	{
		// create the int array with size int variables
		// and fill it with random numbers 1-10
		int[] list = new int[size];


		for (int i =0; i < list.length; i++)
		{
			int x = (int)(Math.random()*10 + 1); // random number 1- to 10
			list[i] = x;
		}



		return list; // change me
	}


  public static String toString(int[] list)
  {
    String output = "";
    for(int a : list)
    {
      output += a + " ";
    }
    return output;
  }


	// copies all of the 7's to the front positions of the array
	// and then returns the array
	public static int [] shiftEm(int[] list)
	{

		// here we will use a slight variation of the selection sort
		// to copy all of the 7's to the front positions of the array

		for (int i=0; i<list.length; i++) // traverse the list
		{
			// each time through the loop we will
			// find a 7 from the remaining list of items
			// and swap it into the ith position
			int posOf7 = i;

			for (int k=i+1; k<list.length; k++)
			{
				if (list[k] == 7)
				{
					posOf7 = k;
					break;
				}

			}

			// now swap the i and posOf7 elements

			int temp = i;          // copy the ith element of list to a temp variable
			list[i] = list[posOf7];    // copy the posOf7 element to the ith position
			list[posOf7] = temp;         // copy the temp element to the posOf7 position

		}


		return list; // change me  (think about what you need to return)

	}
}
