//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class CharacterAnalyzer
{
	// instance variable theChar
	private char theChar;


	// default constructor
	public CharacterAnalyzer()
	{
		// assign a default value to theChar (an empty space)
		// i.e. you can say theChar = ' ';
		theChar = 0;
	}


	// initializer constructor
	public CharacterAnalyzer(char ch)
	{
		// assign the incoming value (parameter ch) to theChar
    theChar = ch;
	}


	public void setChar(char ch)
	{
		// assign the incoming value to theChar

		theChar = ch;
	}


	public char getChar()
	{
		return theChar;  // change me (return the value of the instance variable)
	}


	public boolean isUpper( )
	{
		// is theChar an uppercase letter?  If so, return true.  If not, return false.
		// use nested if statements! Read the word doc for a hint.
		if((theChar >= 65)&&(theChar <= 90))
    {
      return true;
    }

		return false;
	}


	public boolean isLower( )
	{
    if((theChar >= 97)&&(theChar <= 123))
    {
      return true;
    }

		return false;
	}


	public boolean isNumber( )
	{
		// is theChar a digit 0, 1, 2, ..., 9
    if((theChar >= 48)&&(theChar <= 58))
    {
      return true;
    }

		return false;
	}


	public int getASCII( )
	{
		return (int)theChar;  // change me!  return theChar as an int
	}


	public String toString()
	{
		//You will need 3 if statements in here
		if(isLower())
    {
      return theChar + " is a lowercase letter. ASCII value == " + getASCII();
    }
    else if (isUpper())
    {
      return theChar + " is an uppercase letter. ASCII value == " + getASCII();
    }
    else if (isNumber())
    {
      return theChar + " is a number. ASCII value == " + getASCII();
    }
    else
    {
      return "Please enter a lowercase, uppercase, or digit character";
    }
	}


}
