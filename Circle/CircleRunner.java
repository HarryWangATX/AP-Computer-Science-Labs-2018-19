//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.lang.Math;

public class CircleRunner
{
	public static void main( String[] args )
   {

   		System.out.println("Lab Circle #5 - 2018");
   		System.out.println();
   		System.out.println("My name is Neo Wang");
   		System.out.println();
   		System.out.println();
   		//add test cases
   		// see CubeRunner.java for help

      for(int i = 0; i < 5; i++)
      {
        Circle one = new Circle();
        one.setRadius(Math.random());
        one.calculateArea();
        one.print();
      }
	}
}
