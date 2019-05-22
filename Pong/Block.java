//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 2019
//Class -
//Lab  -

// FINISH THIS CODE - COMPLETE THIS FILE FIRST

// Ball.java and Paddle.java will inherit from this class
// Remember that these methods can be called from the subclasses

// Make sure that you compile this when you make your changes


import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int x;
	private int y;
	private int width;
	private int height;

	private Color color;

	public Block()
	{
		// set all variables to meaningful default values
		// use this to call the appropriate constructor
		this(300,300,10,10,defaultBlockColor);
	}

	//add other Block constructors - x , y , width, height, color
	public Block (int x, int y)
	{
		// call a constructor to init your instance variables
		this(x,y,10,10,defaultBlockColor);
	}

	public Block (int x, int y, int width, int height)
	{
		// call a constructor to init your instance variables
		// use this(.....);

		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public Block (int x, int y, int width, int height, Color color)
	{
		// use this.x  = x;  etc. since the parameter names are the same as the instance variables
		// this.x refers to the instance variable x
		// set all of your instance variables here
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.color = color;
	}


   // since we have a implements Locatable, we need to write all of the methods in
   // the Locatable interface
   // you will do it right here !!!!!!!!!!!!!!!
   // copy and paste the headings of the methods from the Locatable
   // interface here. Take away the word abstract and the ;
   // complete the code for the method (make it concrete!)

   // the first one (setColor) is done for you
   public void setColor(Color color)
   {
   		// the keyword this allows you to refer to the
   		// instance variable color
   		// where as color refers to the parameter variable
		this.color = color;
   }

	 public void setWidth(int width)
	 {
		 this.width = width;
	 }

	 public int getWidth()
	 {
		 return this.width;
	 }

	 public int getY()
	 {
		 return this.y;
	 }

	 public void setPos(int x, int y)
	 {
		 this.x = x;
		 this.y = y;
	 }

	 public Color getColor()
	 {
		 return this.color;
	 }

	 public void setY(int y)
	 {
		 this.y = y;
	 }

	 public int getX()
	 {
		 return this.x;
	 }

	 public void setX(int x)
	 {
		 this.x = x;
	 }

	 public void setHeight(int height)
	 {
		 this.height = height;
	 }

	 public int getHeight()
	 {
		 return this.height;
	 }



   public void draw(Graphics window)
   {
      window.setColor(color);
      window.fillRect(x, y, width, height);
   }

   public void draw(Graphics window, Color col)
   {
      window.setColor(col);
      window.fillRect(x, y, width, height);
   }

	public boolean equals(Object obj)
	{
		Block other = (Block) obj;

		// two block objects are considered equal if all
		// of their attributes (instance variables or properties or fields)
		// are the same
		// if (getX()==other.getX() && etc.

		return false;
	}


   //add a toString() method  - return x , y , width, height, color


}
