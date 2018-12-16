//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

// Lab Chapter 9 - #7  LetterRemover    2018

// Uses files LetterRemoverRunner.java and LetterRemover.java


public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		// add test cases
		out.println("Lab Chapter 9 - #7  LetterRemover    2018");
		out.println();
		out.println();

		// ***** fill in your name
		out.println("My name is Neo Wang");
		out.println();
		out.println();

    LetterRemover test = new LetterRemover("I am Sam I am", 'a');
    System.out.println(test);
    System.out.println(test.removeLetters());
    System.out.println();

    test.setRemover("ssssssssxssssesssssesss", 's');
    System.out.println(test);
    System.out.println(test.removeLetters());
    System.out.println();

    test.setRemover("qwertyqwertyqwerty", 'a');
    System.out.println(test);
    System.out.println(test.removeLetters());
    System.out.println();

    test.setRemover("abababababa", 'b');
    System.out.println(test);
    System.out.println(test.removeLetters());
    System.out.println();

    test.setRemover("abaababababa", 'x');
    System.out.println(test);
    System.out.println(test.removeLetters());
    System.out.println();


	}  // end marker for method main


} // end marker for class
