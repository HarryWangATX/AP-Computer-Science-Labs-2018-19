//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
import java.lang.Math;

public class AverageRunner
{
	public static void main( String[] args )
   {
   		System.out.println("Lab Average #3 - 2018");
   		System.out.println();
   		System.out.println("My name is Neo Wang");
   		System.out.println();
   		System.out.println();


 		// create an Average object (new it!)
 		Average avg = new Average();

 		// call the setNums method and pass it 2 values
  /*  for(int i = 0; i < 10; i++)
    {
      avg.setNums((int)(Math.random()*100), (int)(Math.random()*100));
      avg.average();
      avg.print();
    }
	*/
		while(true)
		{
      avg.setNums((int)(Math.random()*100), (int)(Math.random()*100));
      avg.average();
      avg.print();
		}

 		// call the average method which will calculate the average


 		// call the print method to print the info



 		// ********************************************
 		// now add more test cases




	}
}
