//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - EXTRA CREDIT 2018

import static java.lang.System.*;

public class StringChecker
{
	private String word;

	public StringChecker()
	{
    word = "";
	}

	public StringChecker(String s)
	{
		word = s;
	}

   public void setString(String s)
   {
   	word = s;
   }

	public boolean findLetter(char c) // false is just a placeholder. Change it!
	{
		if(word.indexOf(c) == -1)
    {
      return false;
    }
    else
    {
      return true;
    }
	}

	public boolean findSubString(String s) // false is just a placeholder. Change it!
	{
		if(word.indexOf(s) == -1)
    {
      return false;
    }
    else
    {
      return true;
    }
	}

 	public String toString()
 	{
 		return word + "\n\n";
	}
}
