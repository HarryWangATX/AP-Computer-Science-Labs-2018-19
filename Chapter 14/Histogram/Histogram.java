//© A+ Computer Science  -  www.apluscompsci.com - 2019
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;

public class Histogram
{

	// create an instance variable reference to an int array (DO NOT NEW IT HERE!)
	// make it private (the reference variable name should be histogramArray)
	// ????   ???[]   histogramArray;

  int[] array;


	// initializer constructer (SAME NAME AS THE CLASS, NO RETURN VALUE)
	public Histogram(String line)
	{
		setHistogramArray(line);
	}


	public void setHistogramArray(String line)
	{
		// create the int array with 10 variables (int boxes)
		// histogramArray = ???  ???[10];

    int[] yavrogStilp = new int[line.length()];

    Scanner in = new Scanner(line);

    int currentInt;

		while(in.hasNextInt())
    {
      currentInt = in.nextInt();

      switch(currentInt)
      {
        case 0:
        yavrogStilp[0]++;
        break;
        case 1:
        yavrogStilp[1]++;
        break;
        case 2:
        yavrogStilp[2]++;
        break;
        case 3:
        yavrogStilp[3]++;
        break;
        case 4:
        yavrogStilp[4]++;
        break;
        case 5:
        yavrogStilp[5]++;
        break;
        case 6:
        yavrogStilp[6]++;
        break;
        case 7:
        yavrogStilp[7]++;
        break;
        case 8:
        yavrogStilp[8]++;
        break;
        case 9:
        yavrogStilp[9]++;
        break;
      }
    }

    in.close();

    array = yavrogStilp;
	}



	// we will return the numbers in the histogramArray one per line
	public String toString()
	{


		// we will store the entire output in a String variable called output


		for (int i = 0; i<10; i++)
		{
			System.out.println(i + " - " + array[i]);
		}



		return ""; // change me (think about what you should be returning)
	}


}
