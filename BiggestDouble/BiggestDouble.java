//© A+ Computer Science  -  www.apluscompsci.com - 2018-2019
//Name - Neo
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class BiggestDouble
{
	private double[] numbers;

	public BiggestDouble()
	{
		numbers = new double[4];
	}

	public BiggestDouble(double a, double b, double c, double d)
	{
	    numbers = new double[4];

	    numbers[0] = a;
	    numbers[1] = b;
	    numbers[2] = c;
	    numbers[3] = d;
	}

	public void setDoubles(double a, double b, double c, double d)
	{
        numbers[0] = a;
        numbers[1] = b;
        numbers[2] = c;
        numbers[3] = d;
	}

	public double getBiggest() // You need multiple if statements here (if one>two && one>three && etc.)
	{
		double biggest = numbers[0];

		for(int i = 1; i <= numbers.length-1; i++)
		{
		    if(biggest < numbers[i])
		    {
		        biggest = numbers[i];
		    }
		}

		return biggest;
	}

	public String toString()
	{
	   return numbers[0] + ", " + numbers[1] + ", " + numbers[2] + ", " + numbers[3] + "\n" + "Biggest: " + getBiggest();
	}
}
