//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

// Lab Chapter 7 - #1  Grade    2018

// Uses files GradeCheck.java and Grade.java

// HINT:  Look back at previous programs that you have
//        written to help you.
//        Draw a picture of your Grade object.
//        Look at your doc file to see the correct output.

public class GradeCheck
{
	public static void main( String args[] )
	{
		out.println("Lab Chapter 7 - #1  Grade    2018");
		out.println();
		out.println();

		// ***** fill in your name
		out.println("My name is Neo Wang");
		out.println();
		out.println();


		// Step 1:
		// Instantiate a Scanner object. Look at labs from Lesson 5 for help
		// make sure that variable keyboard refers to a Scanner object
		Scanner keyboard = new Scanner(System.in);
    int grade;

		Grade test = new Grade();
		// Step 2:
		// prompt the user to enter a numerical grade
    for(int i = 0; i < 8; i++)
    {
      System.out.print("Enter a NUMERICAL grade :: ");


  		// Step 3:
  		// read in the grade that the user enters and store it
  		//    in an int variable called grade
  		// you will need to call one of the next methods in
  		//    the Scanner object and have it return the value
  		//    that was typed in by the user as an int
      grade = keyboard.nextInt();

  		// Step 4:
  		// Instantiate a new Grade object and send
  		// the value of grade (your input) to the constructor
  		//    make sure that your reference variable
  		//    refers to a Grade object

  		test.setGrade(grade);
  		// Step 5:
  		// use out.println(...) to print out the results
  		//    you will need to call your Grade object's toString() method
  		System.out.println(test);


  		// Step 6: print a blank line
  		// out.?????????
  		System.out.println();
    }




		// add more test cases
		// make sure that your above code works before
		//     adding more test cases



	}
}
