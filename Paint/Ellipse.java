import java.awt.*;
import java.awt.geom.*;

public class Ellipse extends AbstractShapeObject {

    public Ellipse(int x, int y, int width, int height) {
    	super(x,y,width,height);
    }

    public Ellipse(int x, int y, int width, int height, Color color) {
      super(x,y,width,height,color);
    }

    public Ellipse(int x, int y, int width, int height, int thickness) {
      super(x,y,width,height,thickness);
    }

    public Ellipse(int x, int y, int width, int height, int thickness, Color color) {
      super(x,y,width,height,thickness, color);
    }

	public void draw(Graphics window)
	{
		// first, set your draw color
		// see how it is done in Rectangle

		// second, draw the shape

    window.setColor(super.getColor());
    window.drawArc(super.getX(), super.getY(), super.getWidth(), super.getHeight(), 0, 360);
	}

  public String toString()
  {
    return getMode() + "," + getX() + "," + getY() + "," + getWidth() + "," + getHeight() + ","
                + getColor().getRed() + "," + getColor().getGreen() + "," + getColor().getBlue();
  }

	// write the toString() method
	// use the same format that is used for the Rectangle and Line classes

}
