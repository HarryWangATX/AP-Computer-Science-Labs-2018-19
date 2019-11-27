import java.util.*; // for Scanner from Java 1.5, 1.6, etc., and ArrayList
import java.io.*;   // for file input
import static java.lang.System.*; // so that you don't have to do System.

// NOTE: reading from a file is almost like reading from the keyboard
//       use methods nextLine(), nextInt()

public class ValidPhoneNumber
{
 // no instance variables are needed
 
 
 public static void main(String[] args) throws IOException
 {

  // print out your name


  // this loads the file ValidPhoneNumber.dat into the Scanner object called input 
  File text = new File("ValidPhoneNumber.dat");
  Scanner input = new Scanner(text); // reads in the data file  
   

  
  // FINISH ME
  // read in the first line from the file and convert it to an int
  // this number is the number of data sets in the file
  // int lines = ????.??????();
  
  int lines = input.nextInt();
  input.nextLine(); // this moves the cursor to the next line in the file
  
  // We will need a variable to store the new String
  // It will not contain any characters to start
  // String phoneNumber = ???;
  
  String phoneNumber = "";  
  // you will now need a loop to loop through all the 
  // lines one by one and see if the potential phone number is
  // Valid or Invalid.
  // FINISH ME
  // 
  for (int i=0; i<lines; i++)
  {
      // FINISH ME
      // read in the potential phone number (use input.????)
   phoneNumber = input.next();
   
   
      // check the number of characters
   if (phoneNumber.length() == 14) // If it has 12 characters, it might be valid
   {
       // FINISH ME
    // see if it is valid and if so print out "Valid"
       // else print "Invalid"
       if((phoneNumber.indexOf("-")==5 && phoneNumber.lastIndexOf("-")==9) && (phoneNumber.indexOf("(")== 0 && phoneNumber.indexOf(")")==4)) {
        out.println("Valid");
       }
       else {
        out.println("Invalid");
       }
       
       
   }
   else if (phoneNumber.length() == 12) // it might be valid
   {
       // FINISH ME
    // see if it is valid and if so print out "Valid"
       // else print "Invalid"

    if((phoneNumber.indexOf("-")==3 && phoneNumber.lastIndexOf("-")==7)) {
        out.println("Valid");
       }
       else {
        out.println("Invalid");
       }
   }
   else
   {
    // It is invalid
    // print out "Invalid"
    out.println("Invalid");
    
   }
      
         
  
  
  }
  
  
  
   
  input.close();

 } // end of main method

} // end of class





/*Example Output to Screen
========================
Invalid
Valid
Valid
Invalid
Invalid
Invalid
*/

