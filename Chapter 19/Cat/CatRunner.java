
import static java.lang.System.*;
import java.util.ArrayList;
import java.util.*;

// Lab Chapters 19-20 - #1  Cat    2019

// Uses files CatRunner.java and Cat.java

public class CatRunner
{
	public static void main( String args[] )
	{

		System.out.println("Lab Chapter 19-20 - #1  Cat    2019");
		System.out.println();
		System.out.println();

		// ***** fill in your name
		System.out.println("My name is Neo Wang");
		System.out.println();
		System.out.println();


		ArrayList<Cat> cats = new ArrayList<Cat>();

		Cat cat = new Cat("Tom",7);
		cats.add(cat);

		cat = new Cat("Jerry", 6);
		cats.add(cat);

		cat = new Cat("Jin", 3);
		cat.setName("Jinx");
		cat.setAge(5);
		cats.add(cat);


		// in order to use Collections.sort()
		// the Cat class has to implement the
		// comparable interface
		out.println("Original cats list: "+cats.toString());
		System.out.println();
		Collections.sort(cats);
		out.println("Sorted cats list:   "+cats.toString());
		System.out.println();



	}
}
