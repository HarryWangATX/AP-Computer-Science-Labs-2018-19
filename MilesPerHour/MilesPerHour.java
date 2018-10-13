//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour
{
	// these are our instance variables or properties
	// these permanently store the data inside the object
	private int distance, hours, minutes;
	private double mph;


	// this is a default constructor
	// it assigns default values to our instance variables
	public MilesPerHour()
	{
		setNums(0,0,0); //calling the set method to do the work
		mph=0.0;
	}

	// this is a constructor (it initializes our instance variables)
	public MilesPerHour(int dist, int hrs, int mins)
	{
		// assign values to distance, hours, and minutes
		// you could call setNums(dist, hrs, mins);  or
		// you could say
		// distance = ?;
		// hours = ?;
		// minutes = ?;
    distance = dist;
    hours = hrs;
    minutes = mins;
	}


	// setNums is a modifier method
	// it has 3 parameters:  dist, hrs, and mins which
	// receive values when this method is called
	// The parameters are destroyed when you leave the method
	public void setNums(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;

	} // NOTE: dist, hrs, and mins will be destroyed at this point


	public void calcMPH()
	{
		// calculate the miles per hour
		// remember that d = r * t from your math experience
		// so r = d/t
		// where the r is your rate of speed (mph)


		// since we are finding mph, our time must be in terms of hours
		// hint: you will need a unit conversion in order to calculate time

		double time = (hours + ((double)minutes / 60));    // local variable
    System.out.println(time);
    System.out.println(hours);
    System.out.println(minutes);

		// REMEMBER, you can only use your instance variables and your local variable time
		// there are no variables called d,t and r in this program

		mph = distance / time;

	}

	public void print()
	{
		// use System.out.println to print the results
		// you must use your instance variables
		// NOTE: dist, hrs, and mins do NOT exist in this method

		// notice that the mph must be rounded
		// you should use Math.??? to do this
		// xxx miles in xxx hour and xxx minutes = xxx MPH. (see word doc)

		System.out.println(distance + " miles in " + hours + " hour and " + minutes + " minutes");
    System.out.println("Miles per hour :: " + (int)Math.round(mph));
    System.out.println();


		// now print two blank lines


	}
}
