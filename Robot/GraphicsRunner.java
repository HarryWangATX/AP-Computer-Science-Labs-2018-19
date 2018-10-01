//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import javax.swing.JFrame;

public class GraphicsRunner extends JFrame
{
	// WIDTH and HEIGHT are constants
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public GraphicsRunner()
	{
		super("Graphics Runner");

		setSize(WIDTH,HEIGHT);

		getContentPane().add(new Robot());

		// add other classes to run them
		// BigHouse, Robot, or ShapePanel
		// i.e.  in order to run your BigHouse
		// you will need to change
		// getContentPane().add(new SmileyFace());
		// to
		// getContentPane().add(new BigHouse());
		// and then run it again
		// getContentPane().add(new ShapePanel());

		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main( String args[] )
	{
		GraphicsRunner run = new GraphicsRunner();
	}
}
