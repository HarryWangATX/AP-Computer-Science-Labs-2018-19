import java.util.*; // for Scanner from Java 1.5, 1.6, etc., and ArrayList
import java.io.*;   // for file input
import static java.lang.System.*; // so that you don't have to do System.

public class PostOffice
{
  static // no instance variables are needed
 double total = 0.0;
  static String lines1 = "";
 
 public static void main(String[] args) throws IOException
 {

  // FINISH ME
  // print out your name


  // FINISH ME
  // Create a Scanner object that reads in the data file   
  File text = new File("postoffice.dat");
  Scanner input = new Scanner(text); // reads in the data file  
   

  // FINISH ME
  // Read in the first line from the file and convert it to an int.
  // This number is the number of data sets in the file.
  // int lines = ????.??????();
  
  int lines = input.nextInt();
  input.nextLine(); // this moves the cursor to the next line in the file
    
  
  // You will now need a loop to loop through all the 
  // lines one by one and see if the sum of the weights are OK
  // OK  or  OVERWEIGHT
  
  for (int i=0; i<lines; i++)
  {
   // You will need another loop to loop through the weights and 
   // find the total sum of all the weights on this line.
   // Once you have found the total weight for all of the packages
   // on a line, you will need to check to see if the weight is
   // OK or OVERWEIGHT. 
   
   
    for(int j = 0; j<7; j ++) {
     //lines1 = input.nextLine();
     total += input.nextDouble();
     
    }
    
    if(total>5.0) {
     System.out.println("OVERWEIGHT");
    }
    else {
     System.out.println("OK");
    }
   
    total = 0.0;
   input.nextLine(); // moves the file cursor to the next line
  }
  
  
  
   
  input.close();

 } // end of main method

} // end of class




/*Example Output to Screen
========================
OVERWEIGHT
OK
OVERWEIGHT  
*/


