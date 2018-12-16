//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
//EXTRA CREDIT
import static java.lang.System.*;

public class StringRemover
{
   private String sentence;
   private String remove;

	//add in default and initialization constructors

  public StringRemover()
  {
    sentence = "";
    remove = "";
  }

  public StringRemover(String a, String b)
  {
    sentence = a;
    remove = b;
  }

	public void setRemover(String s, String rem)
	{
    sentence = s;
    remove = rem;
	}

	public String removeStrings()
	{
    String cleaned = sentence;

    for(String a : getRemoveArray())
    {
      System.out.println("rart" + cleaned);
      cleaned.replaceAll(a, "");
    }
		return cleaned;
	}

	public String toString()
	{
		return removeStrings();
	}

  public String[] getRemoveArray()
  {
    String[] output = new String[remove.length()];
    for(int i = 0; i < remove.length(); i++)
    {
      output[i] = remove.charAt(i) + "";
    }
    return output;
  }
}
