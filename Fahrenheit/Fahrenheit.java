//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Fahrenheit
{
	private double fahrenheit;

	public void setFahrenheit(double fahren)
	{
		fahrenheit = fahren;
	}

	public double getCelsius()
	{
		//add code to convert fahrenheit to celsius
		double celsius = ((fahrenheit - 32) * 5 / 9);

		return celsius;
	}

	public void print()
	{
		//modify this println to look like the word doc. Include a call to getCelsius()
		// as part of your println

		System.out.println(getCelsius());
	}

  public void printFahrenheit()
  {
    System.out.println(fahrenheit);
  }
}
