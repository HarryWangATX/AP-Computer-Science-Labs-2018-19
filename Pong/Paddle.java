//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -


// FINISH THIS CODE

// Make sure that you compile this when you make your changes


import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;

   public Paddle()
   {
		super(10,10);
      	speed =5;
   }

	public Paddle(int x, int y)
	{
		// initialize your super variables in the Block portion of your object
		super(x,y);
		// now set your speed to the default value
		this.speed = 5;
	}

	public Paddle(int x, int y, int width, int height)
	{
		// initialize your super variables in the Block portion of your object
		super(x,y,width,height);
		// now set your speed to the default value
		this.speed = 5;
	}

	public Paddle(int x, int y, int width, int height, Color color)
	{
		// initialize your super variables in the Block portion of your object
		// now set your speed to the default value

    super(x,y,width,height);

    this.speed = 5;
    super.setColor(color);
	}

	public Paddle(int x, int y, int width, int height, Color color, int speed)
	{
		// initialize your super variables in the Block portion of your object

		// now set your speed to the default value

    super(x,y,width,height);

    this.speed = 5;
    super.setColor(color);
    this.speed = speed;
	}




   public void moveUpAndDraw(Graphics window)
   {
   		// look how this was done in Ball

   		// call your draw method and draw a white paddle
   		// to erase your current paddle

		// change your y value (call getY() and setY())

		// now call your draw method

    draw(window,Color.WHITE);

      // change your x and y variables
      setY(getY()+speed);

   }

   public void moveDownAndDraw(Graphics window)
   {
   		// call your draw method and draw a white paddle
   		// to erase your current paddle

		// change your y value (call getY() and setY())

        draw(window,Color.WHITE);

          // change your x and y variables
          setY(getY()-speed);
		// now call your draw method

   }

   public int speed()
   {
     return this.speed;
   }

   public void setSpeed(int speed)
   {
     this.speed = speed;
   }

   public String toString()
   {
     return super.toString() + " " + speed;
   }

   public void setWidth()
   {
     
   }

   // add a get method for speed
   // add a set method for speed
   // DO NOT REWRITE getX(), setX(), etc.
   // you did those in the Block class and you inherited them


   // add a toString() method

}
