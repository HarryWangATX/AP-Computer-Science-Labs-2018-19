//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

// Lab Chapter 4 - #2 - FirstAndLast    2018

public class FirstAndLast
{
	// instance variables (aka data elements, fields, attributes, properties)
	private String word;
	private char firstLetter;
	private char lastLetter;


	// default constructor
	public FirstAndLast()
	{
		// assign default values to the instance variables
    word = "";
    firstLetter = 0;
    lastLetter = 0;
	}


	// initialization constructor
	// variable s receives a value that will be assigned to word
	//     s will be destroyed at the end of the constructor
	public FirstAndLast(String s)
	{
    word = s;

	}


	// modifier (setter) method setString()
	// variable s receives a value to put into (assign to) word
	//     s will be destroyed at the end of the method
	public void setString(String s)
	{
    word = s;

	}

	public void findFirstLastLetters()
	{
		// assign the 1st letter of word to the variable firstLetter
		// firstLetter = ?

    firstLetter = word.charAt(0);
    lastLetter = word.charAt(word.length()-1);


		// assign the last letter of word to the variable lastLetter
		// lastLetter = ?

	}


 	public String toString()
 	{
 		// joins together the data elements to create a String that looks like:

 		// word         :: xxxxx
		// first letter :: y
		// last letter  :: z

		// where xxxxx is the value of the variable word
		//       y     is the value of the variable firstLetter
		//       z     is the value of the variable lastLetter


 		String output;  // declares a variable to hold our output

 		output = "word :: " + word + "\n" + "first letter :: " + firstLetter + "\n" + "last letter :: " + lastLetter + "\n";  // finish the code

 		return output;  // here we return the String that we built
	}

}
