//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

// Lab Chapter 4 - #3 - StringRipper    2018

// uses files  RipperRunner.java  and  StringRipper.java

public class RipperRunner
{
	public static void main ( String[] args )
	{

		System.out.println("Lab Chapter 4 - #3 - StringRipper    2018");
		System.out.println();
		System.out.println("My name is Neo Wang");
		System.out.println();
		System.out.println();

		// here we create a new StringRipper object and we send the
		//    value "chicken" to the constructor
		// variable demo is assigned the memory address (location) of
		//    the StringRipper object so that we can refer to it
		StringRipper demo = new StringRipper("chicken");
		out.println(demo.ripString(3,6)); // calls the ripString() method which returns cke
		out.println(demo);  // calls the toString() method which returns chicken


		demo.setString("alligator");  // calls the setString() method
		out.println(demo.ripString(3,8)); // calls the ripString() method
		out.println(demo);  // calls the toString() method


		demo.setString("COMPUTER SCIENCE IS THE BEST!");
		out.println(demo.ripString(9,12));
		out.println(demo.ripString(0,12));
		out.println(demo.ripString(5,20));
		out.println(demo);


		demo.setString("I like fried chicken and mashed potatoes!");
		out.println(demo.ripString(0,7));
		out.println(demo.ripString(7,15));
		out.println(demo.ripString(15,26));
		out.println(demo.ripString(22,26));
		out.println(demo);
	}
}
