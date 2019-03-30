//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

class Rational implements Comparable<Rational>
{
	// add two instance variables
	// call the variables
	// numerator and denominator  (type int and make them private)

	private int numerator;
  private int denominator;



	// write an initialization constructor
	// it should receive values for the numerator and denominator
	// and it should reduce the fraction by calling the reduce() method
	// REMEMBER:
	// a constructor has NO return type (NOT EVEN void)
	// it has the SAME NAME AS THE CLASS


	public Rational(int num, int den)
  {
    numerator = num;
    denominator = den;
  }



	// write a setRational method
	public void setRational(int num, int den)
	{
		// store the input values into the instance variables

    numerator = num;
    denominator = den;
	}




	// write  a setter method for numerator and a setter method for denominator
	// a setter method needs to have an input parameter to receive a value to store in an instance variable
	// they should always be void, since they do NOT return any data, they only receive data
	// public void setNumerator(int num)

  public void setNumerator(int num)
  {
    numerator = num;
  }


	public Rational add(Rational  other)
	{
		// This is what you are trying to accomplish:
		// numerator/denominator  +  other.numerator/other.denominator

		// These are the formulas to use:
		//     num = numerator * other.denominator + other.numerator * denominator
		//     den = denominator * other.denominator

		// int num = ?;
		// int den = ?;

		// Rational result = new ?????;


Rational output = new Rational(numerator * other.getDenominator() + denominator * other.getNumerator(), denominator * other.getDenominator());
output.reduce();
		return output; // replace me (what are we supposed to return?)
	}



	private void reduce()
	{
		// to reduce you will need to find the greatest common divisor
		// Example:  8/12  the gcd is 4  (so we could try dividing by 8, 7, 6, 5, 4)
		int gcd = gcd(numerator,denominator); // replace the 1 by calling the gcd() method below and send it your numerator and denominator





		// then we can divide the gcd into both the numerator and denominator to reduce our fraction

		numerator = numerator / gcd;
		denominator = denominator / gcd;
	}



  public int gcd(int a, int b) {
   if (b==0) return a;
   return gcd(b,a%b);
}



	public Rational clone ()
	{
		// to make a clone of ourself, we will need to make a
		// new Rational object that looks just like us
		// i.e. with the same numerator and denominator
		// Rational clone = new Rational(?, ?);

		return new Rational(numerator,denominator);  // replace me
	}



	// ACCESSORS

	// write getter methods for numerator and denominator
	// getter methods get something for the caller
	// and thus must have a return type (THEY ARE NEVER VOID)
	// they do not have any input parameters


	// getNumerator() should return the numerator
	public int getNumerator()
	{
		return numerator;  // replace me ?????
	}
  public int getDenominator()
  {
    return denominator;  // replace me ?????
  }


	// getDenominator() should return the denominator



	// we are overriding (replacing) the equals method in the Object class
	public boolean equals( Object obj)
	{
		Rational other = (Rational) obj;  // we convert the reference to a Rational pointer (reference)

		// we will be considered equal if
		// my numerator == the other numerator (i.e. if  (numerator == other.numerator)   )
		// and (&&) my denominator == the other denominator

    if(numerator == other.getNumerator() && denominator == other.getDenominator())
    {
      return true;
    }


		return false;
	}



	public int compareTo(Rational other)
	{
		// if my numerator / my denominator  is less than the other guy's then return -1
		// if my numerator / my denominator  is greater than the other guy's then return 1

    if((double)numerator/denominator < (double)other.getNumerator()/other.getDenominator())
    {
      return -1;
    }
    else if((double)numerator/denominator > (double)other.getNumerator()/other.getDenominator())
    {
      return 1;
    }

		return 0;  // we must be the same
	}

  public String toString()
  {
    return numerator + "/" + denominator;
  }



	// write the  toString() method
	// it should return the fraction as a String (i.e. the return type must be String)
	// so if my fraction is 3/4, you should return "3/4"     numerator + "/" + denominator
	// if my fraction is 1/1, you should return "1"  (it is kinda iffy for this one)






}
