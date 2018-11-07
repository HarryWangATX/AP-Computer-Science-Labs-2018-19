//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

// Lab Chapter 5 - #1  Discount    2018


public class DiscountRunner
{
	public static void main( String args[] )
	{
		// This program teaches you about calling a static method.
		// all static methods get loaded into memory right now
		// static methods (and variables) are always available
		// static methods and variables are also called class methods
		//     and class variables

		out.println("Lab Chapter 5 - #1  Discount    2018");
		out.println();
		out.println();
		// fill in your name
		out.println("My name is Neo Wang");
		out.println();

		// create a new Scanner object and pass it System.in
		// this object knows how to read in data from the keyboard
		// variable keyboard holds the location of the Scanner object in memory
		// see chapter 3 labs for review of how to use Scanner
		Scanner keyboard = new Scanner(System.in);

		// we now prompt the user to enter the original amount of the bill
    for(int i = 0; i < 5; i++)
    {
      out.print("Enter the original bill amount :: ");
  		// and now we read in the bill amount and store it in the double variable originalBill
  		double originalBill = keyboard.nextDouble();

  		// Now you will find the discounted bill amount
  		// by calling getDiscountedBill and passing it the originalBill
  		// note that the method	getDiscountedBill is static and therefore
  		// has already been loaded into memory
  		// thus you do NOT need to create a Discount object
  		// simply use the name of the class  - dot- the name of the method -->  Discount.getDiscountedBill()
  		double discountedBill = Discount.getDiscountedBill(originalBill);

  		// now print out the amount of the discounted bill
  		out.println("Bill after discount :: " + discountedBill);

  		out.println(); // prints a blank line (skips down a line)
    }


		// add more test cases (see the doc file)



	}
}
