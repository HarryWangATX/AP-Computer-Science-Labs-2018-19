// DO NOT MODIFY THIS FILE EXCEPT FOR EXTRA CREDIT

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.*;
import java.awt.image.BufferedImage;

	// this JPanel listens for the mouse events
 public class CustomPanel extends JPanel implements MouseListener, MouseMotionListener
    {
 	  // for buffering
  	  private BufferedImage back;

      ArrayList <AbstractShapeObject> myList  = new ArrayList<AbstractShapeObject>();
      String myMode     = "Line";  // None, Line, Rectangle, etc.
      Color  color = Color.blue;   // current draw color
      int    x1 = 0;
      int    y1 = 0;
      int    x2 = 0;
      int    y2 = 0;
      boolean drawing = false; // are we drawing with the mouse?

      public CustomPanel()
      {
      	addMouseListener(this);
        addMouseMotionListener(this);
        setBackground(Color.red);
      }

      public void setMyMode(String mode)
      {
        myMode = mode;
      }

      public String getMyMode()
      {
        return myMode;
      }

      public void setColor(Color color)
      {
        this.color = color;
      }

      public Color getColor()
      {
        return color;
      }

	  public void removeTempShapes()
	  {
            // get rid of temp objects
            for (int j=0; j < myList.size(); j++)
            {
                AbstractShapeObject myShape = myList.get(j);
                if (!myShape.getKeep())
                {
                    myList.remove(j);
                }
            }
 	  }

      public void update(Graphics window)
      {
	      paintComponent(window);
      }

      public void paintComponent(Graphics window)
      {
		super.paintComponent((Graphics2D)window);
		Graphics2D g2 = (Graphics2D) window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
	    back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics gMemory = back.createGraphics();

		// clear the screen
		gMemory.setColor(Color.BLACK);
		gMemory.fillRect(0,0,getWidth(),getHeight());

        // draw all the objects
        for (int j=0; j < myList.size(); j++)
        {
        	AbstractShapeObject myShape = myList.get(j);
        	myShape.draw(gMemory);
        }

		// *** show the screen by copying the image to the graphics display ********
   		g2.drawImage(back, null, 0, 0);
      }

    /* mouse motion events... */

    public void mouseMoved(MouseEvent event)
    {
    }

    public void mouseDragged(MouseEvent event)
    {
      if (drawing)
      {
        if (myMode.equals("Line"))
        {
            x2 = event.getX();
            y2 = event.getY();
            // get rid of temp objects
            removeTempShapes();

            AbstractShapeObject myShape = new Line(x1,y1,x2,y2,color);
            myShape.setMode("Line");
            myShape.setKeep(false);
            myList.add(myShape);
            repaint();
        } // end of if (myMode.equals("Line"))
        else if (myMode.equals("Free"))
        {
            // update the from coordinates
            x1 = x2;
            y1 = y2;
            // get the draw to coordinates
            x2 = event.getX();
            y2 = event.getY();

            AbstractShapeObject myShape = new Line(x1,y1,x2,y2,color);
            myShape.setMode("Free");
            myShape.setKeep(true);
            myList.add(myShape);
            repaint();
        } // end of if (myMode.equals("Line"))

        else if (myMode.equals("Rectangle"))
        {
            // get the draw to coordinates (lower right)
            x2 = event.getX();
            y2 = event.getY();

            // get rid of temp objects
            removeTempShapes();

            AbstractShapeObject myShape = new Rectangle(x1,y1,x2,y2,color);
            myShape.calcXYWidthHeight(x1,y1,x2,y2);
            myShape.setMode("Rectangle");
            myShape.setKeep(false);
			myList.add(myShape);
            repaint();
        } // end of if (myMode.equals("Line"))
        else if (myMode.equals("Ellipse"))
        {
            // get the draw to coordinates (lower right)
            x2 = event.getX();
            y2 = event.getY();

            // get rid of temp objects
            removeTempShapes();

            AbstractShapeObject myShape = new Ellipse(x1,y1,x2,y2,color);
            myShape.calcXYWidthHeight(x1,y1,x2,y2);
			myShape.setMode("Ellipse");
            myShape.setKeep(false);
			myList.add(myShape);
            repaint();
        } // end of if (myMode.equals("Ellipse"))
        else if(myMode.equals("Point"))
        {
          removeTempShapes();

          AbstractShapeObject myShape = new Point(x1,y1,color);
          myShape.setMode("Point");
          myShape.setKeep(false);
          myList.add(myShape);
          repaint();
        }

      }  // end of if (drawing)

    }

    /* mouse events... */

    public void mouseClicked(MouseEvent event)
    {

    }

    public void mousePressed(MouseEvent event)
    {
       drawing = true;
       // save the original coordinates
       x1 = event.getX();
       y1 = event.getY();
       // save where to draw to
       x2 = event.getX();
       y2 = event.getY();
    }

    public void mouseReleased(MouseEvent event)
    {
      if (drawing)
      {
        if (myMode.equals("Line"))
        {
            // get rid of temp objects
            removeTempShapes();

            x2 = event.getX();
            y2 = event.getY();
            AbstractShapeObject myShape = new Line(x1,y1,x2,y2,color);
            myShape.setMode("Line");
            myShape.setKeep(true);
			myList.add(myShape);
        }
        else if (myMode.equals("Free"))
        {
            // nothing to do since it has already been drawn
        }
        else if (myMode.equals("Rectangle"))
        {
            // get rid of temp objects
            removeTempShapes();

            x2 = event.getX();
            y2 = event.getY();
            AbstractShapeObject myShape = new Rectangle(x1,y1,x2,y2,color);
            myShape.calcXYWidthHeight(x1,y1,x2,y2);
            myShape.setMode("Rectangle");
            myShape.setKeep(true);
            myList.add(myShape);
        }
        else if (myMode.equals("Ellipse"))
        {
            // get rid of temp objects
            removeTempShapes();

            x2 = event.getX();
            y2 = event.getY();
            AbstractShapeObject myShape = new Ellipse(x1,y1,x2,y2,color);
            myShape.calcXYWidthHeight(x1,y1,x2,y2);
            myShape.setMode("Ellipse");
            myShape.setKeep(true);
            myList.add(myShape);
        }
        else if (myMode.equals("Point"))
        {
            // get rid of temp objects
            removeTempShapes();
            AbstractShapeObject myShape = new Point(x1,y1,color);
            myShape.setMode("Point");
            myShape.setKeep(true);
            myList.add(myShape);
        }
      drawing = false;
      repaint();
      } // end of if (drawing)
    } // end of mouseReleased

    public void mouseEntered(MouseEvent event)
    {

    }

    public void mouseExited(MouseEvent event)
    {

    }

  }
