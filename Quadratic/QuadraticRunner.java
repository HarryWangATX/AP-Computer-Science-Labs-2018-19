//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import java.io.*;
import static java.lang.Math.*;

public class QuadraticRunner
{
	public static void main(String[] args) throws IOException
   {

 		System.out.println("My name is Neo Wang");
		System.out.println();
		System.out.println("#3 - Quadratic  2018 version");
		System.out.println();
		System.out.println();


		// create a Scanner object so that we can read in values
		//    from the user
		// look at previous programs if you do not remember how to do this
  		Scanner input = new Scanner(new File("input.dat"));
  	  Quadratic quad = new Quadratic();

      int testCases = input.nextInt();
   		// add 3 test cases
      for(int i = 0; i < testCases; i++)
      {
        int aaa = input.nextInt();
        int bbb = input.nextInt();
        int ccc = input.nextInt();

        quad.setEquation(aaa, bbb, ccc);

        System.out.println("Case " + (i+1) + ":");
        System.out.println("A value: " + quad.getA());
        System.out.println("B value: " + quad.getB());
        System.out.println("C value: " + quad.getC());

        quad.calcRoots();
        quad.print();

      }
   		// ***** here is a guide for the first case


   		// ***** STEP 1: GET THE INPUT VALUES FROM THE USER for a,b, and c

   		// prompt the user to enter a value for a

   		// then read it in using your Scanner reference variable and assign it to variable a

   		// prompt the user to enter a value for b

   		// then read it in using your Scanner reference variable and assign it to variable b

   		// prompt the user to enter a value for c

   		// then read it in using your Scanner reference variable and assign it to variable c



   		// ***** STEP 2: CREATE (INSTANTIATE) a Quadratic object

		// Quadratic quad = ????



   		// ***** STEP 3: Call the calcRoots method

		// quad.????;



   		// ***** STEP 4: Call the print method

		// quad.????;




	}
}
