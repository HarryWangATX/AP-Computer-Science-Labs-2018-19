//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

// the static import statement allows us to use
// out.println(...);  and out.print(...);
// instead of using  System.out.println(...);

import static java.lang.System.*;

public class StarsAndStripes
{

   // this is your default constructor
   // it gets called when you create the class in the
   // main program
   public StarsAndStripes()
   {
   	  out.println("Neo Wang       APCS 2018");
   	  out.println();
   	  out.println();
      out.println("StarsAndStripes Initialized");
      printTwoBlankLines();
   }


   public void printTwentyStars()
   {
   	for(int i = 0; i < 20; i++)
    {
      out.print("*");
    }
    out.println();
   }

   public void printTwentyDashes()
   {
   	// write a println statement that prints 20 dashes -
   	for(int i = 0; i < 20; i++)
    {
      out.print("-");
    }
    out.println();
   }

   public void printTwoBlankLines()
   {
   	out.println();
    out.println();
   }

   public void printOneLayer()
   {
     printTwentyDashes();
     printTwentyStars();
   }

   public void printASmallBox()
   {
   	// print the small box
   	// call the methods above
   	printOneLayer();
    printOneLayer();
    printOneLayer();
    printTwentyDashes();

   }

   public void printABigBox()
   {
   	// print the big box
   	// call the methods above

    for(int i = 0; i < 3; i++)
    {
      printOneLayer();
    }

    printTwentyDashes();

    for(int i = 0; i < 3; i++)
    {
      printOneLayer();
    }

    printTwentyDashes();
   }


}  // end of class StarsAndStripes
