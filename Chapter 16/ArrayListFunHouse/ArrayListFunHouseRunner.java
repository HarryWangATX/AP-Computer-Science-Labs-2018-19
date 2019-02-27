//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

// Lab Chapter 16 - #1  ArrayListFunHouse    2019

// Uses files ArrayListFunHouseRunner.java and ArrayListFunHouse.java

// HINT:  Look at sample ArrayList pictures to understand what you need to do in your code.
//		  DRAW PICTURES and walk through what you need to do.
//        If you don't know what needs to be done, you certainly cannot give
//        instructions to the computer to tell it what to do.


public class ArrayListFunHouseRunner
{
	public static void main( String args[] )
	{
		System.out.println("Lab Chapter 16 - #1  ArrayListFunHouse    2019");
		System.out.println();
		System.out.println();

		// ***** fill in your name
		System.out.println("My name is Neo Wang");
		System.out.println();
		System.out.println();




		System.out.println(ArrayListFunHouse.getListOfFactors(9));

		System.out.println(ArrayListFunHouse.getListOfFactors(23));

		System.out.println(ArrayListFunHouse.getListOfFactors(50));

		System.out.println(ArrayListFunHouse.getListOfFactors(100));

		System.out.println(ArrayListFunHouse.getListOfFactors(762));

		System.out.println();


		Integer[] nums = {2,6,8,9,10,12,13,15,17,24,55,66,78,77,79};
		List<Integer> list = new ArrayList<Integer>( Arrays.asList(nums) );

		System.out.println( "Original List \n" + list );
		ArrayListFunHouse.keepOnlyCompositeNumbers( list );
		System.out.println( "Composite List \n" + list );
		System.out.println();
		System.out.println();

	}
}
