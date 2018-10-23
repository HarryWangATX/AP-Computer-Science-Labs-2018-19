//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

// Lab Chapter 4 - #1 - AddStrings    2018


public class AddStrings
{
   // instance variables are declared below
   private String first, last;
   private String sum;


   // AddStrings() is a default constructor
   // AddStrings() should assign default values to first, last, and sum

   public AddStrings()
   {
   		// set your instance variables to the empty String ""
   		first = "";
      last = "";
      sum = "";

   		// do the rest here



   }


   // AddStrings() is an initializer constructor
   // AddStrings() should assign values to instance variables first, last
   // parameters one and two are temporary variables that will
   // receive values when the initialization constructor is used
   // one and two will be destroyed when we leave the constructor
   // assign sum the empty string

   public AddStrings(String one, String two)
   {
   		first = one;
      last = two;
   }


   // method setStrings is a modifier method
   // parameters one and two will receive values for first and last
   // one and two will be destroyed at the end of the method

   public void setStrings(String one, String two)
   {
   		first = one;
      last = two;
   }

	// method add() will join together Strings first and last with a " " in between
	// and store the result into variable sum

 	public void add()
 	{
 		sum = first + " " + last;
	}


	// toString() is an accessor method
	// it builds a String through concatenation that will be printed in the runner file
	// there is NO print() or println() in toString()!
 	public String toString()
 	{
 		// joins together the data elements to create a String that looks like:

 		// first :: xxxxx
		// last  :: yyyyy
		// sum   :: xxxxx  yyyyy

		// where xxxxx is the value of the variable first
		//       yyyyy is the value of the variable last
		//       xxxxx yyyyy is the value of the variable sum


 		String output = "first :: " + first + "\n" + "last  :: " + last + "\n" + "output :: " + sum + "\n";

 		return output;
	}
}
