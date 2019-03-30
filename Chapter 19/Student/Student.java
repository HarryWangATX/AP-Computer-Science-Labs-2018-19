
import static java.lang.System.*;
import java.util.ArrayList;


// implements Comparable means that we have
// to write a compareTo() method that will receive
// an object.

// All classes extend the Object class by default

// NOTICE: a Student  IS A  Person
// We get all of Person and whatever we want to add

class Student extends Person implements Comparable
{
	// add an instance variable called
	// grades, which is an ArrayList<Integer>

	ArrayList<Integer> grades = new ArrayList<Integer>();

	public Student(String name, String id, ArrayList<Integer> reference)
	{
		super(name,id);

		grades = reference;
	}
	// write an init constructor
	// you should have parameters to receive
	//    the name, id, and an ArrayList<Integer> reference
	//    in that order
	// call super(name, id);  to initialize the Person part
	// the call to super MUST be the first line of code
	// what do you need to do to grades?





	// *******  MODIFIERS (setter methods)

	// write a setGrades() method

	public void setGrades(ArrayList<Integer> grades)
	{
		this.grades = grades;
	}





	// *******  ACCESSORS (getter methods)


	// write a getGrades() method

	public ArrayList<Integer> getGrades()
	{
		return grades;
	}




	// write a method to find the sum of the grades
	// public int getSum()

	public int getSum()
	{
		int count = 0;
		for(int a : grades)
		{
			count += a;
		}

		return count;
	}




	// write a method to find the average of the grades
	// public double getAverage()

	public double getAverage()
	{
		return (getSum() + 0.0)/(grades.size());
	}




	// we will override the equals method which is defined
	// in the super class
	// two Student objects will be considered equal if
	// their names are the same

	public boolean equals( Object obj)
	{
		Student other = (Student) obj; // cast obj as a Student

		if(other.getName() == this.getName())
		{
			return true;
		}
		return false;
	}


	// this method was declared in the
	// comparable interface!  We must write it
	// compare this student's average to the
	//    other student's average
	public int compareTo(Object obj)
	{
		Student other = (Student) obj; // cast obj as a Student


		// we should return -1 if this Student is less
		// than the other Student

		if(other.getAverage() < this.getAverage())
		{
			return 1;
		}
		if(other.getAverage() > this.getAverage())
		{
			return -1;
		}
		return 0;
	}

	public String toString()
	{
		return super.toString() + " " + grades;
	}


	// write a toString() method that returns
	// the Student's name followed by a space
	// followed by the Student's id, followed by
	// the Student's list of grades
	// call super.toString() to get the Person part
	//    and then grades.toString() to get the grades






}
