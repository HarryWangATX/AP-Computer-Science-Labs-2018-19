//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
//EXTRA CREDIT
import static java.lang.System.*;

public class TenToAny
{
   private int base10;
   private int newBase;

   public TenToAny()
   {
     base10 = 0;
     newBase = 0;
   }

   public TenToAny(int a, int b)
   {
     base10 = a;
     newBase = b;
   }


	// add a constructor





	// add a setter method
  public void setNums(int a, int b)
  {
    base10 = a;
    newBase = b;
  }


	public String getNewNum()
	{
    String output = Integer.toString(base10, newBase);
		return output;
	}

  public String toString()
  {
    return base10 + " in base " + newBase + " is " + getNewNum();
  }



	// add a toString method





}
