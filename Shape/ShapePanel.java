//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShapePanel extends JPanel
{
	public ShapePanel()
	{
		setBackground(Color.WHITE);
		setVisible(true);
	}

	public void update(Graphics window)
	{
		paint(window);
	}

	/*
	 *All of your test code should be placed in paint.
	 */
	public void paint(Graphics window)
	{
		window.setColor(Color.WHITE);
		window.fillRect(0,0,getWidth(), getHeight());
		window.setColor(Color.BLUE);
		window.drawRect(20,20,getWidth()-40,getHeight()-40);
		window.setFont(new Font("TAHOMA",Font.BOLD,18));
		window.drawString("CREATE YOUR OWN SHAPE!",40,80);

		Shape newRightTriangle = new Shape(200,200,200,200,Color.BLACK);
		newRightTriangle.draw(window);

		Shape differentRightTriangle = new Shape(42,410,20,84,Color.BLACK);
		differentRightTriangle.draw(window);

		Shape specialRightTriangle = new Shape(500,300,50,200,Color.BLUE);
		specialRightTriangle.draw(window);

		// instantiate a Shape  (new it!)
		// and then tell your shape to draw
		// Shape myShape1 = new Shape(...);
		// myShape1.draw(...);
		// The ... indicates that you will need to supply
		//    the missing parameters
		// PUT YOUR CODE RIGHT HERE



		// instantiate a second Shape
		// Shape myShape2 = new ??????
		// tell your shape to draw
		// PUT YOUR CODE RIGHT HERE



		// instantiate a third Shape
		// tell your shape to draw
		// PUT YOUR CODE RIGHT HERE



	}
}
