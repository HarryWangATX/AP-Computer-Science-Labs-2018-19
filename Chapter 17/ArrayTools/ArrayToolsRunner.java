//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.lang.Math;
import java.util.Arrays;

// Lab Chapter 17 - #1  ArrayTools    2019

// Uses files ArrayToolsRunner.java and ArrayTools.java


public class ArrayToolsRunner
{
	public static void main( String args[] )
	{
		System.out.println("Lab Chapter 17 - #1  ArrayTools    2019");
		System.out.println();
		System.out.println();

		// ***** fill in your name
		System.out.println("My name is Neo Wang");
		System.out.println();
		System.out.println();



	   int[] theRay = {2,4,6,8,10,12,8,16,8,20,8,4,6,2,2};

	   out.println("Original array : "+Arrays.toString(theRay));

	   out.println("Sum of 0-3: "+ArrayTools.sumSection(theRay,0,3));
     out.println("Sum of 2-7: "+ArrayTools.sumSection(theRay,2,7));
     out.println("Sum of 1-8: "+ArrayTools.sumSection(theRay,1,8));
     out.println("Sum of 5-9: "+ArrayTools.sumSection(theRay,5,9));

     System.out.println("Count of 2s : " + ArrayTools.countVal(theRay, 2));
     System.out.println("Count of 8s : " + ArrayTools.countVal(theRay, 8));


	}
}
