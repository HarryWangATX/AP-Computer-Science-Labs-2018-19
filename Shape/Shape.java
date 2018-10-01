//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Shape
{
   //instance variables
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private Color color;

  public Shape(int x, int y, int wid, int ht, Color col)
  {
  	xPos = x;
  	yPos = y;
    width = wid;
    height = ht;
    color = col;
  }


 public void draw(Graphics window)
 {
    window.setColor(Color.RED);
    window.drawString("Neo Wang     APCS 2018",10,40);

    int[] xPoints = {xPos, xPos, xPos + width};
    int[] yPoints = {yPos, yPos+height, yPos + height};

    window.setColor(color);
    window.drawPolygon(xPoints, yPoints, 3);

    // draw whatever you want
    // You will need to use Graphics routines like
    //    window.drawRect(...);
    //    window.drawOval(...);
    //    window.drawLine(...);
    //    window.drawString(...);
    //    and any others
    // The ... indicates that you need to supply the parameters
    //    ^



 }




   public String toString()
   {
   	return xPos+" "+yPos+" "+width+" "+height+" "+color;
   }
}
