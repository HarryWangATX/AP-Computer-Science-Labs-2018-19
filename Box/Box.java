//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Box
{
	// instance variable
	private String word;



	// default constructor
	// SAME NAME AS THE CLASS and no return type
	public Box()
	{
		// initialize word to the empty string ""
    word = "";
	}



	// initializer constructor
	// SAME NAME AS THE CLASS and no return type
	// String variable s is created and receives a beginning value
	//    to store in our instance variable word
	public Box(String s)
	{
		word = s;
	}


	// modifier or setter method
	// String variable s is created and receives a new value
	//    to store in our instance variable word
	public void setWord(String s)
	{
		word = s;
	}


	public void print( )
	{
		// you will need a loop here
		// the loop should run word.length() times
		// each time through your loop you will print the value of word

		// for (int ? = ?;   ? < ?;  ?++)
		// {
			   // print out your word (use println, not print)
		// }

		for(int i = 0; i < word.length(); i++)
    {
      System.out.println(word);
    }
		// after the loop add 2 blank lines
		System.out.println();
    System.out.println();

	}
}
