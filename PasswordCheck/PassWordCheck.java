//© A+ Computer Science  -  www.apluscompsci.com - 2018-2019
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

class PassWordCheck
{
	private String realPassword;

	public PassWordCheck(String password)  // initialization constructor
	{
		realPassword = password;
	}

	public void check() // this is where all the code will go
	{
		Scanner keyboard = new Scanner(System.in);
    String input = "";
		boolean passwordCorrect = false;  // this is your boolean variable!

		// start your do...while loop here
		do
		{

		// prompt the user to enter a password
		// see StringRunner lab from Chapter 5 to review how to read in a one word input. Save your input in a String variable



		// if the input password equals the realPassword (How do you check equality of Strings?)
		// set your boolean variable equal to true
		// and print "VALID". You will need { } here
		// else, print "INVALID"

      System.out.print("Enter your password :: ");
      input = keyboard.nextLine();
      if(input.equals(realPassword))
      {
        passwordCorrect = true;
        System.out.println("Oh no you \"hacked\" me");
      }
      else
      {
        System.out.println("INVALID");
      }



  }while(!passwordCorrect);  // continue so long as boolean variable is false




	}
}
