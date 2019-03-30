
import static java.lang.System.*;
import java.util.ArrayList;


// implements Comparable means that we have
// to write a compareTo() method that will receive
// an object.

// All classes extend the Object class by default
// the words "extends Object" are implied and Java adds for us if we don't type them

class Person extends Object implements Comparable
{
	// add two instance variables called
	// name (String)  and id (String)

	private String name;
	private String id;

	// write an initialization constructor
	// you should have parameters to receive the
	// name and the id (in that order)

	public Person()
	{
		name = "";
		id = "";
	}

	public Person(String n, String i)
	{
		name = n;
		id = i;
	}



	// *******  MODIFIERS (setter methods)

	// write a setName() method
	// you should have a parameter to receive a name for this Person

	public void setName(String a)
	{
		name = a;
	}


	// write a setId() method
	// you should have a parameter to receive an id for this Person

	public void setId(String a)
	{
		id = a;
	}



	// *******  ACCESSORS (getter methods)


	// write a getName() method
	// you will need to return a String
	// no parameters for a getter method

	public String getName()
	{
		return name;
	}

	public String getId()
	{
		return id;
	}








	// write a getId() method
	// you will need to return a String
	// no parameters for a getter method






	// we will override the equals method which is defined
	// in the Object class
	// this person should be considered equal to the
	// other person if their names are the same
	// Look at the Cat class for help

	@Override
	public boolean equals( Object obj)
	{
		Person other = (Person) obj;

		if(name == other.getName() && id == other.getId())
		{
			return true;
		}


		return false;
	}


	// this method was declared in the
	// comparable interface!  We must write it
	// Look at the Cat class for help
	public int compareTo(Object obj)
	{
		Person other = (Person) obj; // since we received the obj as an Object, we cast it as a Person

		if(this.getName().compareTo(other.getName()) < 0)
		{
			return -1;
		}
		else if(this.getName().compareTo(other.getName()) > 0)
		{
			return 1;
		}
		// we should return -1 if this Person is less
		// than the other Person (compare their names)
		// if (getName().compareTo(other.getName()) < 0)
		//     return -1;


		// we should return 1 if this Person is greater
		// than the other Person



		// we should return 0 if this Person is equal to
		// the other Person (names are the same)

		return 0;
	}

	@Override
	public String toString()
	{
		return name + " " + id;
	}


	// write a toString() method that returns
	// the Person's name followed by a space
	// followed by the Person's id






}
