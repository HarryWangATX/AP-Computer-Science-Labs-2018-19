package com.company;//© A+ Computer Science  -  www.apluscompsci.com
import java.util.HashMap;
//Name -
//Date -
//Class -
//Lab  -

public class MorseCode
{

    public String getMorseCode(char a)
    {
        HashMap<Character, String> morseCode = new HashMap<> (  );
        morseCode.put ( 'a' ,".-");
        morseCode.put ( 'b' ,"-...");
        morseCode.put ( 'c' ,"-.-.");
        morseCode.put ( 'd' ,"-..");
        morseCode.put ( 'e' ,".");
        morseCode.put ( 'f' ,"..-.");
        morseCode.put ( 'g' ,"--.");
        morseCode.put ( 'h' ,"....");
        morseCode.put ( 'i' ,"..");
        morseCode.put ( 'j' ,".---");
        morseCode.put ( 'k' ,"-.-");
        morseCode.put ( 'l' ,".-..");
        morseCode.put ( 'm' ,"--");
        morseCode.put ( 'n' ,"-.");
        morseCode.put ( 'o' ,"---");
        morseCode.put ( 'p' ,".---.");
        morseCode.put ( 'q' ,"--.-");
        morseCode.put ( 'r' ,".-.");
        morseCode.put ( 's' ,"...");
        morseCode.put ( 't' ,"-");
        morseCode.put ( 'u' ,"..-");
        morseCode.put ( 'v' ,"...-");
        morseCode.put ( 'w' ,".--");
        morseCode.put ( 'x' ,"-..-");
        morseCode.put ( 'y' ,"-.--");
        morseCode.put ( 'z' ,"--..");
        morseCode.put ( '1' ,".----");
        morseCode.put ( '2' ,"..---");
        morseCode.put ( '3' ,"...--");
        morseCode.put ( '4' ,"....-");
        morseCode.put ( '5' ,".....");
        morseCode.put ( '6' ,"-....");
        morseCode.put ( '7' ,"--...");
        morseCode.put ( '8' ,"---..");
        morseCode.put ( '9' ,"----.");
        morseCode.put ( '0' ,"-----");
        morseCode.put ( ',' ,"--..--");
        morseCode.put ( '.' ,".-.-.-");
        morseCode.put ( '?' ,"..--..");



        return morseCode.get ( a );
    }

    public String toString(char a)
    {
        // this method has been completed for you
        return a + " is " + getMorseCode(a) + " in morse!";
    }
}