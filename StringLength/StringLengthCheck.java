//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringLengthCheck
{
	// instance variables wordOne and wordTwo are declared
	// these variables (aka attributes, properties, data elements, fields, etc.)
	//    hold onto the data (values) permanently
	// ALL methods inside this class have access to these instance variables

	String wordOne, wordTwo;



	// default constructor (no parameters)
	// assign default values ("") to instance variables wordOne and wordTwo
	public StringLengthCheck()
	{
		wordOne = "";
    wordTwo = "";
	}


	// initializer constructor
	// receives beginning values for our instance variables wordOne and wordTwo
	// one and two are created and receive those values
	public StringLengthCheck(String one, String two)
	{
    wordOne = one;
    wordTwo = two;
	}


	// setter or modifier method
	// receives new values for our instance variables wordOne and wordTwo
	// one and two are created and receive those new values
	public void setWords(String one, String two)
	{
    wordOne = one;
    wordTwo = two;
	}


	public boolean checkLength( )
	{
		// compare the length of wordOne and wordTwo
		// DON'T USE variables one and two, they DON'T exist

		// if the lengths are the same, return true, else return false

    if(wordOne.length() == wordTwo.length())
    {
      return true;
    }

		return false;
	}


	public String toString()
	{
		// you will need an if else statement here
		// you can call a method to see if wordOne and wordTwo have the same length

    if(checkLength())
    {
      return wordOne + " HAS the same # of letters as " + wordTwo + "\n";
    }
		return wordOne + " does NOT have the same # of letters as " + wordTwo + "\n";
	}

}
