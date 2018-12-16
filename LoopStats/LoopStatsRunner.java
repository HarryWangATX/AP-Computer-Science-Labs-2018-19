//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

// Lab Chapter 8 - #7  LoopStats    2018

// Uses files LoopStatsRunner.java and LoopStats.java


public class LoopStatsRunner
{
	public static void main ( String[] args )
	{
		out.println("Lab Chapter 8 - #7  LoopStats    2018");
		out.println();
		out.println();

		// ***** fill in your name
		out.println("My name is Neo Wang");
		out.println();
		out.println();



		// STEP 1: **************************************************
		// create a LoopStats object and pass it 1, 5
		//     this will store 1 and 5 inside the object

		// LoopStats obj = ???  ???(1, 5);

		LoopStats test = new LoopStats(1,5);

		// STEP 2: **************************************************
		// print out what the toString() method of obj returns

		// out.println(obj.???());
    System.out.println(test);
    System.out.println("Even :: " + test.getEvenCount());
    System.out.println("Odd :: " + test.getOddCount());
    System.out.println("Total :: " + test.getTotal());
    System.out.println();
    System.out.println();

    test.setNums(2, 8);
    System.out.println(test);
    System.out.println("Even :: " + test.getEvenCount());
    System.out.println("Odd :: " + test.getOddCount());
    System.out.println("Total :: " + test.getTotal());
    System.out.println();
    System.out.println();

    test.setNums(5, 15);
    System.out.println(test);
    System.out.println("Even :: " + test.getEvenCount());
    System.out.println("Odd :: " + test.getOddCount());
    System.out.println("Total :: " + test.getTotal());
    System.out.println();
    System.out.println();

		// STEP 3: **************************************************
		// print out
		// Total  and then the total (the sum of the numbers in the list)
		// call a method of the LoopStats object referenced by obj
		// for the numbers 1 2 3 4 5, the total is 1 + 2 + 3 + 4 + 5
		//    so the total should be 15

		// out.println("Total :  " + obj.???());


		// STEP 4: **************************************************
		// print out
		// "Even count :  "  and then the number of even numbers in the list
		// call a method of the LoopStats object referenced by obj
		// for the numbers 1 2 3 4 5, the even numbers are 2 and 4
		//    so the even count should be 2

		// out.println("Even count : " + obj.???());



		// STEP 5: **************************************************
		// print out
		// Odd count  and then the number of odd numbers in the list
		// call a method of the LoopStats object referenced by obj
		// for the numbers 1 2 3 4 5, the odd numbers are 1, 3 and 5
		//    so the odd count should be 3

		// out.println("Odd count :   " + obj.???());



		// Step 6: **************************************************
		// print two blank lines




		// add test cases




	}
}
