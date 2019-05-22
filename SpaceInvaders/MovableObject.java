// 2019 MAJOR GRADE
// only fill in methods marked as  	// FINISH ME
// DO NOT MODIFY THE OTHER METHODS UNLESS YOU KNOW WHAT YOU ARE DOING!!!!

// all of your visible objects in the main program will be of type MovableObject
// examples of how to create a MovableObject are shown below
// filename.png needs to be the image that you want to show on the MovableObject
// you will need to supply your own x, y, width, and height
// ship = new MovableObject(centerPanel,"filename.png",x,y,width,height);
// alien = new MovableObject(centerPanel,"filename.png",x,y,width,height);
// bullet = new MovableObject(centerPanel,"filename.png",x,y,width,height);
// explosion = new MovableObject(centerPanel,"filename.png",x,y,width,height);
//

import java.awt.*;
import java.awt.geom.*;
import java.util.*;
import javax.swing.*;

public class MovableObject
{
	// direction to move
	// 0 to 360
	// call draw2 if you want to move in the direction
	private int direction;
	private int speed;  // speed for moving using the direction variable

	// current location of object
	private int x;
	private int y;
	private int width;
	private int height;

	private boolean hidden;


	// amount of time on the screen
	private float time;


	// speed of object when calling the draw method

	private int speedX;  // used by moveLeft(), moveRight()
	private int speedY;  // used by moveUp(), moveDown()

	// list of possible images to use
	private ArrayList <Image> imageList;

	// current image being displayed
	private Image currentImage;

	// filename of current image being displayed
	private String currentFilename;

	// list of filenames for the images (jpg, ...)
	private String [] imageFilenames;

	// the JPanel that this object is being displayed on
	private JPanel mainPanel;

	// this is the only constructor that is offered
	// centerPanel should be passed as the first parameter when you create a MovableObject
    public MovableObject(JPanel mainPanel, String filename, int x, int y, int width, int height)
    {
		direction = 0; // Location.NORTH;
		speed = 3; // speed for moving using the direction variable
		this.mainPanel = null; // make sure you call setPanel
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		time = 0;
		speedX = 3;  // used by moveLeft(), moveRight()
		speedY = 3;  // used by moveUp(), moveDown()
		imageList = null;
		currentImage = null;
		imageFilenames = null;
		currentFilename = "";
		setPanel(mainPanel);
		setCurrentFilename(filename);
		hidden = false;
 	}


	public void setPanel(JPanel mainPanel)
	{
		this.mainPanel = mainPanel;
	}

	public JPanel getPanel()
	{
		return mainPanel;
	}

	public void setImageFilenames(String [] filenames)
	{
		imageFilenames = filenames;
		imageList = new ArrayList<Image>();
		for (int i=0; i < filenames.length; i++)
		{
			try
			{
				Image pic = Toolkit.getDefaultToolkit().getImage(filenames[i]);
				imageList.add(pic);
			}
			catch (Exception e)
			{
				// FINISH ME
				System.out.println("Image is bad");
				// print out an error message saying something like "image is bad"
			}
		}
		if (filenames.length > 0)
		{
			currentFilename = filenames[0];
			setImage();
		}
	}

	private void setImage()
	{
		if (currentFilename != null && currentFilename != "")
		{
			try
			{
				currentImage = Toolkit.getDefaultToolkit().getImage(currentFilename);
				//System.out.println("toolkit ok");
			}
			catch (Exception e)
			{
				currentImage = null;
				currentFilename = "";
				System.out.println("error getImage with toolkit");
			}
		}
	}

	public void setCurrentFilename(String filename)
	{
		currentFilename = filename;
		setImage();
	}

	public void setCurrentFilenamePosition(int position)
	{
		if (imageFilenames == null)
			return;
		if (position < imageFilenames.length && position > -1)
			{
				currentFilename = imageFilenames[position];
				setImage();
			}
		else
			{
				currentFilename = "";
				currentImage = null;
			}
	}


	// FINISH ME (replace the 0)
    public int getDirection()
    {
        return this.direction;
    }

    public void setDirection(int direction)
    {
        this.direction = direction;
        this.direction = this.direction % 360;
    }

	// FINISH ME (replace the 0)
    public int getX()
    {
        return this.x;
    }

	// FINISH ME
    public void setX(int x)
    {
			this.x = x;
    }

	// FINISH ME (replace the 0)
    public int getY()
    {
		return this.y;
    }

	// FINISH ME
    public void setY(int y)
    {
			this.y = y;
    }

	// FINISH ME
    public void setXY(int x, int y)
    {
			this.x = x;
			this.y = y;
    }

	// FINISH ME (replace the 0)
    public int getWidth()
    {
        return this.width;
    }

	// FINISH ME
    public void setWidth(int width)
    {
			this.width = width;
    }

	// FINISH ME (replace the 0)
    public int getHeight()
    {
        return this.height;
    }

	// FINISH ME
    public void setHeight(int height)
    {
			this.height = height;
    }

	// FINISH ME (replace the 0)
    public int getSpeedX()
    {
        return this.speedX;
    }

	// FINISH ME
    public void setSpeedX(int speedX)
    {
			this.speedX = speedX;
    }

	// FINISH ME (replace the 0)
    public int getSpeedY()
    {
        return this.speedY;
    }

	// FINISH ME
    public void setSpeed(int speed)
    {
			this.speed = speed;
    }

	// FINISH ME (replace the 0)
    public int getSpeed()
    {
        return this.speed;
    }

	// FINISH ME
    public void setSpeedXY(int speedX, int speedY)
    {
			this.speedX = speedX;
			this.speedY = speedY;
    }

	// FINISH ME
    public void setSpeedY(int speedY)
    {
			this.speedY = speedY;
    }

	// FINISH ME (replace the 0)
    public float getTime()
    {
    	return this.time;
    }

	// FINISH ME
    public void setTime(float time)
    {
			this.time = time;
    }

	public void updateTime(float amountToAdd)
    {
    	setTime(getTime()+amountToAdd);
    }


	public void moveUp()
	{
		setY(this.y - speedY);
	}

	public void moveDown()
	{
		setY(this.y + speedY);
	}

	public void moveLeft()
	{
		setX(this.x - speedX);
	}

	public void moveRight()
	{
		setX(this.x + speedX);
	}

	public void moveTo(int x, int y)
	{
		setX(x);
		setY(y);
	}

	public Rectangle getRect()
	{
		return new Rectangle(getX(),getY(),getWidth(),getHeight());
	}

	public boolean intersects(Rectangle rect)
	{
		if((Math.abs(rect.getX()-this.x) < this.width)&&(Math.abs(rect.getY()-this.y) < this.height))
		{
			return true;
		}
		return false;
	}


	// you should compare a smaller object to a bigger object
	public boolean intersects(MovableObject other)
	{
		if((Math.abs(other.getX()-this.x) < this.width)&&(Math.abs(other.getY()-this.y) < this.height))
		{
			return true;
		}
		return false;
	}

	public Point getPoint()
	{
		return new Point(getX(),getY());
	}

	public void turnRight()
	{
		setDirection(getDirection()+90);
	}

	public boolean containsPoint(Point point)
	{
		if (getRect().contains(point))
			return true;
		return false;
	}

	// moves toward the other object using the speed variable
	// uses similar triangles
	public void moveTowards(MovableObject other)
	{
		double sideX = Math.abs(other.getX() - getX());
		double sideY = Math.abs(other.getY() - getY());
		double d = Math.sqrt(sideX*sideX + sideY*sideY);

		int speedX = (int)Math.round((getSpeed()*sideX)/d);
		int speedY = (int)Math.round((getSpeed()*sideY)/d);

		if (getX() < other.getX())
			setX(getX() + speedX);
		else if (getX() > other.getX())
			setX(getX() - speedX);

		if (getY() < other.getY())
			setY(getY() + speedY);
		else if (getY() > other.getY())
			setY(getY() - speedY);

	}

    // draws the image using the direction
    // call this method instead of draw if you want your
    //   object to move using the direction variable
	public void draw2(Graphics g)
	{
		if (hidden)
			return;

        Graphics2D g2 = (Graphics2D)g;
        AffineTransform transform = new AffineTransform();
        transform.setToTranslation(getX(), getY());
        //transform.rotate(degreesToRadians(getDirection()),24,24);

        // this will not work properly if your image is not square
        transform.rotate(degreesToRadians(getDirection()),getWidth()/2,getHeight()/2);

        g2.drawImage(currentImage, transform, mainPanel);
	}

	public double degreesToRadians(double degrees)
	{
     	return degrees*Math.PI/180;
	}

	// draws the image in its original direction
	public void draw(Graphics g)
	{
		if (hidden)
			return;

		Graphics2D g2 = (Graphics2D) g;

		g2.setColor(Color.black);

		g2.drawImage(currentImage,
			x,
			y,
			getWidth(),
			getHeight(),
			mainPanel);
	}

}  // end of class MovableObject

/*
boolean drawImage(Image img, int x, int y, ImageObserver observer)
  boolean drawImage(Image img, int x, int y, int width, int height, ImageObserver observer)
  boolean drawImage(Image img, int x, int y, Color bgcolor, ImageObserver observer)
  boolean drawImage(Image img, int x, int y, int width, int height, Color bgcolor, ImageObserver observer)
*/
