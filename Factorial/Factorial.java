//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Factorial
{
	private int number;



	public Factorial()
	{
    number = 0;
	}



	public Factorial(int num)
	{
    number = num;
	}



	public void setNum(int num)
	{
    number = num;
	}



	public int getNumber()
	{
		return number;
	}



	public long getFactorial(int number)
	{
		if((number == 0)||(number == 1))
    {
      return 1;
    }
    return getFactorial(number-1) * number;
	}



	public String toString()
	{
		// this has been done for you
		return "factorial of " + getNumber() + " is "+ getFactorial(number)+"\n";
	}
}
