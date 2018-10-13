//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Quadratic
{
	// these are our instance variables
	// (aka data members, data elements, attributes, properties, fields)
	// they permanently hold the data
	private int a, b, c;
	private double rootOne;
	private double rootTwo;


	// this is a default constructor (same name as class)
	// you should assign default values to the instance variables
	public Quadratic()
	{

	}

	// this is an initializer constructor (same name as class)
	// it receives values to assign to the instance variables
	// this will automatically get called when we create (instantiate)(new) the object
	//
	// the constructor will create temporary variables (parameters)
	//    quadA, quadB, and quadC and they will receive values
	//
	public Quadratic(int quadA, int quadB, int quadC)
	{
    a = quadA;
    b = quadB;
    c = quadC;

	}  // end of constructor  NOTE: quadA, quadB, and quadC are destroyed


	// this is a modifier method
	// it receives values to assign to the instance variables
	// the method will create temporary variables (parameters)
	//    quadA, quadB, and quadC and they will receive values
	//    when the method is called
	public void setEquation(int quadA, int quadB, int quadC)
	{
		a = quadA;
		b = quadB;
		c = quadC;
 	}


	// this will find the roots and store them into the
	// instance variables rootOne and rootTwo
	// see the word doc for the formula
	// NOTE: quadA, quadB, and quadC do NOT exist here
	//       USE YOUR INSTANCE VARIABLES  a, b, and c
	//       assign your results to your instance variables
	//            rootOne and rootTwo
	public void calcRoots()
	{
    rootOne = ((-1 * b + Math.sqrt(Math.pow(b,2) - (4 * a * c)))/ (2 * a));
    rootTwo = ((-1 * b - Math.sqrt(Math.pow(b,2) - (4 * a * c)))/ (2 * a));
	}


	// this will print out the results
	public void print()
	{
		// print out rootOne and rootTwo
		System.out.println("rootOne :: " + rootOne);
    System.out.println("rootTWo :: " + rootTwo);
    System.out.println();
    System.out.println();
		// now print out two blank lines

	}

  public int getA()
  {
    return a;
  }
  public int getB()
  {
    return b;
  }
  public int getC()
  {
    return c;
  }
}
