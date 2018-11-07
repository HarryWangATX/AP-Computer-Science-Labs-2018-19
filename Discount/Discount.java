//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class Discount
{
	// Do not type code here. These are just notes. The code goes inside the method!

	// instance variables and constructors could be used, but are not really needed

	// getDiscountedBill() will return the final amount of the bill
	//			if the bill is > 1000, the bill receives a 15% discount

	// notice that this method is static
	// this means that the method has no access to instance variables or other
	//     object methods


	public static double getDiscountedBill(double bill)
	{
		// The parameter variable   bill   (a temporary variable)
		// will receive the amount of the original bill from the main program
		// There are two possible return values (the bill or the discounted bill)
		if(bill < 1000)
    {
      return bill;
    }
		else
    {
      return bill*.85;
    }
	}

}
