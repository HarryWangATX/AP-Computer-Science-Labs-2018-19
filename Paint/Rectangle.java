import java.awt.*;
import java.awt.geom.*;

public class Rectangle extends AbstractShapeObject {

    public Rectangle()
    {
    	super();
    }

    public Rectangle(int x, int y, int width, int height) {
    	super(x,y,width,height);
    }

    public Rectangle(int x, int y, int width, int height, Color color) {
      super(x,y,width,height,color);
    }

    public Rectangle(int x, int y, int width, int height, int thickness) {
      super(x,y,width,height,thickness);
    }

    public Rectangle(int x, int y, int width, int height, int thickness, Color color) {
      super(x,y,width,height,thickness, color);
    }

	public void draw(Graphics window)
	{
		// first, set your draw color
		//window.set?????(get?????());

		// second, draw the shape
		//window.draw????

    window.setColor(getColor());
    window.drawRect(getX(), getY(), getWidth(), getHeight());
	}


	// each toString() method must use this format
    public String toString()
    {
    	return getMode() + "," + getX() + "," + getY() + "," + getWidth() + "," + getHeight() + ","
    	            + getColor().getRed() + "," + getColor().getGreen() + "," + getColor().getBlue();
    }

}
