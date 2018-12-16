//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
//THIS LAB IS EXTRA CREDIT

import static java.lang.System.*;

public class GCD
{
	private int one, two;

	public GCD()
	{
    one = 0;
    two = 0;
	}

	public GCD(int numOne, int numTwo)
	{
    one = numOne;
    two = numTwo;
	}

	public void setNums(int numOne, int numTwo)
	{
    one = numOne;
    two = numTwo;
	}

	public long getGCD(int a, int b)
	{
    if(a == 0)
    {
      return b;
    }
    else if(b == 0)
    {
      return a;
    }
		else if(a > b)
    {
      a = a - b;
    }
    else if(a < b)
    {
      b = b - a;
    }
    else
    {
      return a;
    }

		return getGCD(a, b);
	}

	public String toString()
	{
		return "GCD(" + one + " ," + two + ")" + " == " + getGCD(one, two);
	}
}
