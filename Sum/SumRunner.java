//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class SumRunner
{
	public static void main( String[] args )
	{
   		System.out.println("Lab Sum #1 - 2018");
   		System.out.println();
   		System.out.println("My name is Neo Wang");
   		System.out.println();
   		System.out.println();

		Sum test = new Sum();

		test.setNums(5,5);
		test.sum();
		test.print();

		test.setNums(90,100.0);
		test.sum();
		test.print();

		test.setNums(100.5,85.8);
		test.sum();
		test.print();

		test.setNums(-100,55);
		test.sum();
		test.print();

		test.setNums(15236,5642);
		test.sum();
		test.print();

		test.setNums(1000,555);
		test.sum();
		test.print();




		//add more test cases
	}
}
