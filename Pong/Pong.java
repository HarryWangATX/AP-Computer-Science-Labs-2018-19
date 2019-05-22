//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 2019
//Class -
//Lab  -

// DO NOT DO ANYTHING WITH THIS FILE
// OTHER THAN COMPILING IT
// the main program is TheGame.java


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;

public class Pong extends Canvas implements KeyListener, Runnable
{
	public final Color backgroundColor = Color.WHITE;

	private Ball ball;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private boolean[] keys;
	private BufferedImage back;
	private int leftScore;
	private int rightScore;

	public Pong()
	{
		//set up all variables related to the game
		ball = new Ball(400,300,10,10,Color.blue,2,1);
		leftPaddle = new Paddle(20,200,10,40,Color.orange,2);
		rightPaddle = new Paddle(760,200,10,40,Color.orange,2);
		keys = new boolean[4];
		leftScore=0;
		rightScore=0;

    	setBackground(backgroundColor);
		setVisible(true);

		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}

   public void update(Graphics window){
	   paint(window);
   }

   public void paint(Graphics window)
   {
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current Frame and same it as an image
		//that is the exact same width and height as the current Frame
		// remove the if in order to resize the window properly
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();

		graphToBack.setColor(Color.red);

		// draw a rectangle around the play area
		graphToBack.drawRect(10,20,770,440);

		ball.moveAndDraw(graphToBack);
		leftPaddle.draw(graphToBack);
		rightPaddle.draw(graphToBack);

		//see if ball hits left wall or right wall
		if(!(ball.getX()>=10 && ball.getX()<=780))
		{
			ball.setXSpeed(0);
			ball.setYSpeed(0);

			if(ball.getX()<=40)
			   rightScore++;
			if(ball.getX()>=720)
			   leftScore++;

			try
	   	{
	   		Thread.currentThread().sleep(1);
	      }catch(Exception e)
	      {
	      }

			ball.draw(graphToBack,Color.WHITE);
	      ball.setX((int)(Math.random()*50)+400);
	      ball.setY((int)(Math.random()*50)+300);
	      int whoot = (int)(Math.random()*2);
	      if(whoot==0){
	         ball.setXSpeed(2);
	         ball.setYSpeed(1);
	      }
	      else{
				ball.setXSpeed(-2);
	         ball.setYSpeed(1);
	      }
		}

		graphToBack.setColor(Color.WHITE);
		graphToBack.fillRect(440,520,80,80);

		graphToBack.setColor(Color.red);

		graphToBack.drawString("rightScore = "+rightScore,400,540);
		graphToBack.drawString("leftScore = "+leftScore,400,560);

		//see if ball hits top wall or bottom wall
		if(!(ball.getY()>=20 && ball.getY()<=450))
		{
			ball.setYSpeed(-ball.getYSpeed());
		}

		if((ball.getX()<=leftPaddle.getX()+leftPaddle.getWidth()+Math.abs(ball.getXSpeed()))
		         &&
		         (ball.getY()>=leftPaddle.getY()&&
		         ball.getY()<=leftPaddle.getY()+leftPaddle.getHeight()||
		         ball.getY()+ball.getHeight()>=leftPaddle.getY()&&
		         ball.getY()+ball.getHeight()<=leftPaddle.getY()+leftPaddle.getHeight()))
		{

			if(ball.getX()<=leftPaddle.getX()+leftPaddle.getWidth()-Math.abs(ball.getXSpeed()))
			   ball.setYSpeed(-ball.getYSpeed());
			else
			   ball.setXSpeed(-ball.getXSpeed());
		}


		if((ball.getX()+ball.getWidth()>=rightPaddle.getX()-Math.abs(ball.getXSpeed()))
		         &&
		         (ball.getY()-ball.getHeight()>=rightPaddle.getY()&&
		         ball.getY()-ball.getHeight()<=rightPaddle.getY()+rightPaddle.getHeight()||
		         ball.getY()+ball.getHeight()>=rightPaddle.getY()&&
		         ball.getY()+ball.getHeight()<=rightPaddle.getY()+rightPaddle.getHeight()))
		{
			if(ball.getX()+ball.getWidth()>=rightPaddle.getX()+Math.abs(ball.getXSpeed()))
			   ball.setYSpeed(-ball.getYSpeed());
			else
			   ball.setXSpeed(-ball.getXSpeed());
		}

		//see if the paddles need to be moved
		if(keys[0] == true)
		{
			leftPaddle.moveUpAndDraw(graphToBack);
		}
		if(keys[1] == true)
		{
			leftPaddle.moveDownAndDraw(graphToBack);
		}
		if(keys[2] == true)
		{
			rightPaddle.moveUpAndDraw(graphToBack);
		}
		if(keys[3] == true)
		{
			rightPaddle.moveDownAndDraw(graphToBack);
		}

		twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'Z' : keys[1]=true; break;
			case 'I' : keys[2]=true; break;
			case 'M' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'Z' : keys[1]=false; break;
			case 'I' : keys[2]=false; break;
			case 'M' : keys[3]=false; break;
		}
	}

	public void keyTyped(KeyEvent e){}

   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(8);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
}
