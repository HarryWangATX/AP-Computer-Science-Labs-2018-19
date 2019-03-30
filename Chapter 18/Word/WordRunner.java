//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

// Lab Chapter 18 - #2  Word    2019

// Uses files WordRunner.java and Word.java


public class WordRunner
{
	public static void main(String[] args)
	{

		System.out.println("Lab Chapter 18 - #2  Word    2019");
		System.out.println();
		System.out.println();

		// ***** fill in your name
		System.out.println("My name is Neo Wang");
		System.out.println();
		System.out.println();

		Word word = new Word("chicken");

		out.println(word.toString());
		out.println("num vowels == " + word.getNumVowels());
		out.println("num chars  == " + word.getLength());
    System.out.println();

    word.setWord("alligator");

    out.println(word.toString());
		out.println("num vowels == " + word.getNumVowels());
		out.println("num chars  == " + word.getLength());
    System.out.println();

    word.setWord("elephant");

    out.println(word.toString());
		out.println("num vowels == " + word.getNumVowels());
		out.println("num chars  == " + word.getLength());




		// add the other test cases


	}
}
