//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

// Lab Chapter 6 - #1  NumberCompare    2018

// Uses files NumberCompareRunner.java and NumberCompare.java

public class NumberCompareRunner
{
	public static void main( String args[] )
	{
		out.println("Lab Chapter 6 - #1  NumberCompare    2018");
		out.println();
		out.println();

		// ***** fill in your name
		out.println("My name is Neo Wang");
		out.println();
		out.println();


		// this creates a new NumberCompare object and sends
		// the values 5 and 6 to the constructor
	    NumberCompare test = new NumberCompare(5,6);

      Scanner keyboard = new Scanner(System.in);

	    out.println(test);  // this calls the toString() method
	    out.println("largest == "+ test.getLargest());
	    out.println("smallest == "+ test.getSmallest()+"\n\n");

      int rart;
      int rart2;

      for(int i = 0; i < 4; i++)
      {
        System.out.print("Number 1 :: ");
        rart = keyboard.nextInt();

        System.out.print("Number 2 :: ");
        rart2 = keyboard.nextInt();

        System.out.println();
        
        test.setNums(rart, rart2);
        out.println(test);
        out.println("largest == "+ test.getLargest());
  	    out.println("smallest == "+ test.getSmallest()+"\n\n");
      }

	    // add more test cases (see the docs for your input values)
	    // call your set method (example: test.set????( #, #);
	    // do NOT make more new objects!




	}
}
