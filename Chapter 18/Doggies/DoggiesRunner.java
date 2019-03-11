//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;

// Lab Chapter 18 - #1  Doggies    2019

// Uses files DoggiesRunner.java and Doggies.java and Dog.java


public class DoggiesRunner
{
   public static void main( String[] args )
   {
		System.out.println("Lab Chapter 18 - #1  Doggies    2019");
		System.out.println();
		System.out.println();

		// ***** fill in your name
		System.out.println("My name is Neo Wang");
		System.out.println();
		System.out.println();


		// the rest of this has been done for you

		Scanner keyboard = new Scanner(System.in);


		System.out.print("How many Dogs are in the pack? :: ");
		int size = keyboard.nextInt();
		keyboard.nextLine();

		Doggies pack = new Doggies(size);

		for(int i=0; i<size; i++)
		{
			System.out.print("Enter the age :: ");
			int age = keyboard.nextInt();
			keyboard.nextLine();

			System.out.print("Enter the name :: ");
			String name  = keyboard.nextLine();
			pack.add(i, age, name);
		}
		System.out.println("pack :: "+pack);
		System.out.println("NAME OF OLDEST :: "+pack.getNameOfOldest());
		System.out.println("NAME OF YOUNGEST :: "+pack.getNameOfYoungest());
	}
}
