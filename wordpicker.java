import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;

public class wordpicker
{
  public static void main(String[] args) throws Exception {
    Scanner yav = new Scanner(new File("wordpicker.dat"));

    String output = "";
    String next;

    ArrayList<String> penis = new ArrayList<String>();

    while(yav.hasNextLine())
    {
      next = yav.nextLine();
      if((!next.toLowerCase().equals("game elements"))&&(!next.toLowerCase().equals("teams"))&&(!next.toLowerCase().equals("hardware"))&&(!next.toLowerCase().equals("software"))&&(!next.toLowerCase().equals("ftc-related other"))&&(!next.toLowerCase().equals("other")))
      {
        output += next + ", ";
        penis.add(next);
      }
      else
      {

      }
    }

    System.out.println(output);
    System.out.println(penis.get(((int)(Math.random() * penis.size()) + 1)));
  }
}
