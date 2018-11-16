//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - EXTRA CREDIT LAB

import static java.lang.System.*;

public class WordFun2
{
	public static String moveEmAround(String a, int x)
	{
    if(a.length()-1 >= x)
    {
      String output = a.substring(x) + a.substring(0,x);
      return output;
    }
    else
    {
      return "Out of bounds reee";
    }
	}
}
