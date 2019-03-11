//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//EXTRA CREDIT LAB

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSearch
{

	// sorts the array from small to large and
	// then returns the array
	public static int[] sortArray(int[] numArray)
	{
		// sort the array from small to large
		// Arrays.????(?????)

    Arrays.sort(numArray);


		return numArray; // replace me (return what)

	}




	// finds the next largest number after searchNum
	// in a sorted array
	public static int getNextLargest(int[] numArray, int searchNum)
	{

	//	for (int i=0; i<??????.length; i++)
	//	{
	//		if (?????? < ?????)
	//			return ??????;
	//	}

    for(int i = 0; i < numArray.length; i++)
    {
      if(numArray[i] > searchNum)
      {
        return numArray[i];
      }
    }


		return -1; // If it does not find anything, return -1
	}

}
