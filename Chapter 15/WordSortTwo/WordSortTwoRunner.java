//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

// Lab Chapter 15 - #6  WordSortTwo  Extra Credit    2019

// Uses files WordSortTwoRunner.java and WordSortTwo.java


public class WordSortTwoRunner
{
	public static void main( String args[] ) throws IOException
	{
		System.out.println("Lab Chapter 15 - #6 (Extra Credit)  WordSortTwo    2019");
		System.out.println();
		System.out.println();

		// ***** fill in your name
		System.out.println("My name is Neo Wang");
		System.out.println();
		System.out.println();



		Scanner file = new Scanner(new File("wordsorttwo.dat"));
		int size = file.nextInt();
		file.nextLine();
		for(int i = 0; i<size; i++)
		{
			String sentence = file.nextLine();

      WordSortTwo test = new WordSortTwo(sentence);
      test.sort();
      System.out.println(test);
			// instantiate a new WordSort
		}
	}
}
