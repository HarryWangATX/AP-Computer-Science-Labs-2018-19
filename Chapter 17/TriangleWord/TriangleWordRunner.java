//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

// Lab Chapter 17 - #4  TriangleWord    2019

// Uses files TriangleWordRunner.java and TriangleWord.java


public class TriangleWordRunner
{
	public static void main( String args[] )
	{
		System.out.println("Lab Chapter 17 - #4  TriangleWord    2019");
		System.out.println();
		System.out.println();

		// ***** fill in your name
		System.out.println("My name is Neo Wang");
		System.out.println();
		System.out.println();

   		Scanner keyboard = new Scanner(System.in);
   		String choice="";

		do{
			out.print("\nEnter a word :: ");
			String word = keyboard.next();

      TriangleWord.printTriangle(word);

			// call the static method printTriangle and
			//    send it (pass it) the word
			// you call a static method by TheNameOfTheClass.method


			System.out.print("\n\nDo you want to enter more sample input? ");
			choice=keyboard.next();
		} while(choice.equals("Y")||choice.equals("y"));


		System.out.println();
		System.out.println();



	}
}
