//© A+ Computer Science  -  www.apluscompsci.com - 2018-2019
//Name -
//Date -
//Class -
//Lab  - EXTRA CREDIT LAB

import java.util.Scanner;
import static java.lang.System.*;
import java.lang.Math;

public class RockPaperScissors
{
    private String playChoice;
    private String compChoice;
    public boolean hasPlayerWon = false;

    public RockPaperScissors()
    {
        super();
    }

    public RockPaperScissors(String player)
    {
        super();
        if(player.toLowerCase().equals("computer"))
        {
            compChoice = getDraw();
        }
        else if(player.toLowerCase().equals("player"))
        {
            playChoice = getDraw();
        }
    }

    public String getDraw()
    {
        int choice = (int)(Math.random()*3);

        switch(choice)
        {
            case 0:
                return "rock";
            case 1:
                return "scissors";
            case 2:
                return "paper";
        }

        return "0";
    }

    public void setPlayers(String player)
    {
        if(player.toLowerCase().equals("r"))
        {
            compChoice = getDraw();
            playChoice = "r";
        }
        else if(player.toLowerCase().equals("p"))
        {
            compChoice = getDraw();
            playChoice = "paper";
        }
        else
        {
          compChoice = getDraw();
          playChoice = "scissors";
        }
    }

    public String getResult()
    {

        if(playChoice.equals(compChoice))
        {
            return "tie";
        }
        else if((playChoice.equals("rock") && compChoice.equals("scissors"))||(playChoice.equals("paper") && compChoice.equals("rock"))||(playChoice.equals("scissors") && compChoice.equals("paper")))
        {
            hasPlayerWon = true;
            return "player";
        }
        else
        {
            return "computer";
        }
    }

    public String getCPU()
    {
      return compChoice;
    }

    public String toString()
    {
        String output="";
        return output;
    }

}
