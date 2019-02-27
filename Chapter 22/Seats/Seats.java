
import java.util.Scanner;
import static java.lang.System.*;
import java.io.*;

public class Seats
{
	private int[][] seats;

	/*
	 *this constructor loads in the seat information
	 * a 0 indicates an empty seat
	 * a 1 indicates a filled seat
	 */
	public Seats()
	{
		// this has been done for you
		// if there is an error in the try block {...}
		// it will jump to the catch statement so that
		// our program will not crash
		try
		{
			Scanner file = new Scanner(new File("Seats.txt"));

			int rows = file.nextInt();
			int cols = file.nextInt();

			seats = new int[rows][cols];

			for (int r=0; r<rows; r++)
			{
				for (int c=0; c<cols; c++)
				{
					seats[r][c] = file.nextInt();
				}
			}
			}
		catch (Exception e)
		{
			System.out.println("Error reading in data");
		}
	}

	/*
		this will count the number of empty seats
	*/
	public int countEmptySeats()
	{
    int count = 0;

    for(int[] a : seats)
    {
      for(int b : a)
      {
        if(b == 0)
        {
          count++;
        }
      }
    }

		return count;
	}



	/*
		this will count the number of empty seats on row row
	*/
	public int countEmptySeats(int row)
	{
    int count = 0;

    for(int i = 0; i < seats[row].length; i++)
    {
      if(seats[row][i] == 0)
      {
        count++;
      }
    }

		return count;
	}



	/*
	 * this method counts the number of occupied seats
	*/
	public int countOccupiedSeats()
	{
    int count = 0;

    for(int[] a : seats)
    {
      for(int b : a)
      {
        if(b == 1)
        {
          count++;
        }
      }
    }

		return count;
	}


	/*
	 * this method counts the number of occupied seats on row row
	*/
	public int countOccupiedSeats(int row)
	{
    int count = 0;

    for(int i = 0; i < seats[row].length; i++)
    {
      if(seats[row][i] == 1)
      {
        count++;
      }
    }

		return count;
	}


	/*
	 *check r and c to ensure they are inside the grid
	 * r must be >= 0 and < the number of rows
	 * c must be >= 0 and < the number of columns
	 */
	public boolean inBounds( int r, int c)
	{
		if((r < seats.length && c < seats[r].length)&&(r >= 0 && c >= 0))
    {
      return true;
    }
    return false;
	}



	/*
	 *return the seats grid as a string
	 */
	public String toString()
	{
		String output="";

    for(int i = 0; i < seats.length; i++)
    {
      for(int j = 0; j < seats[0].length; j++)
      {
        output += (seats[i][j]) + " ";
      }
      output += "\n";
    }

		// FINISH ME
		// you will need nested loops
		// attach each value of the grid plus a space
		// your output should look like:
		// 0 1 0 0 1
		// 0 0 0 0 0
		// 1 1 0 0 0
		// 1 1 1 1 1
		// 1 1 1 1 1

		 //for (int r=0; ....; ...) // outer loop for row
		//{
		    // for (int c=0; ....; ...)
	     //{


		    // }
		    // output += "\n";
		// }

		return output;
	}
}
