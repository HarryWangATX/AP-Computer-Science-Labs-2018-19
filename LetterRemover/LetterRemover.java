//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class LetterRemover
{
	// instance variables (attributes, properties, fields)
    private String sentence;
    private char lookFor;


	// default constructor
	public LetterRemover()
	{
    sentence = "";
    lookFor = 0;
		// call the setter method with default values
	}

  public LetterRemover(String s, char rem)
  {
    sentence = s;
		lookFor = rem;
  }



	// add in a second constructor. It will be an initialization constructor
	// it should receive a beginning value for sentence and for lookFor



	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}



	public String removeLetters()
	{
		String cleaned = sentence;


		// look at the String cleaned to see if it contains the lookFor character
		// use the String's  indexOf(lookFor) to find the position of the character
		//    if it exists

		cleaned = sentence.replaceAll(lookFor + "", "");



		return cleaned;
	}



	public String toString()
	{
		return sentence + " - letter to remove " + lookFor;
	}
}
