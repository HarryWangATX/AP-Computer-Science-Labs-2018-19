//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Word
{
	private String word;
    private static String vowels = "AEIOUaeiou";   //only one


	public Word(String wrd)
	{
    this.setWord(wrd);
	}



	public void setWord(String wrd)
	{
    word = wrd;
	}



	public int getNumVowels()
	{
		int count=0;

		// count the number of vowels in our word variable
		// loop through our word variable character by character
		//     use the charAt(?) method of our word to get the char
		//     if (vowels.indexOf(?????) >= 0)
		//         add 1 to your count

    for(int i = 0; i < word.length(); i++)
    {
      if(vowels.contains(word.charAt(i) + ""))
      {
        count++;
      }
    }

		return count;
	}



	public int getLength()
	{
		return word.length();  // change me (return the length of our word
	}



	// a toString() method should return our data stored in our instance variable(s)
	public String toString()
	{
	   return word;  // change me  (return our word)
	}
}
