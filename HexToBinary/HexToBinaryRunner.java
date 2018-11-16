//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

// Lab Chapter 7 - #2  HexToBinary    2018

// Uses files HexToBinaryRunner.java and HexToBinary.java

// HINT:  Look back at previous programs that you have
//        written to help you.
//        Draw a picture of your HexToBinary object.
//        Look at your doc file to see the correct output.


public class HexToBinaryRunner
{
	public static void main( String args[] )
	{
		out.println("Lab Chapter 7 - #2  HexToBinary    2018");
		out.println();
		out.println();

		// ***** fill in your name
		out.println("My name is Neo Wang");
		out.println();
		out.println();


		// Step 1:
		// Construct a Scanner object to read in the hex character
		// make sure that variable keyboard refers to a Scanner object
		Scanner keyboard = new Scanner(System.in);


		// Step 2:
		// prompt the user to enter a hex character
		// look at the doc file for an example



		// Step 3:
		// read in the hex character that the user enters and store it
		// look back at the CharacterAnalyzerRunner in Labs 5 for an example
		int hexChar;



		// Step 4:
		// Construct a new HexToBinary object and send
		// the value of hexChar (your input) to the constructor
		//    make sure that your reference variable
		//    refers to a HexToBinary object
	  HexToBinary obj = new HexToBinary();


		// Step 5:
		// use out.println(...) to print out the results
		//    you will need to call your HexToBinary object's toString() method
		// look at your doc file to see the correct output
    for(int i = 0; i < 7; i++)
    {
      out.print("Enter a letter :: ");
      hexChar = keyboard.nextLine().charAt(0);
      obj.setHex((char)hexChar);
      System.out.println(obj);
      System.out.println();
    }



		// add more test cases
		// make sure that your above code works before
		//     adding more test cases
		// Do not make a new object
		// call your set method to reset the instance variables




	}
}
