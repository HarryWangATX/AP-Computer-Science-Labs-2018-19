//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -


// DO NOT DO ANYTHING WITH THIS FILE
// OTHER THAN PUT YOUR NAME ON IT AND RUN IT
// THIS IS THE RUNNER FILE

// DO THE Block.java class first
// then do Ball.java and Paddle.java
// make sure that you compile each of these classes individually




import java.awt.Color;
import javax.swing.JFrame;
import java.awt.Component;

public class TheGame extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public TheGame()
	{
		super("PONG");
		setSize(WIDTH,HEIGHT);

		Pong game = new Pong();

		((Component)game).setFocusable(true);
		getContentPane().add(game);

		setVisible(true);



		// DO NOT REMOVE THIS LINE OF CODE
		System.out.println("2019 version.");

		System.out.println("My name is Neo Wang");
	}

	public static void main( String args[] )
	{
		TheGame run = new TheGame();
	}
}
