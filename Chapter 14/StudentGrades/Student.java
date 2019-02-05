//© A+ Computer Science  -  www.apluscompsci.com - 2019
//Name -
//Date -
//Class -
//Lab  -

// HINT: Draw a picture of a Student object to help you see it better.
//       Think about how you would refer to instance variables and methods.
//       You have to know your instance variables and methods.
//       For example:
//       How do you refer to the grade in the zero position? (Answer: grades[0])
//       How do you refer to the grade in the one position?  (Answer: grades[1])
//       How do you refer to the number of grades in the list?  (Answer: grades.length)




//  =======================================
//  ||                                   ||
//  ||  name                             ||
//  ||  ------------------               ||
//  || | Tom             |               ||
//  || -------------------               ||
//  ||                                   ||
//  || grades                            ||
//  ||    0    1    2    3    4    5     ||
//  || --------------------------------  ||
//  || | 72 | 85 | 63 | 77 | 54 | 42  |  ||
//  || --------------------------------  ||
//  ||                                   ||
//  ||                                   ||
//  || public Student(...)               ||
//  || --------------------------------  ||
//  || | code not shown               |  ||
//  || --------------------------------  ||
//  ||                                   ||
//  ||                                   ||
//  || public double getAverage()        ||
//  || --------------------------------  ||
//  || | code not shown               |  ||
//  || --------------------------------  ||
//  ||                                   ||
//  ||                                   ||
//  || public String toString()          ||
//  || --------------------------------  ||
//  || | code not shown               |  ||
//  || --------------------------------  ||
//  ||                                   ||
//  ||                                   ||
//  =======================================



public class Student
{
	// instance variables to hold the name and grades
	// name should be of the type String
	// grades should be of the type int []
	// remember to mark your instance variables as private

	private String  name;
	int[] grades;


	// initializer constructor
	// Remember that constructors should generally have public access
	// Also, constructors should have the same name as the class and no return value
	public Student(String theName, int [] theGrades)
	{
		// assign the incoming values to the instance variables

    name = theName;
    grades = theGrades;

	} // remember, the parameters will be destroyed at this point



	public double getAverage()
	{
		// find the average and return it
		double sum = 0;

		for (int i=0; i<grades.length; i++)
		{
			// add the ith grade to the sum
			sum += grades[i];
		}

		return (sum + 0.0)/grades.length;  // return the average
	}



	// toString() method
	// this method should return the list of numbers
	public String toString()
	{
		String output = name + "\n";

		output += "[";

		for (int i=0; i<grades.length; i++)
		{
			// join or concatenate the ith grade to the output
			if (i < grades.length-1)
				output += grades[i] + ", ";
			else
				output += grades[i];
		}

		output += "]";
		output += "\n";


		// call the getAverage method
		output += getAverage() + "\n";


		return output;
	}



}
