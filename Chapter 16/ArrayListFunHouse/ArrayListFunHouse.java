//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

// You should make sure that you know the methods that
// belong to the ArrayList class.

// Common Methods:
// (index means the postion or index of the item in the list)
// (object means an object needs to be sent or passed

// get(index)           returns the object at this position
// set(index, object)   replaces the current object with object at index position index (an object must exist)
// add(object)          adds object to the end of the list
// add(index, object)   inserts object at index position index (elements slide to the right one position)
// remove(index)        removes element at index position and all other elements slide left one position
// toString()           returns a String with all of the elements of the list
// clear()              clears out all of the elements (the list will now be empty)
// size()               returns the number of elements in our list

// YOU WILL ALWAYS NEED A REFERENCE VARIABLE.method()
// Example:
// ArrayList <Integer> list = new ArrayList<Integer>();
// list.add(5);   // YOU CANNOT SAY SIMPLY  add(5);

// Looping Reminders:
// ArrayList<Integer> list = ...
//
// for (int i=0; i<list.size(); i++)
// {
//      int x = list.get(i);
//      do whatever here
// }

// OR

// for (int x : list)  // for each loop gets next item from list each time
// {
//      do whatever here with x (you don't get x, they already got it for you)
//      YOU MAY NOT CHANGE THE VALUE OF THE LIST ELEMENTS
//      The for each loop is simply an easy way to look at all of the elements one at a time (traverse the list)
// }




public class ArrayListFunHouse
{


	public static boolean isDivisor(int number, int divisor)
	{
		// we will see if number is divisible by divisor

		// if (???????)    // number is divisible by divisor
		//     return ????;

    if(number % divisor == 0)
    {
      return true;
    }


		return false;
	}


	public static ArrayList<Integer> getListOfFactors(int number)
	{
		// first we create an ArrayList that can hold Integer objects
		// ArrayList<Integer> list = ???  ???????<Integer>();


		// loop through the possible factors of number (not including the number itself)
		// For example, if the number is 50, consider possible factors 1,2,3,4,5,....25
		// for (int divisor = 1; ???? <= ?????/2;   ??????)
		// {
		//     if (isDivisor(number, divisor))  // is number divisible by divisor? Call your helper method
		//          ??????;  // if so, add divisor to your list

    ArrayList<Integer> factors = new ArrayList<Integer>();
		// }

    for(int i = 1; i < number; i++)
    {
      if(isDivisor(number,i))
      {
        factors.add(i);
      }
    }


		return factors;  // replace me (think about what you need to return)
	}


	// the number is composite if it has at least one factor other than 1 and itself
	public static boolean isComposite(int number)
	{
		// loop through all possible factors from 2 to number/2
		// if you find a factor in this range, return true

		if(getListOfFactors(number).size() > 2)
    {
      return true;
    }


		// do this last, it should not be part of your loop
		return false;  // we did not find any factors in the range of 2 to number/2
	}


	// You will modify this list (nums) by removing numbers that are not composite numbers
	// You will not return anything (the method is void)
	public static void keepOnlyCompositeNumbers( List<Integer> nums )
	{
		// YOU MUST USE AN INDEX BASED LOOP (regular for loop), since you may be modifying the list of numbers
		// ALSO, IF YOU REMOVE AN ELEMENT, DO NOT INCREMENT YOUR INDEX

		// for (int i=???;   ??????;    ) // do not increment i here
		// {

		//     if (????????)  // if the number is composite, we keep it and add 1 to i
		//          add 1 to i; Hint: you need to "get" the number out of the list
		//     else
		//          remove this number from the list called nums (don't increment i)
		// }
		for(int i = 0; i < nums.size();)
    {
      if(!isComposite(nums.get(i)))
      {
        nums.remove(i);
      }
      else
      {
        i++;
      }
    }
	}


} // end of class ArrayListFunHouse
