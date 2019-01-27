//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -


// CHAPTER 10 Lab #3 - Extra Credit - 110 points - 2018-2019

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
    public static void main(String args[])
    {
        out.println("Lab Chapter 10 - #3 EXTRA CREDIT  RockPaperScissors  2018-2019");
        out.println();
        out.println();

        // ***** fill in your name
        out.println("My name is Neo Wang");
        out.println();
        out.println();

        Scanner keyboard = new Scanner(System.in);
        RockPaperScissors test = new RockPaperScissors();
        String input = "";

        do {
          System.out.print("Enter a value [R/P/S] :: ");
          input = keyboard.next();
          test.setPlayers(input);

          System.out.println("Player :: " + input);
          System.out.println("CPU :: " + test.getCPU());

          System.out.println("Winner :: " + test.getResult());
        } while (!test.hasPlayerWon);

        //read in the player value\
    }
}
