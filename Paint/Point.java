// Complete this class last

import java.awt.*;
import java.awt.geom.*;

public class Point extends AbstractShapeObject
{

    public Point(int x1, int y1) {
    	super(x1,y1);
    }

    public Point(int x1, int y1, Color color) {
			super(x1,y1);
			super.setColor(color);
    }

    public Point(int x1, int y1, int thickness) {
			super(x1,y1);
			super.setThickness(thickness);
    }

    public Point(int x1, int y1, int thickness, Color color) {
			super(x1,y1);
			super.setThickness(thickness);
			super.setColor(color);
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

	public void draw(Graphics window)
	{
		// first, set your draw color
		// see how it is done in Rectangle

		// second, draw the shape

		window.setColor(super.getColor());
		window.fillOval(super.getX(), super.getY(), 5, 5);
	}

 	// each toString() method must use this format
    public String toString()
    {
    	return getMode() + "," + getX1() + "," + getY1() + "," + getColor().getRed() + "," + getColor().getGreen() + "," + getColor().getBlue();
    }

}
