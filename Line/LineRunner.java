//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
import java.lang.Math;

public class LineRunner
{
	public static void main( String[] args )
   {
		//add test cases
   		System.out.println("Lab Line #6 - 2018");
   		System.out.println();
   		System.out.println("My name is Neo Wang");
   		System.out.println();
   		System.out.println();

			Line one = new Line(1,9,14,2);
			one.calculateSlope();
			one.print();
			one.setCoordinates(1,7,18,3);
			one.calculateSlope();
			one.print();
			one.setCoordinates(6,4,2,2);
			one.calculateSlope();
			one.print();
			one.setCoordinates(4,4,5,3);
			one.calculateSlope();
			one.print();
			one.setCoordinates(1,1,2,9);
			one.calculateSlope();
			one.print();

   		//Before you instantiate the Line object, look at the Line class
   		//It has a constructor which is automatically called when you make a new Line object
   		//The constructor is requiring that you pass it 4 values when you instantiate the object
   		// No empty ( )!


	}
}
