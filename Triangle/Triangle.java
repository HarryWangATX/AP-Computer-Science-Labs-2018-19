//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import java.lang.Math.*;

public class Triangle
{
	// these are our instance variables
	// these variables permanently hold the values
	// we mark them as private so that they will not be accidently changed

	private int sideA, sideB, sideC;
	private double perimeter;
	private double theArea;


	// this is a default constructor (same name as the class)
	//    we use it to assign default values to our instance variables
	public Triangle()
	{
	   setSides(0,0,0); // calling our set method to do the work
	   perimeter=0;
	   theArea=0;
	}


	// this is the initialization constructor (same name as the class)
	// this is called when we create a Triangle object
	//    so that we can initialize our instance variables
	//
	// variables a, b, and c are temporary variables (parameters)
	// the constructor will create these parameter variables when the method is called
	// java will destroy these parameters when the constructor ends
	public Triangle(int a, int b, int c)
	{
		sideA = a;
    sideB = b;
    sideC = c;
		//more code goes here


	} // end of method (variables a, b, and c are destroyed)


	// this is a modifier method
	// it allows us to change the values of our instance variables
	public void setSides(int a, int b, int c)
	{
		// assign the incoming values to sideA, sideB, and sideC
		sideA = a;
    sideB = b;
    sideC = c;

	}

	public void calcPerimeter( )
	{
		// calculate the perimeter and store your answer in the
		// perimeter instance variable

		perimeter = sideA + sideB + sideC;

	}

	public void calcArea( )
	{
		// see the doc for the formula

		double s = (perimeter / 2);

    theArea = Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC));

		// now assign the value of the area to your instance variable
		// you must use * for multiplication, as there is no implicit
		//    multiplication  (example:  3(a+b) would be 3*(a+b))
		// see the doc for the formula

	}

	public void print( )
	{
		// use System.out.println (use your instance variables)
		//     there are no variables called a,b, and c
		// the instance variables are the only known variables to this method

		// so print the values of sideA, sideB, and sideC
		// and then print Area == and the value of theArea


		System.out.println("Side A :: " + sideA);
    System.out.println("Side B :: " + sideB);
    System.out.println("Side C :: " + sideC);
    System.out.println("Perimeter :: " + perimeter);
    System.out.println("Area :: " + theArea);
    System.out.println();
	}
}
