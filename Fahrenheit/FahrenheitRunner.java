//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - This is an extra credit lab worth 110 points
import java.lang.Math;

public class FahrenheitRunner
{
	public static void main( String[] args )
	{
		//add test cases
   		System.out.println("Lab Fahrenheit #7 Extra Credit - 2018");
   		System.out.println();
   		System.out.println("My name is Neo Wang");
   		System.out.println();
   		System.out.println();

			Fahrenheit one = new Fahrenheit();

			one.setFahrenheit(Math.random()*200);
			System.out.print("Fahrenheit :: ");
			one.printFahrenheit();
			System.out.print("Celsius :: ");
			one.getCelsius();
			one.print();
	}
}
