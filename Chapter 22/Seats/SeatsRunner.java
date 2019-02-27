
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

// Lab Chapter 22 - Matrices - #1  Seats    2019

// Uses files SeatsRunner.java && Seats.java && Seats.txt


public class SeatsRunner
{
	public static void main( String args[] ) throws IOException
	{
		System.out.println("Lab Chapter Matrices - #1  Seats    2019");
		System.out.println();
		System.out.println();

		// FINISH ME
		// ***** fill in your name
		System.out.println("My name is Neo Wang");
		System.out.println();
		System.out.println();

		// this has been done for you
		Seats seats = new Seats();
		System.out.println( seats.toString());
		System.out.println("\nEmpty Seats: " + seats.countEmptySeats());
		System.out.println("\nEmpty Seats on Row 0: " + seats.countEmptySeats(0));
		System.out.println("\nEmpty Seats on Row 4: " + seats.countEmptySeats(4));
		System.out.println("\nOccupied Seats: " + seats.countOccupiedSeats());
		System.out.println("\nOccupied Seats Row 0: " + seats.countOccupiedSeats(0));
		System.out.println("\nOccupied Seats Row 4: " + seats.countOccupiedSeats(4));
		System.out.println("\nIs seats[0][5] in bounds? " + seats.inBounds(0,5));
		System.out.println("\nIs seats[0][4] in bounds? " + seats.inBounds(0,4));
		System.out.println();
		System.out.println();
	}
}
