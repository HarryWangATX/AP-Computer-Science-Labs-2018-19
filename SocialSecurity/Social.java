//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

//Social and SocialRunner EXTRA CREDIT
import static java.lang.System.*;
import java.util.Stack;
import java.util.Arrays;

public class Social
{
   private String socialNum;
   private int sum;

	public Social()
	{
    socialNum = "";
    sum = 0;
	}

	public Social(String soc)
	{
    socialNum = soc;
	}


	public void setWord(String w)
	{
    socialNum = w;
    sum = 0;
	}

	public void chopAndAdd()
	{
    sum = Arrays.stream(socialNum.split("-")).mapToInt(Integer::valueOf).sum();
	}

	public String toString()
	{
		return "SS# " + socialNum + " has a total of " + sum + "\n";
	}
}
