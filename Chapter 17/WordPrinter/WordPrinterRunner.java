//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

// Lab Chapter 17 - #2  WordPrinter    2019

// Uses files WordPrinterRunner.java and WordPrinter.java


public class WordPrinterRunner
{
	public static void main( String args[] )
	{
		System.out.println("Lab Chapter 17 - #2  WordPrinter    2019");
		System.out.println();
		System.out.println();

		// ***** fill in your name
		System.out.println("My name is Neo Wang");
		System.out.println();
		System.out.println();


   		Scanner keyboard = new Scanner(System.in);
   		String choice="";

		do{
			out.print("\nEnter the word to display :: ");
			String word = keyboard.next();

			out.print("Enter the times to display :: ");
 			int times = keyboard.nextInt();

			// call the printWord method (it is static)
      WordPrinter.printWord(word, times);

			System.out.print("\nDo you want to enter more sample input? ");
			choice=keyboard.next();
		} while(choice.equals("Y")||choice.equals("y"));


		System.out.println();
		System.out.println();



	}
}
