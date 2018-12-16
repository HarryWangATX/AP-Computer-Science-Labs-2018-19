//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class ReverseNumber
{
	// instance variable

    // add an initialization constructor
    // it should be marked with the accessor keyword  public
    // it has to have the same name as the class
    // and NO return type (not even void)
    // it will have one parameter that receives the beginning value for
    //    the instance variable number





    // add a set method
    // it should be marked with the accessor keyword  public
	// it should be void, since we are NOT returning a value
    // it will have the same code as the initialization constructor
	// it should be called  setNumber



	// look at DigitAdder.java to see how you get one digit and
	//chop off number
	public static int getReverse(int number)
	{
		String output = "";

    for(int i = 0; i < (number + "").length(); i++)
    {
      output = (number+"").charAt(i) + output;
    }

    return Integer.parseInt(output);
	}


	// *******************************************
	// add  a toString() method
	// look back at other labs to see how to write
	//    a toString() method
	// return number + " reversed is " + ?????();






} // end marker for the class ReverseNumber
