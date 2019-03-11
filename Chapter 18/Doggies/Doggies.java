//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;

public class Doggies
{

	private Dog[] pups;  // you have an array of Dog objects named pups


	public Doggies(int size)
	{
		// point pups to a new array of Dog
		// pups = ??? ???[????];

    pups = new Dog[size];
	}



	public void add(int spot, int age, String name)
	{
		// add a new Dog to the array at the spot position (index)
		// make sure spot is in bounds

		// Dog pup = ??? ???(???, ???);
		// if (spot >= 0 && ???? < pups.????)
		//     pups[???] = ???;

    pups[spot] = new Dog(age,name);

	}



	public String getNameOfOldest()
	{
		// you will need to loop through all of the pups
		// you will need 2 local variables - one to store the current oldest
		// age and the second to store the index (location) of where the oldest pup is
		// once you know the location of the oldest, you will return the age of the oldest
		// remember this is an array, so there are no methods to call
		// you can refer to a single Dog object by using
		//     pups[i].????

    int oldestIndex = 0;

    for(int i = 0; i < pups.length; i++)
    {
      if(pups[oldestIndex].getAge() < pups[i].getAge())
      {
        oldestIndex = i;
      }
    }

    return pups[oldestIndex].getName();

	}



	public String getNameOfYoungest()
	{
    int youngest = 0;

    for(int i = 0; i < pups.length; i++)
    {
      if(pups[youngest].getAge() > pups[i].getAge())
      {
        youngest = i;
      }
    }

    return pups[youngest].getName();
	}



	public String toString()
	{
		return ""+Arrays.toString(pups);
	}

}
