//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

// Lab Chapter 17 - #3  LetterBoxes    2019

// Uses files LetterBoxesRunner.java and LetterBoxes.java


public class LetterBoxesRunner
{
	public static void main( String args[] )
	{
		System.out.println("Lab Chapter 17 - #3  LetterBoxes    2019");
		System.out.println();
		System.out.println();

		// ***** fill in your name
		System.out.println("My name is Neo Wang");
		System.out.println();
		System.out.println();



   		Scanner keyboard = new Scanner(System.in);
   		String choice="";

		do{
			out.print("\nEnter the letter for the box :: ");
			char letter = keyboard.next().charAt(0);

			out.print("Enter the size of the box :: ");
 			int size = keyboard.nextInt();

			// call the printLetterBox method
			// it is a static method so call it with TheNameOfTheClass.method

      LetterBoxes.printLetterBox(letter, size);

			System.out.print("\nDo you want to enter more sample input? ");
			choice=keyboard.next();
		} while(choice.equals("Y")||choice.equals("y"));

		System.out.println();
		System.out.println();

	}
}
