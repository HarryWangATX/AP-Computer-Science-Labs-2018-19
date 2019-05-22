//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 2019
//Class -
//Lab  -
import java.awt.Color;

public interface Locatable
{
	// here we define any constants
	// you do not have to put public or final
	// as the compiler will do it for you
	public final Color defaultBlockColor = Color.RED;


	// getter (accessor) and setter (modifier) methods
	// notice that I don't have to use the keyword abstract
	// because these methods live in an interface they are automatically
	// public and abstract
	// which means I also don't have to use the keyword public

	public abstract void setColor(Color col);
	public abstract Color getColor( );

    public void setPos( int x, int y);  // abstract is optional

    public int getX();
    public void setX( int x );

    public int getY();
    public void setY( int y );

    public int getWidth();
    public void setWidth( int width );

    public int getHeight();
    public void setHeight( int height );

}
