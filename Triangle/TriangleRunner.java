//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import java.lang.Math.*;

public class TriangleRunner  //this class is used to test class Triangle
{
	public static void main( String[] args )
	{
		System.out.println("My name is Neo Wang");
		System.out.println();
		System.out.println("#1 - Triangle 2018 version");
		System.out.println();
		System.out.println();

		// this creates a new Scanner object so that
		// we can read data that the user enters
		Scanner keyboard = new Scanner(System.in);


		//ask for user input (prompt the user)
    int a,b,c;
		// we create a new Triangle object
		// and send to the constructor the values
		// of our varibles a, b, and c
		Triangle test = new Triangle(0, 0, 0);

		//ask for user input - round 2
    for(int i = 0; i < 3; i++)
    {
      System.out.print("Enter side A ::  ");
  		a = keyboard.nextInt();

  		System.out.print("Enter side B ::  ");
  		b = keyboard.nextInt();

  		System.out.print("Enter side C ::  ");
  		c = keyboard.nextInt();


  		test.setSides(a,b,c);
  		test.calcPerimeter();
  		test.calcArea();
  		test.print();
    }


		// ****************  add one more input section




	}
}
