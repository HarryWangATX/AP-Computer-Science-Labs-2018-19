// Complete this class last

import java.awt.*;
import java.awt.geom.*;

public class Line extends AbstractShapeObject
{
	int x2;
	int y2;

    public Line(int x1, int y1, int x2, int y2) {
    	super(x1,y1);  // use this pattern for the other constructors
    	this.x2 = x2;  // x2 and y2 have to be explicitly set in class Line
    	this.y2 = y2;  // because they only exist in class Line
    }

    public Line(int x1, int y1, int x2, int y2, Color color) {
			super(x1,y1);
			super.setColor(color);
			this.x2 = x2;  // x2 and y2 have to be explicitly set in class Line
    	this.y2 = y2;
    }

    public Line(int x1, int y1, int x2, int y2, int thickness) {
			super(x1,y1);
			super.setThickness(thickness);
			this.x2 = x2;  // x2 and y2 have to be explicitly set in class Line
    	this.y2 = y2;
    }

    public Line(int x1, int y1, int x2, int y2, int thickness, Color color) {
			super(x1,y1);
			super.setThickness(thickness);
			super.setColor(color);
			this.x2 = x2;  // x2 and y2 have to be explicitly set in class Line
    	this.y2 = y2;
    }


	public int getX1()
	{
		return getX();
	}

	public void setX1(int x)
	{
		setX(x);
	}

	public int getY1()
	{
		return getY();
	}

	public void setY1(int y)
	{
		setY(y);
	}

	public int getX2()
	{
		return this.x2;
	}

	public void setX2(int x2)
	{
		this.x2 = x2;
	}

	public int getY2()
	{
		return this.y2;
	}

	public void setY2(int y2)
	{
		this.y2 = y2;
	}

	public void draw(Graphics window)
	{
		// first, set your draw color
		// see how it is done in Rectangle

		// second, draw the shape

		window.setColor(super.getColor());
		window.drawLine(super.getX(), super.getY(), this.x2, this.y2);
	}

 	// each toString() method must use this format
    public String toString()
    {
    	return getMode() + "," + getX1() + "," + getY1() + "," + getX2() + "," + getY2() + ","
    	            + getColor().getRed() + "," + getColor().getGreen() + "," + getColor().getBlue();
    }

}
