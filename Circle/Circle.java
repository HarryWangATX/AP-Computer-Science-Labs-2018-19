//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
import java.lang.Math;

public class Circle
{
	private double radius;
	private double area;

	public void setRadius(double rad)
	{
		radius = rad;
	}

	public void calculateArea()
	{
		area = Math.pow(radius, 2) * Math.PI;
	}

	public void print()
	{
		System.out.println("The area of the circle with radius " + radius + " is :: " + area);
	}
}
