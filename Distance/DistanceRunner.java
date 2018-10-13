//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import java.io.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args ) throws IOException
	{
		// THIS PROBLEM IS EXTRA CREDIT
		// YOU WILL GET A 110/100 IF your program
		//     works properly

		// NOTE: Look back at previous labs for help
		//       Also, look at the word doc

 		System.out.println("My name is Neo Wang");
		System.out.println();
		System.out.println("#4 - Distance Extra Credit Lab 2018 version");
		System.out.println();
		System.out.println();

		Scanner input = new Scanner(new File("input.dat"));
    int testCases = input.nextInt();

    for(int i = 0; i < testCases; i++)
    {
      int x1 = input.nextInt();
      System.out.println("x1 :: " + x1);
  		int y1 = input.nextInt();
      System.out.println("y1 :: " + y1);
  		int x2 = input.nextInt();
      System.out.println("x2 :: " + x2);
  		int y2 = input.nextInt();
      System.out.println("y2 :: " + y2);

  		Distance one = new Distance(x1,y1,x2,y2);
  		one.calcDistance();
  		one.print();

			System.out.println();
    }

		input.close();

		// add more testcd  cases 2018


	}
}
