//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Integer.*;
import static java.lang.System.*;

public class ExpressionSolver
{
	String expressionAsString;
	ArrayList <String> expression;


	// s will contain an expression  Example: "3 + 5"
	// we will take each element and put it into an ArrayList
	public ExpressionSolver(String s)
	{
    System.out.println(s);
		expressionAsString = s; // we save the expression

		expression = new ArrayList<String>();

		// create a Scanner object and pass it s
		Scanner scan = new Scanner(s);


		// add each element to the expression list
		while (scan.hasNext())  // while the Scanner has a next element we keep going
		{
			String element = scan.next();  // we get the next element

			expression.add(element);  // we add the element to our expression ArrayList

		}



	}



	public void setExpression(String s)
	{
    System.out.println(s);
		expressionAsString = s; // we save the expression

		expression.clear();  // clear out the elements

		// create a Scanner object and pass it s
		Scanner scan = new Scanner(s);


		// add each element to the expression list
		while (scan.hasNext())  // while the Scanner has a next element we keep going
		{
			String element = scan.next();  // we get the next element

			expression.add(element);  // we add the element to our expression ArrayList

		}
	}


	public void handleMultiplicationAndDivision()
	{
		// YOU MUST USE AN INDEX BASED LOOP, not the for each loop since we are modifying the elements


		// we will loop through the list and do any *,/, or % operators

		for (int i=0; i<expression.size()-1;   ) // DO NOT INCREMENT i here
		{

			// get the first number as a String and convert it to an int
			String numAsString = expression.get(i);
			int num1 = Integer.parseInt(numAsString);

			// get the operator
			String operator = expression.get(i+1);

			// get the second number as a String and convert it to an int
			numAsString = expression.get(i+2);
			int num2 = Integer.parseInt(numAsString);


			// start of  *, /, or % operator *****************************
			if (operator.equals("*") || operator.equals("/") || operator.equals("%"))
			{
				// do the math and get the answer

				int answer = 0;

				if (operator.equals("*"))
				{
					answer = num1 * num2;
				}
        else if(operator.equals("/"))
        {
          answer = num1 / num2;
        }
        else if(operator.equals("%"))
        {
          answer = num1 % num2;
        }
				// else if ????



				// else if ????



				// now remove the i and i+1 elements from the expression
				expression.remove(i);
				expression.remove(i); // yes this should be i since the i+1 element moved down 1



				// now change the i+2 element which moved down into the i position
				expression.set(i, ""+answer); // yes this should be i

				// do not change i

			}
			else
			{
				//                  i
				// move i past the num operator1  (example: num operator1 num operator2
				i = i + 2;
			}

		} // end of for loop that handles *, /, and % operators

	}

	public void handleAdditionAndSubtraction()
	{
		// look at the above code and modify it for + and -

    for (int i=0; i<expression.size()-1;   ) // DO NOT INCREMENT i here
    {

      // get the first number as a String and convert it to an int
      String numAsString = expression.get(i);
      int num1 = Integer.parseInt(numAsString);

      // get the operator
      String operator = expression.get(i+1);

      // get the second number as a String and convert it to an int
      numAsString = expression.get(i+2);
      int num2 = Integer.parseInt(numAsString);


      // start of  *, /, or % operator *****************************
      if (operator.equals("+") || operator.equals("-"))
      {
        // do the math and get the answer

        int answer = 0;

        if (operator.equals("+"))
        {
          answer = num1 + num2;
        }
        else if(operator.equals("-"))
        {
          answer = num1 - num2;
        }
        // else if ????



        // else if ????



        // now remove the i and i+1 elements from the expression
        expression.remove(i);
        expression.remove(i); // yes this should be i since the i+1 element moved down 1



        // now change the i+2 element which moved down into the i position
        expression.set(i, ""+answer); // yes this should be i

        // do not change i

      }
      else
      {
        //                  i
        // move i past the num operator1  (example: num operator1 num operator2
        i = i + 2;
      }

    } // end of for loop that handles *, /, and % operators
	}


	public void solveExpression()
	{

		handleMultiplicationAndDivision();

		handleAdditionAndSubtraction();


	}



	public String toString( )
	{
		return expressionAsString + " = " + expression.get(0);
	}
}
