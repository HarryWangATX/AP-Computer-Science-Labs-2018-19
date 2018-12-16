//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.ArrayList;

public class Perfect
{
	// instance variable
    private int number;

    public void setNumber(int a)
    {
      number = a;
    }


    // add an initialization constructor
    // it should be marked with the accessor keyword  public
    // it has to have the same name as the class
    // and NO return type (not even void)
    // it needs to receive the beginning value for
    //    the instance variable number




    // add a set method
    // it should be marked with the accessor keyword  public
	// it should be void, since we are NOT returning a value
    // it needs to receive a new value for
    //    the instance variable number
	// it should be called  setNumber



	public boolean isPerfect()
	{
		// a perfect number has all of its divisors except for itself add up
		//    to itself
		// Examples:  6 is a perfect number since its divisors (1, 2, 3) add up to itself (6)
		//           28 is a perfect number since its divisors (1,2,4,7,14) add up to itself (28)


		// loop through all of the possible divisors except for the
		//    number itself

    int divisorTotal = 0;

    for(int a : getDivisors(number))
    {
      divisorTotal += a;
    }
		// STEP 1:
		// create an int variable called sum and assign it the value 0
		//

		// STEP 2:
		// create an int variable called divisor and assign it the value 1
		//

    if(divisorTotal == number)
    {
      return true;
    }
    return false;
	}

  public ArrayList<Integer> getDivisors( int number )
	{

    ArrayList<Integer> output = new ArrayList<Integer>();
		// loop through all of the possible divisors except for the
		//    number itself

		for(int i = 0; i < number; i++)
    {
      if(number / (i + 0.0) % 1 == 0)
      {
        output.add(i);
      }
    }
		// STEP 1:
		// create an int variable called divisor and assign it the value 1
		//


		// STEP 2:
		// write the while loop condition
		// while the divisor is less than or equal to  number divided by 2
		// while (????  <=  ????)
		{
			// STEP 3:
			// write an if statement
			// if number is divisible by the divisor? (a little mod squad help is in order)
			//     join divisor onto the right hand side of output and join on a space " "
			//     output = output + ??? + " ";


			// STEP 4:
			// add 1 to your divisor so that you can live to divide again (maybe)

		}



		return output;
	}

  public String toString()
  {
    if(isPerfect())
    {
      return number + " is perfect";
    }
    else
    {
      return number + " isn't perfect";
    }
  }

	// add a toString() method
	// you will need an if statement  or  an if else statement
	// return number + " is perfect.";
	// or return number + " is NOT perfect.";




}
