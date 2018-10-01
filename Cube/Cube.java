//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
import java.lang.Math;

public class Cube
{
	private int side;
	private int surfaceArea;

	public void setSide(int s)
	{
    side = s;
	}

	public void calculateSurfaceArea()
	{
    surfaceArea = (int)(Math.pow(side,2) * 6);
	}

	public void print()
	{
    System.out.println("The surface area is :: " + surfaceArea);
	}
}
