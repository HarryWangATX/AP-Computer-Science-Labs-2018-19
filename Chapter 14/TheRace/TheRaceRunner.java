//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

// Lab Chapter 14 - #4  TheRace    2019 - EXTRA CREDIT LAB

// Uses files TheRaceRunner.java and TheRace.java

// HINT:  Look at sample arrays to understand what you need to do in your code.
//		  DRAW PICTURES and walk through what you need to do.
//        If you don't know what needs to be done, you certainly cannot give
//        instructions to the computer to tell it what to do.


public class TheRaceRunner
{
	public static void main( String args[] )
	{
		System.out.println("Lab Chapter 14 - #4  TheRace    2019 EXTRA CREDIT");
		System.out.println();
		System.out.println();

		// ***** fill in your name
		System.out.println("My name is Neo Wang");
		System.out.println();
		System.out.println();


		// create the TheRace object
		// TheRace  r = ???   ??????;


		// call the toString() method of the object and print it
		// System.out.println( ? );  // print the track

    TheRace race = new TheRace();


		while( race.play() )
		{
			// call the toString() method of the object and print it
			// System.out.println( ? );

      System.out.println(race);
		}

    System.out.println(race.getWinner());



		// call the toString() method of the object and print it
		// System.out.println( ? ); // print the final positions


		// System.out.println( r.???????? ); // print out the winner

	}
}
