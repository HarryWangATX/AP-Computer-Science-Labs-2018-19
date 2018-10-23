//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

// Lab Chapter 4 - #4 - Name    2018


public class NameRunner
{
	public static void main ( String[] args )
	{
		System.out.println("Lab Chapter 4 - #4 - Neo Wang    2018");
		System.out.println();
		System.out.println("My name is Neo Wang");
		System.out.println();
		System.out.println();


		// the main method is already done for you

		Name person = new Name("Sally Baker");
		System.out.println(person.getFirst());
		System.out.println(person.getLast());
		System.out.println(person);

		person.setName("John Doe");
		System.out.println(person.getFirst());
		System.out.println(person.getLast());
		System.out.println(person);

		person.setName("Bill Gates");
		System.out.println(person.getFirst());
		System.out.println(person.getLast());
		System.out.println(person);

		person.setName("Leonardo DaVinci");
		System.out.println(person.getFirst());
		System.out.println(person.getLast());
		System.out.println(person);

		person.setName("George Washington");
		System.out.println(person.getFirst());
		System.out.println(person.getLast());
		System.out.println(person);
	}
}
