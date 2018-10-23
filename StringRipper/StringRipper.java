//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

// Lab Chapter 4 - #3 - StringRipper    2018


public class StringRipper
{
	// declaration of instance variable
	private String word;


	// default constructor
	// assign to word the default value of ""
	public StringRipper()
	{
		word = "";
	}


	// initialization constructor
	//    temporary parameter s is created
	//        and receives a value from the calling location
	//    instance variable word should receive the value of s
	//    variable s is destroyed at the end of the method
	public StringRipper(String s)
	{
		word = s;
	}

	// modifier (setter) method
	//    temporary parameter s is created
	//        and receives a value from the caller
	//    instance variable word should receive the value of s
	//    variable s is destroyed at the end of the method
    public void setString(String s)
    {
    	word = s;
    }

	// method ripString receives the starting position
	//    of where to start (x) and the stopping position (y)
	public String ripString(int x, int y)
	{
		// call the word's substring method with a starting value
		//     of x and a stopping value of y
		//     and return it

		return word.substring(x, y);  // replace the "";  with  word.????????(x,y);
	}

	// method toString()
 	public String toString()
 	{
 		// you should return the value of the instance variable word
 		// and two new line characters
 		return word + "\n\n";
	}
}
