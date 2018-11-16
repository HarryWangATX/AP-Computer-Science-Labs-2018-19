//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringFirstLetterCheck
{
	// instance variables wordOne and wordTwo are declared
	// these variables (aka attributes, properties, data elements, fields, etc.)
	//    hold on to the data (values) permanently
	// ALL methods inside this class have access to these instance variables

	String wordOne, wordTwo;



	// default constructor (no parameters)
	// assign default values ("") to instance variables wordOne and wordTwo
	public StringFirstLetterCheck()
	{
    wordOne = "";
    wordTwo = "";
	}



	// initializer constructor
	// receives beginning values for our instance variables wordOne and wordTwo
	// one and two are created and receive those values
	public StringFirstLetterCheck(String one, String two)
	{
    wordOne = one;
    wordTwo = two;
	} // one and two are destroyed



	// setter or modifier method
	// receives new values for our instance variables wordOne and wordTwo
	// one and two are created and receive those new values
	public void setWords(String one, String two)
	{
    wordOne = one;
    wordTwo = two;
	} // one and two are destroyed



	public boolean checkFirstLetter( )
	{
		// compare the first letters of wordOne and wordTwo
		// DON'T USE variables one and two, they DON'T exist

		// if the first letters are the same, return true, else return false
		// think about the String method  charAt()
		// think about wordOne.charAt(?)
		// think about wordTwo.charAt(?)

    if(wordOne.charAt(0) == wordTwo.charAt(0))
    {
      return true;
    }

		return false;
	}



	public String toString()
	{
		// you will need an if else statement here
		// you can call a method to see if wordOne and wordTwo have the same first letter

    if(checkFirstLetter())
    {
      return wordOne + " DOES HAVE the same first letter as " + wordTwo + "\n";
    }
    else
    {
      return wordOne + " does NOT have the same first letter as " + wordTwo + "\n";
    }

	}
}
