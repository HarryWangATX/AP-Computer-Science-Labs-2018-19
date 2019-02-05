//© A+ Computer Science  -  www.apluscompsci.com - 2019
//Name -
//Date -
//Class -
//Lab  - THIS IS AN EXTRA CREDIT LAB

import static java.lang.System.*;
import java.util.Arrays;

public class RomanNumeral
{
	private Integer number;
	private String roman;



	public RomanNumeral(String str)
	{
    roman = str;
	}

	public RomanNumeral(Integer orig)
	{
    number = orig;
	}

	public void setNumber(Integer num)
	{
    number = num;
	}

	public void setRoman(String rom)
	{
    roman = rom;
	}

	public Integer getNumber()
	{
    return romanToDecimal(roman);
	}

  public int value(char r)
    {
        if (r == 'I')
            return 1;
        if (r == 'V')
            return 5;
        if (r == 'X')
            return 10;
        if (r == 'L')
            return 50;
        if (r == 'C')
            return 100;
        if (r == 'D')
            return 500;
        if (r == 'M')
            return 1000;
        return -1;
    }

    // Finds decimal value of a given romal numeral
  public int romanToDecimal(String str)
  {
      // Initialize result
      int res = 0;

      for (int i=0; i<str.length(); i++)
      {
          // Getting value of symbol s[i]
          int s1 = value(str.charAt(i));

          // Getting value of symbol s[i+1]
          if (i+1 <str.length())
          {
              int s2 = value(str.charAt(i+1));

              // Comparing both values
              if (s1 >= s2)
              {
                  // Value of current symbol is greater
                  // or equalto the next symbol
                  res = res + s1;
              }
              else
              {
                  res = res + s2 - s1;
                  i++; // Value of current symbol is
                  // less than the next symbol
              }
          }
          else
          {
              res = res + s1;
              i++;
          }
      }

      return res;
  }

  public String integerToRomanNumeral(int input) {
    if (input < 1 || input > 3999)
        return "Invalid Roman Number Value";
    String s = "";
    while (input >= 1000) {
        s += "M";
        input -= 1000;        }
    while (input >= 900) {
        s += "CM";
        input -= 900;
    }
    while (input >= 500) {
        s += "D";
        input -= 500;
    }
    while (input >= 400) {
        s += "CD";
        input -= 400;
    }
    while (input >= 100) {
        s += "C";
        input -= 100;
    }
    while (input >= 90) {
        s += "XC";
        input -= 90;
    }
    while (input >= 50) {
        s += "L";
        input -= 50;
    }
    while (input >= 40) {
        s += "XL";
        input -= 40;
    }
    while (input >= 10) {
        s += "X";
        input -= 10;
    }
    while (input >= 9) {
        s += "IX";
        input -= 9;
    }
    while (input >= 5) {
        s += "V";
        input -= 5;
    }
    while (input >= 4) {
        s += "IV";
        input -= 4;
    }
    while (input >= 1) {
        s += "I";
        input -= 1;
    }
    return s;
}

	public String toString()
	{
    return integerToRomanNumeral(number);
	}
}
