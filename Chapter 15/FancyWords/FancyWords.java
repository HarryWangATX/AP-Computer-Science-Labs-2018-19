//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
//Extra Credit Lab
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import static java.lang.System.*;
import java.lang.StringBuilder;

public class FancyWords
{
	private String[] wordRay;

	public FancyWords(String sentence)
	{
		wordRay = sentence.split(" ");
	}

	public void setString(String sentence)
	{
		wordRay = sentence.split(" ");
	}

	public String toString()
	{
		String output = "";

		for(String a : wordRay)
		{
			a = reverseString(a);
		}

		for(int i = 0; i < wordRay.length; i++)
		{
			for(String a : wordRay)
			{
				output += a.charAt(i);
			}
			System.out.println();
		}
		return output;
	}

	public int largestlength()
	{
		int output = 0;
		for(String a : wordRay)
		{
			if(a.length() > output)
			{
				output = a.length();
			}
		}

		return output;
	}

	public String toString(boolean a)
	{
		String stringTemp;
		String stringTempRev;
		String output = "";

		for (int i = 0; i < largestlength(); i++)
		{
	    for (int n = wordRay.length-1; n >= 0; n--)
	    {
	     stringTemp = wordRay[n];
	     stringTempRev = new StringBuilder(stringTemp).reverse().toString();
	     if (i < stringTemp.length())
	     {
	      output += stringTempRev.charAt(i);
	     }
			 else
			 {
				 output += " ";
			 }
	    }
	    output += "\n";
		}

		return output;
	}

	public String reverseString(String a)
	{
		String output = "";

		for(int i = a.length()-1; i >= 0; i--)
		{
			output += a.charAt(i) + "";
		}

		return output;
	}
}
