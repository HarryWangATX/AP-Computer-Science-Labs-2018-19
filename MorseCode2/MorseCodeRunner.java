package com.company;// Lab Chapter 6 Set 1, Lab 9
// MorseCodeRunner.java and MorseCode.java

// FINISH ME
// Name: Your full name goes here

public class MorseCodeRunner
{

    public static void main( String args[] )
    {
        System.out.println("Morse Code");
        System.out.println(); // prints a blank line
        System.out.println(); // prints a blank line

        // FINISH ME
        System.out.println("Chapter 6 - Set 1 Lab 9  Written by xxxxx xxxxx");
        System.out.println(); // prints a blank line
        System.out.println(); // prints a blank line

        // FINISH ME
        // Since, getMorseCode is a static method and is loaded into
        // RAM memory when you start the program, we can call it by
        // using the   name of the class.getMorseCode(??)
        // The name of the class is MorseCode and the method is 
        // getMorseCode( some String with a letter)
        MorseCode s = new MorseCode();
        System.out.println(s.toString('a'));
        System.out.println(s.toString('b'));
        System.out.println(s.toString('3'));
        System.out.println(s.toString('z'));
        System.out.println(s.toString('8'));



        // add test cases 

    }

}

/*
Sample Data :  
A 
B 
3 
Z 
8 
F 
0 
 
 
Sample Output :  

A is . - in morse! 
 
B is - . . . in morse! 
 
3 is . . . - - in morse! 
  
Z is - - . . in morse! 
 
8 is - - - . . in morse! 
 
F is . . - . in morse! 

0 is - - - - - in morse! 

*/