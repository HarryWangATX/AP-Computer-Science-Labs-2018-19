import static java.lang.System.*;
import java.util.*;

// Lab Chapters 19-20 - #3  Student    2019

// Uses files StudentRunner.java and Student.java and Person.java


public class StudentRunner
{
	public static void main( String args[] )
	{
		System.out.println("Lab Chapter 19-20 - #3  Student    2019");
		System.out.println();
		System.out.println();

		// ***** fill in your name
		System.out.println("My name is Neo Wang");
		System.out.println();
		System.out.println();


		// *** the main program has been done for you


		ArrayList<Student> students = new ArrayList<Student>();

		ArrayList<Integer> grades = new ArrayList<Integer>();
		grades.add(90);
		grades.add(98);
		grades.add(94);
		grades.add(95);
		Student student = new Student("Tom","34563", grades);
		students.add(student);


		grades = new ArrayList<Integer>();
		grades.add(100);
		grades.add(99);
		grades.add(97);
		grades.add(98);
		student = new Student("Mars","34782",grades);
		student.setName("Mary");
		student.setId("34888");
		students.add(student);


		grades = new ArrayList<Integer>();
		grades.add(80);
		grades.add(89);
		grades.add(92);
		grades.add(95);
		student = new Student("Bill","34999",grades);
		students.add(student);


		// in order to use Collections.sort()
		// the Student class has to implement the
		// comparable interface

		Collections.sort(students);

		System.out.println(students.toString());



	}
}
