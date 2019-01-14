//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

// Lab Chapter 8 - #6  Word    2018

// Uses files WordRunner.java and Word.java


public class WordRunner
{
	public static void main ( String[] args )
	{
		out.println("Lab Chapter 8 - #6  Word    2018");
		out.println();
		out.println();

		// ***** fill in your name
		out.println("My name is Neo Wang");
		out.println();		
		out.println();

		Word justStilp = new Word("Hello");
		System.out.println(justStilp);
		System.out.println();

		justStilp.setString("World");
		System.out.println(justStilp);
		System.out.println();

		justStilp.setString("JukeBox");
		System.out.println(justStilp);
		System.out.println();

		justStilp.setString("TCEA");
		System.out.println(justStilp);
		System.out.println();

		justStilp.setString("UIL");
		System.out.println(justStilp);
		System.out.println();

	}
}
