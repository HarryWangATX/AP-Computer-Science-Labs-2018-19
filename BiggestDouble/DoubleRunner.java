//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

// Lab Chapter 10 - #2  BiggestDouble    2018-2019


public class DoubleRunner
{
    public static void main(String[] args)
    {
        out.println("Lab Chapter 10 - #2  BiggestDouble    2018-2019");
        out.println();
        out.println();
        // fill in your name
        out.println("My name is Neo Wang");
        out.println();



        BiggestDouble run = new BiggestDouble(4.5,6.7,7.8,9.0);
        System.out.println(run);  // calls toString()

        run.setDoubles(14.51,6.17,71.8,1);
        System.out.println(run);

        run.setDoubles(41.15,816.7,17.8,19);
        System.out.println(run);

        run.setDoubles(884.5,16.7,7.8,9);
        System.out.println(run);

        run.setDoubles(4.5,-456.7,667.8,9.0);
        System.out.println(run);

        run.setDoubles(4.5,16.7,-7.8,-9.0);
        System.out.println(run);

        //add more test cases - use your set method

    }
}
