//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*; public class StringEquality { private String wordOne, wordTwo; public StringEquality(){} public StringEquality(String one, String two) { wordOne = one; wordTwo = two; } public void setWords(String one, String two) { wordOne = one; wordTwo = two; } public boolean checkEquality( ) { if(wordOne.equals(wordTwo)) { return true; } return false; } public String toString() { if(checkEquality()) { return wordOne + " has the SAME letters as " + wordTwo; } else { return wordOne + " has DIFFERENT letters as " + wordTwo; }}}
