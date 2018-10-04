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
        switch(i)
				{
					case 0: one.setRadius(7.5);
					break;
					case 1: one.setRadius(10);
					break;
					case 2: one.setRadius(72.534);
					break;
					case 3: one.setRadius(55);
					break;
					case 4: one.setRadius(101);
					break;
					case 5: one.setRadius(99.952);
					break;
				}
        one.calculateArea();
        one.print();
      }
	}
}
