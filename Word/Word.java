//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Word
{
	private String word;



	public Word()
	{
		word = "";
	}



	public Word(String s)
	{
		word = s;
	}



	public void setString(String s)
	{
		word = s;
	}



	// get the first character of word
	public char getFirstChar()
	{
		return 0;
	}



	// get the last character of word
	public char getLastChar()
	{
		return 0;
	}



	public String getBackWards()
	{
		String back="";

		// add a loop to get each character of word and
		// join it (concatenate) onto back
		// back = back + word.charAt(?);

		for(int i = word.length()-1; i >= 0; i--)
		{
			back += word.charAt(i);
		}


		return back;
	}



 	public String toString()
 	{
 		// return the value of your instance variable word
 		return "Original word: " + word + "\n" + "firstLetter: " + word.charAt(0) + "\n" + "lastLetter: " + word.charAt(word.length() - 1) + "\n" + getBackWards(); // replace me
	}
}
