//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class MorseCode
{
	private char letter;

	public MorseCode()
	{
		letter = 0;
	}

	public MorseCode(char let)
	{
		letter = let;
	}

	public void setChar(char let)
	{
		letter = let;
	}

	public String getMorseCode()
	{
    char[] english = {
      'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
      'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
      'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
      ',', '.', '?' };

    String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
    ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
    "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
    "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
    "-----", "--..--", ".-.-.-", "..--.." };

    int index = 0;

    for(int i = 0; i < english.length; i++)
    {
      if(letter == english[i])
      {
        index = i;
      }
    }

		return morse[index];
	}

	public String toString()
	{
		// this method has been completed for you
		return letter + " is " + getMorseCode() + " in morse!";
	}
}
