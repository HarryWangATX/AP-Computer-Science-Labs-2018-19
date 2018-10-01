//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

class Robot extends Canvas
{
   public Robot()    //constructor method - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
   	  window.setColor(Color.RED);
   	  window.drawString("Neo Wang     APCS 2018",10,40);

      window.setColor(Color.BLUE);

      window.drawString("Robot LAB ", 10, 75 );

      // call head method and pass it window
      head(window);
      upperBody(window);
      lowerBody(window);

      // call other methods and pass it window


   }

   public void head( Graphics window )
   {
      	window.setColor(Color.YELLOW);
      	window.fillOval(300, 100, 200, 100);

        window.setColor(Color.GREEN);
        window.fillOval(345, 105, 20, 20);
        window.fillOval(445, 105, 20, 20);

        window.setColor(Color.BLACK);
        window.fillOval(400, 130, 25, 25);

        window.drawArc(380, 150, 50, 50, 180, 180);

		// add more code here

   }

   public void upperBody( Graphics window )
   {
     window.setColor(Color.BLUE);
     window.fillRect(300, 260, 200, 100);
     window.drawLine(300 , 260, 250, 210);
     window.drawLine(500 , 260, 550, 210);
		// add more code here
   }

   public void lowerBody( Graphics window )
   {
     window.setColor(Color.BLUE);
     window.fillRect(300, 380, 200, 100);
     window.drawLine(300, 480, 250, 530);
     window.drawLine(500, 480, 550, 530);
		// add more code here

   }
}
