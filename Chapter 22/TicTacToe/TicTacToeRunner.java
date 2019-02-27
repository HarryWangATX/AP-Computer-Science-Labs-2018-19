//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

// Lab Chapter Matrices - #2  TicTacToe    2019

// Uses files TicTacToeRunner.java && TicTacToe.java && LabTTT.dat

public class TicTacToeRunner
{
	public static void main( String args[] ) throws IOException
	{
		System.out.println("Lab Chapter Matrices - #2  TicTacToe    2019");
		System.out.println();
		System.out.println();

		// FINISH ME
		// ***** fill in your name
		System.out.println("My name is Neo Wang");
		System.out.println();
		System.out.println();


		Scanner file = new Scanner (new File("LabTTT.dat"));

		// we will read in the number of games
		int numberOfGames = file.nextInt();
		file.nextLine();

		// read in one game and determine the winner
		for (int i=1; i<=numberOfGames; i++)
		{
			// read in the game result
			// the first three characters are for row 0, the next three for row 1, etc.
			String game = file.nextLine(); // something like XXXOOXXOO

      TicTacToe obj = new TicTacToe(game);
      System.out.println(obj);
      System.out.println(obj.getWinner());

			// instantiate a new TicTacToe object (new it!)

			// call your toString() method to print out the Tic Tac Toe board

			// call your getWinner() method and print it

			System.out.println();
			System.out.println();

		}






	}
}
