//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Sum
{
	// instance variables or attributes
	// these variables hold the data
	private double one, two, sum;


		// remember that num1 and num2 receive values
		//     and then we assign those values to the
		//     instance variables

		// num1 and num2 are temporary variables
		//     created by the method and at the end
		//     are destroyed

		// assign values to variables one and two
		// these variables always exist in the object

	public void setNums(double num1, double num2)
	{

		one = num1;
		two = num2;
	}

	public void sum()
	{
		// find the sum
		sum = one + two;
	}

	public void print()
	{
		// print the output (see the docs)
		System.out.println(one + " + " + two + " == " + sum);
	}
}
