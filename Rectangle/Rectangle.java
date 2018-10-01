//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Rectangle
{
	// these are the instance variables or fields
	private int length;
	private int width;
	private int perimeter;


	// this is a modifier or setter method
	// we send values to the method to put into the instance variables
	public void setLengthWidth(int len, int wid )
	{
		// assign values to the instance variables
    length = len;
    width = wid;
	}

	public void calculatePerimeter()
	{
		perimeter = (length+width)*2;
	}

	public void print()
	{
		// print the output
		System.out.println("The Perimeter is :: " + perimeter);
	}
}
