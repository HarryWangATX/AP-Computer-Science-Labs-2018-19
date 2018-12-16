//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

// Lab Chapter 7 - #5  Monster    2018

// Uses files MonsterRunner.java and Monster.java

// HINT:  Look back at previous programs that you have
//        written to help you.
//        Draw a picture of your Monster object.
//        Look at your doc file to see the correct output.

public class MonsterRunner
{
	public static void main( String args[] )
	{
		out.println("Lab Chapter 7 - #5  Monster    2018");
		out.println();
		out.println();

		// ***** fill in your name
		out.println("My name is Neo Wang");
		out.println();
		out.println();


		Scanner keyboard = new Scanner(System.in);
    String name;
    int size;

    for(int i = 0; i < 2; i++)
    {
      System.out.print("Enter the name of monster 1 :: ");
  		name = keyboard.nextLine();

  		System.out.print("Enter the size of monster 1 :: ");
  		size = keyboard.nextInt();
  		keyboard.nextLine();


  		Monster monster1 = new Monster();
      monster1.setMonster(name,size);
  		System.out.print("Enter the name of monster 2 :: ");
  		name = keyboard.nextLine();

  		System.out.print("Enter the size of monster 2 :: ");
  		size = keyboard.nextInt();
  		keyboard.nextLine();

  		Monster monster2 = new Monster();

      monster2.setMonster(name,size);

  		System.out.println();

  		// print out Monster 1 - name and size
  		// this will call the monster's toString() method
  		System.out.println("Monster 1 - " + monster1.toString() + "\n" + "Monster 2 - " + monster2.toString());

  		if(monster1.namesTheSame(monster2))
      {
        System.out.println("Monster 1 HAVE THE SAME NAME as Monster 2");
      }
      else
      {
        System.out.println("Monster 1 DOESNT THE SAME NAME as Monster 2");
      }

      if(monster1.isBigger(monster2))
      {
        System.out.println("Monster 1 IS BIGGER THAN Monster 2");
      }
      else if(monster1.isSmaller(monster2))
      {
        System.out.println("Monster 1 IS SMALLER THAN Monster 2");
      }
      else
      {
        System.out.println("Monster 1 HAS THE SAME NAME as Monster 2");
      }

  		System.out.println(); // prints a blank line
    }




		// compare the two monster's sizes
		// if (monster1.isSmaller(????))
		// 	  System.out.println("Monster 1 is SMALLER ...");
		// else
		//    System.out.println(...

		// compare the two monster's names
		// if (monster1.namesTheSame(?????))
		//    System.out.println(...
		// else
		//    System.out.println(



		// add more test cases



	}
}
