//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Average
{
	//instance variables
	private double one, two, average;


	public void setNums(double num1, double num2)
	{
		// assign values to variables one and two
		one = num1;
		two = num2;
	}

	public void average( )
	{
		// compute the average
		average = (one + two) / 2;
	}

	public void print()
	{
		// print the info (see the doc file)
		System.out.println("Average - " + one + " and " + two + " : " + average);
	}
}
