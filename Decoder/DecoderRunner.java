//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

// Lab Chapter 7 - #3  Decoder    2018

// Uses files DecoderRunner.java and Decoder.java

// HINT:  Look back at previous programs that you have
//        written to help you.
//        Draw a picture of your Decoder object.
//        Look at your doc file to see the correct output.

public class DecoderRunner
{
	public static void main( String args[] )
	{
		out.println("Lab Chapter 7 - #3  Decoder    2018");
		out.println();
		out.println();

		// ***** fill in your name
		out.println("My name is Neo Wang");
		out.println();
		out.println();


		// Step 1:
		// Instantiate a Scanner object
		// make sure that variable keyboard refers to a Scanner object
		// Look at labs from Lesson 5 for review of Scanner and input
		Scanner keyboard = new Scanner(System.in);


		// Step 2:
		// prompt the user to enter a letter
		// look at the doc file for an example



		// Step 3:
		// read in the letter (character) that the user enters and store it
		// in variable letter (a char variable)
		//    What method in the Scanner object reads
		//    in the entire line? (And no it is NOT nextString();

    char letter;

		// Step 4:
		// create a new Decoder object and send (pass)
		// the value of letter to the constructor
		//    make sure that your reference variable
		//    refers to a Decoder object
		// this will store the letter inside your object
		// draw a picture of your object to help you understand
	  Decoder test = new Decoder();


		// Step 5:
		// use out.println(...) to print out the results
		//    you will need to call your Decoder object's toString() method
		// look at your doc file to see the correct output
    for(int i = 0; i < 8; i++)
    {
      System.out.print("Enter a letter :: ");
      letter = keyboard.nextLine().charAt(0);
      test.setLetter(letter);
  		System.out.println(test);


  		// Step 6: print a blank line
  		System.out.println();
    }


		// add more test cases
		// make sure that your above code works before
		//     adding more test cases













	}
}
