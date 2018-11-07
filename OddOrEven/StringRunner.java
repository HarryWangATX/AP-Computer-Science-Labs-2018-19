//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

// Lab Chapter 5 - #3  StringOddOrEven    2018



public class StringRunner
{
	public static void main ( String[] args )
	{
		out.println("Lab Chapter 5 - #3  StringOddOrEven    2018");
		out.println();
		out.println();
		// fill in your name
		out.println("My name is Neo Wang");
		out.println();


		// create a new Scanner object and pass it System.in
		// this object knows how to read in data from the keyboard
		// variable keyboard holds the location of the Scanner object in memory
		Scanner keyboard = new Scanner(System.in);

    StringOddOrEven obj = new StringOddOrEven();
    String strWord;

		// we now prompt the user to enter a word
		out.print("Enter a word :: ");

		// and now we read in the String and store it in a String variable
		// and NO it is not keyboard.nextString()!
		// there is NO nextString() method NO NO NO NO NO

    for(int i = 0 ; i < 8; i++)
    {
      strWord = keyboard.nextLine();

  		// create a StringOddOrEven object and pass to the constructor the
  		//     value of strWord
  	  obj.setString(strWord);


  		// print out the value of the toString() method
  		out.println(obj.toString());

  		System.out.println(); // print a blank line
    }
		// add more cases
	}
}
