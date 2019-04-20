public class InheritanceTest
{
  public static void main(String[] args) {
    One stilp = new Two();
    stilp.print();
    stilp.getRekt();
    }
}

class One
{
  private String x = "stilp";
  private String y = x;

  public One()
  {
    x = "";
  }

  public One(String a)
  {
    x = a;
  }

  public void print()
  {
    System.out.print(x + " " + y);
  }
}

class Two extends One
{
  private String z = "nut";

  public Two()
  {
    super();
  }

  public void print()
  {
    System.out.print("stilp stilp" + z);
  }

  public void getRekt()
  {
    System.out.print("HAHA GET REKT");
  }
}
