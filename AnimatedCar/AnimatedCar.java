//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Timer;
import javax.swing.JFrame;
import java.awt.Canvas;

class AnimatedCar extends Canvas
{
	private int x;
	private int y;
	private Timer timer;
	private final static int SLEEP = 50;  //bigger # = slower animation

	public AnimatedCar(int width, int heigth)
	{
		setSize(width, heigth);
		setVisible(true);
		setBackground(Color.BLACK);

		x = 0;
		y = 300;

		ActionListener paintCaller = new ActionListener(){
			public void actionPerformed(ActionEvent event)
			{
				repaint();  //each time the timer fires it will call paint
			}
		};
		timer = new Timer(SLEEP, paintCaller);
		timer.start();
	}

	public void update(Graphics window)
	{
	   paint(window);
	}


	// this method will get called over and over again (every 50 ms)
	public void paint( Graphics window )
	{
		window.setColor(Color.BLACK);
		window.fillRect(0,0,getWidth(),getHeight());

		window.setColor(Color.WHITE);
		window.drawString("Animation Lab - Neo Wang", 25, 50 );

		window.setColor(Color.GREEN);
		window.fillRect(x,y+20,100,40);


		// ***** draw all of the parts of the car using your x and y variables


		// draw a wheel
    window.setColor(Color.GRAY);
    window.fillOval(x,y+50,40,40);

		// draw another wheel

    window.fillOval(x+50,y+50,40,40);

		// increment x by 50

    x+= 50;

		// if x has reached the far right side of the screen (use getWidth())
		// set it back to zero

    if(getWidth() < x)
    {
      x = 0;
    }
	}
}
