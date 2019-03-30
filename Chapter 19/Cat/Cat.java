
import static java.lang.System.*;
import java.util.ArrayList;

// Lab Chapter 19-20 - #1  Cat    2019

// Uses files CatRunner.java and Cat.java


// implements Comparable <Cat> means that we have
// to write a compareTo() method that will receive
// a Cat object.

// All classes extend the Object class by default

class Cat extends Object implements Comparable<Cat>
{
	// add two instance variables called
	// name (String)  and age (int)
	// mark them with private access

	private String name;
	private int age;


	// you are given the initialization constructor
	// we are using the this reference so that we do not get a shadowing error
	// typing name = name; is a shadowing error and a -1 on AP exam

	public Cat(String name, int age)
	{
		this.name = name; // this.name refers to the instance variable name
		this.age = age; // this.age refers to the instance variable age
	}


	// *******  MODIFIERS (setter methods)

	// write a setName() method

  public void setName(String name)
  {
    this.name = name;
  }

	// write a setAge() method

  public void setAge(int age)
  {
    this.age = age;
  }



	// *******  ACCESSORS (getter methods)


	// write a getName() method

  public String getName()
  {
    return this.name;
  }



	// write a getAge() method

  public int getAge()
  {
    return this.age;
  }




	// Override the equals method which is defined
	// in the Object class. Complete this method
	// See the back page of notes from Lesson 19 for an example
	public boolean equals( Object obj)
	{
    if(this.getName() == ((Cat)obj).getName() && this.getAge() == ((Cat)obj).getAge())
    {
      return true;
    }

		return false;
	}




	// this method was declared in the
	// Comparable interface!  We must write it!
	// compare by the age
	// See the back page of notes from Lesson 19 for an example
	public int compareTo(Cat other)
	{
		// we should return -1 if this cat age is less
		// than the other cat

    if(this.getAge() > other.getAge())
    {
      return 1;
    }
    else if(this.getAge() < other.getAge())
    {
      return -1;
    }


		// we should return 1 if this cat age is greater
		// than the other cat



		// we should return 0 if this cat age is equal to
		// the other cat

		return 0;
	}

  @Override
  public String toString()
  {
    return getName() + " " + getAge();
  }



	// write a toString() method that returns
	// the Cat's name followed by a space
	// followed by the Cat's age
	// return getName() + " " + getAge()






}
