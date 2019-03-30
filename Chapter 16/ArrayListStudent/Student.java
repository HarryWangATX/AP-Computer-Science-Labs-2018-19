
import java.util.*;

// FIND ALL OF THE FINISH ME comments
// and add the necessary code

public class Student
{
	String name;
	String id;
	String age;
	ArrayList <Integer> grades;

	public Student(String theName, String theId, String theAge,
	               ArrayList<Integer> theGrades)
	{
		name = theName;
		grades = theGrades;
    id = theId;
    age = theAge;
    grades = theGrades;
	}


	public String getName()
	{

		return name;  // replace me
	}

	public String getId()
	{
	 	// FINISH ME

		return id;  // replace me
	}

	public String getAge()
	{
	 	// FINISH ME

		return age;  // replace me
	}


	// finds the sum of grades
	public int getSum()
	{
		// FINISH ME

		int sum = 0;

    for(int a : grades)
    {
      sum += a;
    }

    return sum;
	}


	// finds the average of grades
	public double getAverage()
	{
		// FINISH ME

		return (getSum()+0.0)/grades.size();  // replace me
	}


	// finds the higest grade of grades
	public int getHighestGrade()
	{
		// FINISH ME
    int highestGrade = 0;

    for(int a : grades)
    {
      if(a > highestGrade)
      {
        highestGrade = a;
      }
    }


		return highestGrade;  // replace me
	}


	// finds the lowest grade of grades
	public int getLowestGrade()
	{
		// FINISH ME
    int lowestGrade = Integer.MAX_VALUE;
    for(int a : grades)
    {
      if(a < lowestGrade)
      {
        lowestGrade = a;
      }
    }

		return lowestGrade;  // replace me
	}


	// finds the difference of the highest and lowest grade
	public int getRange()
	{
		// FINISH ME

		return getHighestGrade() - getLowestGrade();  // replace me
	}


	// finds the number of val grades found in grades
	// for example if val is 100, it would count the
	//     number of times 100 appears in the list grades
	public int getCountOf(int val)
	{
		// FINISH ME
    int count = 0;

    for(int a : grades)
    {
      if(a == val)
      {
        count++;
      }
    }

		return count;  // replace me
	}


	// finds the number of grades greater than or equal to val
	public int getNumGTE(int val)
	{
    int count = 0;

    for(int a : grades)
    {
      if(a >= val)
      {
        count++;
      }
    }

		return count;  // replace me
	}

	// finds the number of grades less than val
	public int getNumLT(int val)
	{
    int count = 0;

    for(int a : grades)
    {
      if(a < val)
      {
        count++;
      }
    }

		return count;  // replace me
	}

	public String getGradeList()
	{
		String output = "";

  	for(int a : grades)
    {
      output = output + a + " ";
    }
		return output;
	}


}  // end of class Student
