//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordFun
{
	// instance variable word is declared
	// this variable (aka attribute, property, data element, field, etc.)
	//    holds on to the data (value) permanently
	// ALL methods inside this class have access to this instance variable

	private String word;



	// default constructor (no parameters)
	// assign a default value ("") to the instance variable word
	public WordFun()
	{
		word = "";
	}


	// initializer constructor
	// receives a beginning value for our instance variable word
	// w is created and receives a beginning value for instance variable word
	public WordFun(String w)
	{
		word = w;
	}



	// modifier or setter method
	// receives a new value for our instance variable word
	// w is created and receives a new value for instance variable word
	public void setWord(String w)
	{
		word = w;
	}


	// changes the instance variable word so that all characters stored are in upper case
	public void makeUpper()
	{
		word = word.toUpperCase();
	}


	// changes the instance variable word so that the space character is replaced with a -
	public void addHyphen()
	{
		// find the index position of (location) the space character
		// i.e.  find the index Of the space character
		word = word.replaceAll(" ", "-");


		// or you could just call the replace or replaceAll method of the String word

	}



	public String toString()
	{
		// this should return the value of the instance variable
		return word; // change me!!!!!!!!!!!!!  return my instance variable
	}
}
