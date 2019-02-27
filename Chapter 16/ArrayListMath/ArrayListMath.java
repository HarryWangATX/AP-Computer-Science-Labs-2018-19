
import java.util.*;

// FIND ALL OF THE FINISH ME comments

public class ArrayListMath
{

	// FINISH ME
	public static int getSum(ArrayList<Integer> list)
	{
    int sum = 0;

    for(int a : list)
    {
      sum += a;
    }


		return sum;
	}



	// FINISH ME
	// PRECONDITION: list.size() is greater than 0
	public static double getAverage(ArrayList<Integer> list)
	{

		return (getSum(list) + 0.0)/list.size();
	}



	// FINISH ME
	public static int getLargestValue(ArrayList<Integer> list)
	{
    int max = list.get(0);

    for(int i = 1; i < list.size(); i++)
    {
      if(list.get(i) > max)
      {
        max = list.get(i);
      }
    }

		return max;
	}



	// FINISH ME
	public static int getSmallestValue(ArrayList<Integer> list)
	{
    int min = list.get(0);

    for(int i = 1; i < list.size(); i++)
    {
      if(list.get(i) < min)
      {
        min = list.get(i);
      }
    }

    return min;
	}



	// FINISH ME
	public static int getNumberOfEvens(ArrayList<Integer> list)
	{
    int count = 0;

    for(int a : list)
    {
      if(a % 2 == 0)
      {
        count++;
      }
    }

		return count;
	}



	// FINISH ME
	public static int getNumberOfOdds(ArrayList<Integer> list)
	{
    int count = 0;

    for(int a : list)
    {
      if(a % 2 != 0)
      {
        count++;
      }
    }

    return count;
	}



	// FINISH ME
	// get the number of numbers greater than or equal to the parameter number
	public static int getNumberOfNumbersGTE(ArrayList<Integer> list, int number)
	{


		return 0;
	}



	// FINISH ME
	// get the number of numbers less than the parameter number
	public static int getNumberOfNumbersLT(ArrayList<Integer> list, int number)
	{


		return 0;
	}

}
