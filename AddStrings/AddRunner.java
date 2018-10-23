//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

// Lab Chapter 4 - #1 - AddStrings    2018


public class AddRunner
{
	public static void main ( String[] args )
	{
		System.out.println("Lab Chapter 4 - #1 - AddStrings    2018");
		System.out.println();
		System.out.println("My name is Neo Wang");
		System.out.println();
		System.out.println();

		// here we create a new AddStrings object and we send the
		// values "hello"  and "world" to the constructor
		// reference variable demo is assigned the memory address (location) of
		//  the AddStrings object

		AddStrings demo = new AddStrings("hello","world");
		demo.add(); // calls the add() method
		out.println(demo); // calls the toString() method

		// calls the setStrings method and passes the
		//    values "jim" and "bob"

		demo.setStrings("jim","bob");
		demo.add();  // calls the add() method
		out.println(demo);  // calls the toString() method

    demo.setStrings("sally","sue");
		demo.add();  // calls the add() method
		out.println(demo);  // calls the toString() method

    demo.setStrings("computer","science");
		demo.add();  // calls the add() method
		out.println(demo);  // calls the toString() method

    demo.setStrings("uil","contests");
		demo.add();  // calls the add() method
		out.println(demo);  // calls the toString() method
		// add more test cases

		// look at the doc file to see the test case values



	}
}
