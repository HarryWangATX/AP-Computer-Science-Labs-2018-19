//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

// Lab Chapter 8 - #8  Factorial    2018

// Uses files FactorialRunner.java and Factorial.java


public class FactorialRunner
{
	public static void main ( String[] args )
	{
		out.println("Lab Chapter 8 - #8  Factorial    2018");
		out.println();
		out.println();

		// ***** fill in your name
		out.println("My name is Neo Wang");
		out.println();
		out.println();

		// STEP 1: **************************************************
		// create a Factorial object and pass it 5
		//     this will store 5 inside the object

		// Factorial obj = ???  ???(5);

    Factorial test = new Factorial(5);

		// STEP 2: **************************************************
		// print out what the toString() method of obj returns

		// out.println(obj.???());

    System.out.println(test);

    test.setNum(4);
    System.out.println(test);
    test.setNum(8);
    System.out.println(test);
    test.setNum(15);
    System.out.println(test);
    test.setNum(6);
    System.out.println(test);
    test.setNum(9);
    System.out.println(test);
    test.setNum(3);
    System.out.println(test);



		// add more cases



	}
}
