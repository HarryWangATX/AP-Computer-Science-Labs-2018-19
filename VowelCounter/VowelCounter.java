//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class VowelCounter
{
	public static String getNumberString( String s)
	{
		// you will receive a String called s with the data


		// STEP 1:
		// you will need to create an int variable for your count
		//    it should be set to 0

    int count = 0;

		// STEP 2:
		// you will need to create a new String variable (not s) to hold the output
		//    it should be set to the empty String to start  ""

		String rart = "";

		// STEP 3:
		// you will need to loop through the String s and look at each character

    String rart2 = s.toUpperCase();

		for(int i = 0; i < rart2.length(); i++)
    {
      if((rart2.charAt(i) == 'A')||(rart2.charAt(i) == 'E')||(rart2.charAt(i) == 'I')||(rart2.charAt(i) == 'O')||(rart2.charAt(i) == 'U'))
      {
        rart += count;
        count++;
      }
      else
      {
        rart += s.charAt(i);
      }
    }

		return rart;  // return the new output String that you created
	}
}
