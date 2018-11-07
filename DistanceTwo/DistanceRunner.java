//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

// Lab Chapter 5 - #5  Distance    2018

// Uses files  DistanceRunner.java and Distance.java

public class DistanceRunner
{
	public static void main( String[] args )
	{

		out.println("Lab Chapter 5 - #5  Distance    2018");
		out.println();
		out.println();
		// fill in your name
		out.println("My name is Neo Wang");
		out.println();

		// create a new Scanner object
		Scanner keyboard = new Scanner(System.in);

		int xOne,yOne,xTwo,yTwo;

		// create a new Distance object (call the default constructor)
		Distance test = new Distance();

    for(int i = 0; i < 4; i++)
    {
      out.print("Enter X1 :: ");
  		xOne = keyboard.nextInt();

  		out.print("Enter Y1 :: ");
  		yOne = keyboard.nextInt();

  		out.print("Enter X2 :: ");
  		xTwo = keyboard.nextInt();

  		out.print("Enter Y2 :: ");
  		yTwo = keyboard.nextInt();

      test.setCoordinates(xOne, yOne, xTwo, yTwo);
  		out.println(test);
    }

		// add more test cases



	}
}
