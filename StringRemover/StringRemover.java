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
    super();
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
    char[] stilpYoov = remove.toCharArray();
    String cleaned = sentence;

    for(char a : stilpYoov)
    {
      String replace = a+"";

      cleaned = cleaned.replaceAll(replace,"");
      cleaned = cleaned.replaceAll((char)((int)a - 1) + "", "");
    }

		return cleaned;
	}

	public String toString()
	{
		return removeStrings();
	}
}
