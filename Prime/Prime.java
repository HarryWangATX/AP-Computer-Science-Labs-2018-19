//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.lang.Math;

public class Prime
{
	private int number;



	public Prime()
	{
		number = 0;
	}



	public Prime(int num)
	{
		number = num;
	}



	public void setPrime(int num)
	{
    number = num;
	}



  public boolean isPrime()
  {

      // Base cases

			for(int i = 2; i < number; i++)
			{
				if((number % i)==0)
				{
					return true;
				}
			}
			return false;
  }

	public String toString()
	{

		return isPrime() ? number + " is not prime" : number + " is prime";
	}
}
