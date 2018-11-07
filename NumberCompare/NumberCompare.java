//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class NumberCompare
{
	// instance variables one and two are declared
	// these variables (aka attributes, properties, data elements, fields, etc.)
	//    hold onto the data (values) permanently
	// ALL methods inside this class have access to these instance variables

	private int one, two;


	// default constructor (no parameters)
	// assign default values (0) to instance variables one and two
	public NumberCompare()
	{
		one = 0;
    two = 0;
	}

	// initializer constructor
	// receives beginning values for our instance variables one and two
	// n1 and n2 are created and receive values
	public NumberCompare(int n1, int n2)
	{
    one = n1;
    two = n2;

	} // n1 and n2 are destroyed


	// setter or modifier method setNums
	// receives new values for our instance variables one and two
	// n1 and n2 are created and receive new values
	public void setNums(int n1, int n2)
	{
    one = n1;
    two = n2;
	} // n1 and n2 are destroyed


	// returns the largest number
	public int getLargest()
	{
		if(one>two)
    {
      return one;
    }
		else
		{
      return two;
    }
	}


	public int getSmallest()
	{
		// add code here to return the smallest number
		// between instance variables one and two
		// DO NOT USE n1 and n2, they don't exist

		if(one < two)
    {
      return one;
    }
    else
    {
      return two;
    }
	}


	// the toString() method should return one -- two
	// where one and two are the values of your instance variables
	public String toString()
	{
		// this method should return the values of the instance variables
		// in the form of
		// one -- two
		// where one should be replaced with
		// the value of instance variable one and two should be replaced with
		// the value of instance variable two

		// For example:
		// if instance variable one stores the value of 5
		// and instance variable two stores the value of 6
		// you would return the String   5 -- 6

		return getSmallest() + " -- " + getLargest();  // replace the ""
	}
}
