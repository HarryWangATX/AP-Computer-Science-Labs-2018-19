//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Line
{
	private double xOne,yOne, xTwo, yTwo;
	private double slope;

	public Line(int x1, int y1, int x2, int y2) // this is the constructor
	{
    xOne = x1;
    yOne = y1;
    xTwo = x2;
    yTwo = y2;
	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
    xOne = x1;
    yOne = y1;
    xTwo = x2;
    yTwo = y2;
	}

	public void calculateSlope()
	{
    slope = (yTwo - yOne)/(xTwo - xOne);
	}

	public void print()
	{
    System.out.println("x1: " + xOne + " y1: " + yOne + " x2: " + xTwo + " y2: " + yTwo + " slope: " + slope);
	}
}
