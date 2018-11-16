//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

// EXTRA CREDIT LAB

// Lab Chapter 6 - #4  Social    2018

// Uses files SocialRunner.java and Social.java


public class SocialRunner
{
	public static void main( String args[] )
	{
		out.println("Lab Chapter 6 - #4  Social 2018  EXTRA CREDIT LAB");
		out.println();
		out.println();

		// ***** fill in your name
		out.println("My name is Neo Wang");
		out.println();
		out.println();

		Social test = new Social("456-56-234");

		test.setWord("1-1-1");
		test.chopAndAdd();
		System.out.println(test);

		test.setWord("102-2-12");
		test.chopAndAdd();
		System.out.println(test);

		test.setWord("0-0-0");
		test.chopAndAdd();
		System.out.println(test);

		// add test cases

	}
}
