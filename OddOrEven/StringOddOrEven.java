//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringOddOrEven
{
	// the instance variable always holds the data
	// all methods have access to this variable
	// useful String methods:  length()
	private String word;



	// default constructor
	// assigns a default value to word
	public StringOddOrEven()
	{
		// assign to word the empty String ""
		word = "";
	}

	// initialization constructor
	public StringOddOrEven(String s)
	{
		// temporary parameter variable s is created and receives a String from the main progam
		// assign the value of s to the instance variable word

		word = s;
	} // temporary variable s is destroyed


	// this is a modifier method
	public void setString(String s)
	{
		// temporary parameter variable s is created and receives a String from the main progam
		// assign the value of s to the instance variable word

		word = s;

	} // temporary variable s is destroyed


	// this method returns true if the length of the String word is even
	//    otherwise it returns false
 	public boolean isEven()
 	{
 		// if the length of word is even, return true, otherwise return false

 		if(word.length() % 2 == 0)
    {
      return true;
    }
    else
    {
      return false;
    }
	}


 	public String toString()
 	{
 		// the output String should contain the word is even or the word is odd
 		// Example 1: if word has the value "cat"
 		//              the output String should contain "cat is odd"
 		// Example 2: if word has the value "boot"
 		//              the output String should contain "boot is even"
 		// you should call the method isEven() from toString()
 		// Example:  if (isEven())  or you can say   if (isEven()==true)

    String output;

 		if(isEven())
    {
      output = (word + " is even!");
    }
    else
    {
      output = (word + " is odd!");
    }
 		// use if statements to assign a value to output

 		return output;
	}
}
