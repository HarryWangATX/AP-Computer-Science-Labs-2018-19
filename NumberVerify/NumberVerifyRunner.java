//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

// Lab Chapter 5 - #2  NumberVerify    2018


public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		// all static methods get loaded into memory right now
		// static methods (and variables) are always available
		// static methods and variables are also called class methods
		//     and class variables

		out.println("Lab Chapter 5 - #2  NumberVerify    2018");
		out.println();
		out.println();
		// fill in your name
		out.println("My name is Neo Wang");
		out.println();


		// create a new Scanner object and pass it System.in
		// this object knows how to read in data from the keyboard
		// variable keyboard holds the location of the Scanner object in memory
		Scanner keyboard = new Scanner(System.in);

		// we now prompt the user to enter a whole number
    for(int i = 0; i < 5; i++)
    {
      out.print("Enter a whole number :: ");

  		// and now we read in the whole number and store it in an int variable
  		int num = keyboard.nextInt();


  		// notice that we do NOT need to create a new NumberVerify object
  		//    since the methods are marked as static
  		// static methods get loaded into memory at the start of the progam
  		// so we can use the name of the class to call the static method
  		//     NumberVerify.isOdd(num)
  		System.out.println(num + " is odd  :: " + NumberVerify.isOdd(num));
  		System.out.println(num + " is even :: " + NumberVerify.isEven(num));

  		// now print a blank line
  		System.out.println();
    }
		
		// add in more test cases




	}
}
