//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import javax.swing.JFrame;
import static java.lang.System.*;

// Lab Chapter 5 - #6  AnimatedCar   2018

// Uses GraphicsRunner.java and AnimatedCar.java

public class GraphicsRunner extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public GraphicsRunner()
	{
		super("Graphics Runner");
		setSize(WIDTH,HEIGHT);

		getContentPane().add(new AnimatedCar(WIDTH, HEIGHT));

		setVisible(true);
	}

	public static void main( String args[] )
	{
		GraphicsRunner run = new GraphicsRunner();

		out.println("Lab Chapter 5 - #6  AnimatedCar   2018");
		out.println();
		out.println();

		// fill in your name
		out.println("My name is Neo");
		out.println();

		// no need to add anymore codein runner file. It is done.

	}
}
