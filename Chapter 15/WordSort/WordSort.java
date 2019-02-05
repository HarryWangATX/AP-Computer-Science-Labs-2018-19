//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab 1 -

import java.util.Arrays;
import static java.lang.System.*;

public class WordSort
{
	private String[] words;

	public WordSort(String line)
	{
		// this is done for you
	   	setList(line);
	}

	public void setList(String line)
	{
		// this is done for you
		// the split method builds an array (called words) for you
		// with all of the words in the String line
		words = line.split(" ");
	}

	public void sort()
	{
		// you need to sort the words array (alphabetically)
		// we will use the sort method from the Arrays class to help us
		// call Arrays.sort(???) and pass it the name of your array

		Arrays.sort(words);
	}

	public String toString( )
	{
		String output="";

		// first call your sort method to sort the words.

		// loop through all the words and join (concatenate)
		// onto the String variable output the word in the ith position

		// Example 1:
		// word 0 :: 12321
		// word 1 :: ABC
		// word 2 :: abc
		// word 3 :: alexander
		// word 4 :: fred

		sort();

		for(int i = 0; i < words.length; i++)
		{
			output += "word " + i + " :: " + words[i] + "\n";
		}
		// for (????;   ??????;  ???)
		// {
		//      output = output + "word " + ? + " :: " + ????? + "\n";
		// }


		return output+"\n\n";
	}
}
