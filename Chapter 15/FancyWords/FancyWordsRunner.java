//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

// Lab Chapter 15 - #5  FancyWords  Extra Credit    2019

// Uses files FancyWordsRunner.java and FancyWords.java

public class FancyWordsRunner
{
	public static void main( String args[] ) throws IOException
	{
		System.out.println("Lab Chapter 15 - #5 (Extra Credit)  FancyWords    2019");
		System.out.println();
		System.out.println();

		// ***** fill in your name
		System.out.println("My name is Neo Wang");
		System.out.println();
		System.out.println();

		FancyWords vraj = new FancyWords("2003 TCEA STATE CONTEST");
		System.out.println(vraj.toString(true));

		vraj.setString("PROGRAMMING IS FUN");

		System.out.println(vraj.toString(true));

		vraj.setString("TODAY IS SATURDAY");
		System.out.println(vraj.toString(true));



	}
}
