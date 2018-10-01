//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class SmileyFace extends Canvas
{
   public SmileyFace()    //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      smileyFace(window);
   }

   public void smileyFace( Graphics window )
   {
   	  window.setColor(Color.RED);
   	  window.drawString("Neo Wang    APCS 2018",10,40);
      window.setColor(Color.BLUE);
      window.drawString("SMILEY FACE LAB ", 10, 75);

      window.setColor(Color.YELLOW);
      window.fillOval( 210, 100, 400, 400 );

      window.setColor(Color.BLACK);
      window.fillOval(300, 250, 80, 10);

      window.setColor(Color.BLACK);
      window.fillOval(500, 250, 80, 10);
      window.fillOval(400,300,25,25);

      window.setColor(Color.RED);
      window.fillArc(275,325,300,100,180,180);

		//add more code here


   }
}
