// Complete this class first

import java.awt.Color;

public abstract class AbstractShapeObject implements ShapeInterface
{
	private int x;
	private int y;
	private int width;
	private int height;
	private Color color;
	private int thickness;
	private String mode;   // Am I a Rectangle, Line, etc.?
	private boolean keep;  // do I keep the shape or erase it later?

    public AbstractShapeObject()
    {
    	// using this calls our own constructor
    	// notice how we fill in missing values with default values from the interface
    	this(0,0,0,0,defaultThickness,defaultColor);
    }

    public AbstractShapeObject(int x, int y)
    {
    	this(x,y,defaultWidth,defaultHeight,defaultThickness,defaultColor);
    }

    public AbstractShapeObject(int x, int y, int width, int height)
    {
    	this(x,y,width,height,defaultThickness,defaultColor);
    }

    public AbstractShapeObject(int x, int y, int width, int height, Color color)
    {
    	this(x,y,width,height,defaultThickness, color);
    }

    public AbstractShapeObject(int x, int y, int width, int height, int thickness)
    {
    	this(x,y,width,height,thickness, defaultColor);
    }

    public AbstractShapeObject(int x, int y, int width, int height, int thickness, Color color)
    {
    	this.x = x;
    	this.y = y;
    	this.width = width;
    	this.height = height;
    	this.color = color;
    	this.thickness = thickness;
    	mode = "None";
    	keep = true;
    }

	// complete all of your getter and setter methods here !!!
	// do NOT write your draw methods here
	// you will write your draw methods in the specific classes



	public int getX()
	{
		return this.x;
	}

	public void setX(int x)
	{
		this.x = x;
	}

	public int getY()
	{
		return this.y;
	}

	public void setY(int y)
	{
		this.y = y;
	}

	public int getWidth()
	{
		return this.width;
	}

	public void setWidth(int width)
	{
		this.width = width;
	}

	public int getHeight()
	{
		return this.height;
	}

	public void setHeight(int height)
	{
		this.height = height;
	}

	public int getThickness()
	{
		return this.thickness;
	}

	public void setThickness(int thickness)
	{
		this.thickness = thickness;
	}

	public Color getColor()
	{
		return this.color;			// change me - this is a place holder
	}

	public void setColor(Color color)
	{
		this.color = color;
	}

	public String getMode()
	{
		return this.mode;
	}

	public void setMode(String mode)
	{
		this.mode = mode;
	}

	public boolean getKeep()
	{
		return this.keep;
	}

	public void setKeep(boolean keep)
	{
		this.keep = keep;
	}

	public void calcXYWidthHeight(int x1, int y1, int x2, int y2)
	{
		int width = Math.abs(x2-x1);
		int height = Math.abs(y2-y1);

		// now I need to find my upper left corner point

		// find the x1 value (this is done for you)
		if (x2 <= x1)
		{
			x1 = x2;
		}

		// find the y1 value (this is done for you)
		if (y2 <= y1)  // they have dragged the mouse up
		{
			y1 = y2;
		}

		// now set the instance variables of the class
		setX(x1);
		setY(y1);
		setWidth(width);
		setHeight(height);
		// Finish Me
		// call the rest of your set methods here
	}

}
