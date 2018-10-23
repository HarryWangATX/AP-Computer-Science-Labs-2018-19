//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

// Lab Chapter 4 - #4 - Name    2018


public class Name
{
	// declaration of instance variable
	private String name;


	// default constructor
	public Name()
	{
		name = "";
	}


	// initializer constructor
	public Name(String s)
	{
		name = s;
	}


	// modifier (setter) method
    public void setName(String s)
    {
    	name = s;
    }


	// return the first name
	// use a combination of substring and indexOf
	public String getFirst()
	{
		return name.substring(0,name.indexOf(" "));
	}


	// return the last name
	// use a combination of substring and indexOf
	public String getLast()
	{
		return name.substring(name.indexOf(" ") + 1,name.length());
	}


	// return the entire name and two new line characters
 	public String toString()
 	{
 		return name + "\n\n";
	}
}
