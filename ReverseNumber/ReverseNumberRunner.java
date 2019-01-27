//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

// Lab Chapter 9 - #5  Reverse Number    2018

// Uses files ReverseNumberRunner.java and ReverseNumber.java


public class ReverseNumberRunner
{
	public static void main( String args[] )
	{
		out.println("Lab Chapter 9 - #5  ReverseNumber    2018");
		out.println();
		out.println();

		// ***** fill in your name
		out.println("My name is Neo Wang");
		out.println();
		out.println();


		// STEP 1: **************************************************
		// the methods inside the ReverseNumber class are NOT static
		//    therefore, you will need to create a ReverseNumber object

		// ReverseNumber obj = ???  ??????(234);

    ReverseNumber test = new ReverseNumber(234);
    System.out.println(test);
    test.setNumber(10000);
    System.out.println(test);
    test.setNumber(111);
    System.out.println(test);
    test.setNumber(9005);
    System.out.println(test);
    test.setNumber(84645);
    System.out.println(test);
    test.setNumber(8547);
    System.out.println(test);
    test.setNumber(123456789);
    System.out.println(test);

		// STEP 2: **************************************************
		// call your object's toString() method and print it

		// out.println(???.toString());



		// STEP 3: **************************************************
		// skip a line




		// add more test cases
		// DO NOT CREATE MORE OBJECTS
		// Call your setNumber method to change the number inside
		//    your ReverseNumber object


	}
}
