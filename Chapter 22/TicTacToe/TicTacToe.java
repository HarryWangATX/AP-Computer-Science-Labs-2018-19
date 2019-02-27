//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class TicTacToe
{
	private char[][] mat;

	public TicTacToe(String game)
	{
		// instantiate (new it!) a two dimensional array of char (i.e.  mat = ????)

		// next, get the characters out of game
		// mat[0][0] = game.charAt(0);
		// mat[0][1] = game.charAt(1);
		// continue this code to get each char or use loops
		// loops would simplify this process
		// use nested loops with r and c to move through the matrix
		// use a separate variable to move through the String (it's one dimensional)
		// for example mat[r][c] = game.charAt(k);

    mat = new char[3][3];

    mat[0][0] = game.charAt(0);
    mat[0][1] = game.charAt(1);
    mat[0][2] = game.charAt(2);
    mat[1][0] = game.charAt(3);
    mat[1][1] = game.charAt(4);
    mat[1][2] = game.charAt(5);
    mat[2][0] = game.charAt(6);
    mat[2][1] = game.charAt(7);
    mat[2][2] = game.charAt(8);
	}

    // see if ch (X or O) is a winner
    // precondition: row is a valid row, and ch is either an X or O
    // postcondition: returns true if X or O is a winner on row
	public boolean checkRow(int row, char ch)
	{
		if((mat[row][0] == ch)&&(mat[row][1] == ch)&&(mat[row][2] == ch))
    {
      return true;
    }

    return false;
	}

    // see if ch (X or O) is a winner
    // precondition: row is a valid row, and ch is either an X or O
    // postcondition: returns true if X or O is a winner on col
	public boolean checkCol(int col, char ch)
	{
    if((mat[0][col] == ch)&&(mat[1][col] == ch)&&(mat[2][col] == ch))
    {
      return true;
    }
    return false;
	}



    // see if ch (X or O) is a winner
    // precondition: ch is either an X or O
    // postcondition: returns true if X or O is a winner on diagonal 1
	public boolean checkDiagonal1(char ch)
	{
    if((mat[0][0] == ch)&&(mat[1][1] == ch)&&(mat[2][2] == ch))
    {
      return true;
    }
		return false;
	}

    // see if ch (X or O) is a winner
    // precondition: ch is either an X or O
    // postcondition: returns true if X or O is a winner on diagonal 2
	public boolean checkDiagonal2(char ch)
	{
    if((mat[0][2] == ch)&&(mat[1][1] == ch)&&(mat[2][0] == ch))
    {
      return true;
    }
    return false;
	}

	// this method should return the winner
	// Examples:
	// X wins horizontally!  or  Y wins vertically!  or  X wins diagonally!  or  Cat's Game
	public String getWinner()
	{
		// check and see if X wins horizontally
		for (int r=0; r<=2; r++)
    {
			if (checkRow(r,'X'))
      {
				return "X wins horizontally";
      }
      else if(checkRow(r,'O'))
      {
        return "O wins horizontally";
      }
    }
    for (int r=0; r<=2; r++)
    {
			if (checkCol(r,'X'))
      {
				return "X wins vertically";
      }
      else if(checkCol(r,'O'))
      {
        return "O wins vertically";
      }
    }
    for (int r=0; r<=2; r++)
    {
			if (checkDiagonal1('X'))
      {
				return "X wins diagonally";
      }
      else if(checkDiagonal2('O'))
      {
        return "O wins diagonally";
      }
    }

		// check and see if O wins horizontally



		// check and see if X wins vertically


		// check and see if O wins vertically



		// check and see if X wins diagonally



		// check and see if O wins diagonally



		return "Cat's Game";
	}

	// this method should return the game formatted like:
	// X X X
	// O O X
	// X O O

	public String toString()
	{
		String output="";

		// use nested loops to get the output

    for(int i = 0; i < 3; i++)
    {
      for(int j = 0; j < 3; j++)
      {
        output += mat[i][j] + " ";
      }
      output += "\n";
    }


		return output;
	}
}
