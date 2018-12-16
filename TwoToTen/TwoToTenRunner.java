//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;


// THIS LAB IS EXTRA CREDIT

// Lab Chapter 8 - #10  TwoToTen    2018

// Uses files TwoToTenRunner.java and TwoToTen.java


public class TwoToTenRunner
{
	public static void main ( String[] args )
	{

		out.println("Lab Chapter 8 - #10 (EXTRA CREDIT)  TwoToTen    2018");
		out.println();
		out.println();

		// ***** fill in your name
		out.println("My name is Neo Wang");
		out.println();
		out.println();


		// add test cases

		TwoToTen test = new TwoToTen("1010");
    System.out.println(test);

    test.setTwo(1100 + "");
    System.out.println(test);

    test.setTwo(1110 + "");
    System.out.println(test);

    test.setTwo(1111 + "");
    System.out.println(test);

    test.setTwo(11111 + "");
    System.out.println(test);

    test.setTwo(111111 + "");
    System.out.println(test);

    test.setTwo(1110101 + "");
    System.out.println(test);

    test.setTwo("10101010101");
    System.out.println(test);

    test.setTwo("1010101010110");
    System.out.println(test);

    test.setTwo("111111111111111111");
    System.out.println(test);
	}
}
