//© A+ Computer Science  -  www.apluscompsci.com - 2019
//Name -
//Date -
//Class -
//Lab  -

import java.lang.System;
import java.lang.Math;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.List;

// HINT:  Look at sample arrays to understand what you need to do in your code.
//		  DRAW PICTURES and walk through what you need to do.
//        If you don't know what needs to be done, you certainly cannot give
//        instructions to the computer to tell it what to do.
//        There are some sample pictures below to help you.


public class ArrayFunHouse
{
	// instance variables and constructors could be used, but are not really needed

	// NOTE: These are static methods and are loaded into RAM memory when your program
	//       first starts up.  They have no access to instance variables.  They are like
	//       an isolated island.  They are not a part of an object, and therefore you
	//       do NOT need an object reference to call them.  You can call them from
	//       another class by using the name of the class as shown below.
	//       ArrayFunHouse.getSum(....)



	// getSum() will return the sum of the numbers from start to stop, including stop
	public static int getSum(int[] numArray, int start, int stop)
	{
		// you will need a temporary local variable to keep track of the sum
		// int sum = ?;
    int sum = 0;

    for(int i = start; i <= stop; i++)
    {
      sum += numArray[i];
    }

		return sum;

		// you will need a for loop to traverse the array
		// from start to stop,  including stop

		// for (int i = ????;  i < ????;  ???)
		// {
				// add to your sum the value of numArray[i]

		// }


	 	// ***************** change me
	}



	// getCount() will return number of times val is present
	public static int getCount(int[] numArray, int val)
	{
		// you will need a temporary local value to keep track of the
		// number of times that you find val in the array
		int count = 0;

    for(int a : numArray)
    {
      if(a == val)
      {
        count++;
      }
    }
    return count;
		// you will need a for loop to traverse the array


			// each time through the loop, you will need to check
			// and see if (numArray[i] == val)
			// and if so, add 1 to your count


	  // ***************** change me
	}



	// *** There is a picture at the end of this class that may
	//     help you understand this problem better.
	public static int[] removeVals(int[] numArray, int val)
	{
		ArrayList<Integer> output = new ArrayList<Integer>();

		for(int a : numArray)
		{
			output.add(a);
		}

		for(int i = 0; i < output.size(); i++)
		{
			if(output.get(i) == val)
			{
				output.remove(i);
			}
		}
		
		int[] actuallyOutput = new int[output.size()];

		for(int i = 0; i < output.size() - 1; i++)
		{
			actuallyOutput[i] = output.get(i);
		}

		return actuallyOutput;
	}
}


// Example 1: Finding the sum of the numbers in numArray. (public static int getSum)
// First array in the main program:  int[] one =  {7, 4, 10, 0, 1, 7, 6, 5, 3, 2, 9, 7};
// You need to look at each element of numArray, so you will need a for loop.
// How would you find the sum of the numbers in this array?
// How do you refer to an array element?  (Possible Answers:  numArray[0]  numArray[i])
// How would you refer to the number of elements in this array? (Answer:  numArray.length)
// How would you keep the sum?  (maybe use an int variable called sum?)

// index i (position)   0      1     2     3      4     5     6     7      8     9      10    11
//                   ------------------------------------------------------------------------------
// numArray -->      |  7  |   4  | 10  |  0   |  1  |  7  |  6  |  5   |  3  |  2   |   9  |  7  |
//                   ------------------------------------------------------------------------------




// Example 2: Finding the number of times val appears in numArray. (public static int getCount)
// First array in the main program:  int[] one =  {7, 4, 10, 0, 1, 7, 6, 5, 3, 2, 9, 7};
// You need to look at each element of numArray, so you will need a for loop.
// How do you refer to an array element?  (Possible Answers:  numArray[0]  numArray[i])
// How would you refer to the number of elements in this array? (Answer:  numArray.length)
// How would you compare numArray[i] to val?  (Answer:  numArray[i] == val)
// How would you keep track of how many times val appears in numArray?
// (Answer: int count = 0;  and then add 1 to count each time you find it in numArray)

// index i (position)   0      1     2     3      4     5     6     7      8     9      10    11
//                   ------------------------------------------------------------------------------
// numArray -->      |  7  |   4  | 10  |  0   |  1  |  7  |  6  |  5   |  3  |  2   |   9  |  7  |
//                   ------------------------------------------------------------------------------






// Example 3: Creating a new array (public static int[] removeVals)
// First array in the main program:  int[] one =  {7, 4, 10, 0, 1, 7, 6, 5, 3, 2, 9, 7};
// We will remove all of the 7's:  (note that there are 3 7's in the array)
// Note that the tempArray's length will need to be  12 - 3
// numArray.length  -  getCount(numArray, val)

// index i (position)   0      1     2     3      4     5     6     7      8     9      10    11
//                   ------------------------------------------------------------------------------
// numArray -->      |  7  |   4  | 10  |  0   |  1  |  7  |  6  |  5   |  3  |  2   |   9  |  7  |
//                   ------------------------------------------------------------------------------


// index k (position)   0      1     2     3      4     5     6     7      8
//                   ----------------------------------------------------------
// tempArray -->     |     |      |     |      |     |     |     |      |     |
//                   ----------------------------------------------------------


// this will copy the element in numArray[i] position to the tempArray[k] position
// to copy   tempArray[k] = numArray[i];
