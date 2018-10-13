//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class MPHRunner
{
	public static void main( String[] args )
	{
		System.out.println("My name is Neo Wang");
		System.out.println();
		System.out.println("#2 - Miles Per Hour 2018 version");
		System.out.println();
		System.out.println();


		// this creates a Scanner object so that we
		//    can read what the user types in

		Scanner keyboard = new Scanner(in);

		// here we prompt the user to enter the distance
		out.print("Enter the distance :: ");

		// here we read in what the user typed in and
		//    we have the input converted to a 32 bit int
		int dist = keyboard.nextInt();

		out.print("Enter the hours :: ");
		int hrs = keyboard.nextInt();

		out.print("Enter the minutes :: ");
		int mins = keyboard.nextInt();

		// here we create (instantiate) a MilesPerHour object
		//    and we send to the object (via the constructor call)
		//    the input data
		//    The MilesPerHour object will store the values in its
		//    instance variables
		MilesPerHour test = new MilesPerHour(dist, hrs, mins);
		test.calcMPH();
		test.print();


		// add more test cases
		// see your doc for the input data


	}
}
