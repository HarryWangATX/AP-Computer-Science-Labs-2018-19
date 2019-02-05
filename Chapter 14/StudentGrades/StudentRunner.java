//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.*;

// Lab Chapter 14 - #7  Student    2019

// Uses files StudentRunner.java and Student.java

// HINT:  Look at sample arrays to understand what you need to do in your code.
//		  DRAW PICTURES and walk through what you need to do.
//        If you don't know what needs to be done, you certainly cannot give
//        instructions to the computer to tell it what to do.


public class StudentRunner
{
	public static void main(String args[])
	{
		System.out.println("Lab Chapter 14 - #7  Student    2019");
		System.out.println();
		System.out.println();

		// ***** fill in your name here ************************************
		// String x = "????????  ????????????????";

    String x = "Neo Wang";

		System.out.println("My name is " + verifyName(x));
		System.out.println();
		System.out.println();


		// create a Student object
		Student studentObject = new Student("Tom", new int[] {72, 85, 63, 77, 54, 42});


		if (isOk(x))
		{
			// call the toString() method of the object and print the results
			System.out.println(studentObject);
		}

		System.out.println();
		System.out.println();



		// create a Student object
		studentObject = new Student("Sue", new int[] {88, 98, 95, 96, 94, 100});


		if (isOk(x))
		{
			// call the toString() method of the object and print the results
			System.out.println(studentObject);
		}

		System.out.println();
		System.out.println();



	}


























































	public static boolean isOk(String name)
	{
		if (name.equals("????????  ????????????????"))
		{
			return false;
		}

		return true;
	}


	public static String verifyName(String name)
	{
		if (name.equals("????????  ????????????????"))
		{
			String output = "\n";

			for (int i=1; i<=100; i++)
				output += "I DID NOT PUT MY NAME ON THE OUTPUT. OH NO!!!!!!!!!!!!!!!   NO GRADE!\n";

			return output;
		}

		return name;
	}

}
