//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class BigHouse extends Canvas
{
   public BigHouse()  //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
   	  window.setColor(Color.RED);
   	  window.drawString("Neo Wang   APCS 2018",10,40);

      // call bigHouse and pass it (send to it) window

      bigHouse(window);
   }


   public void bigHouse( Graphics window )
   {
   	  // Draw your big house here

      window.setColor(Color.BLUE);

      window.drawString( "BIG HOUSE ", 50, 100 );

      window.setColor(Color.BLUE);
      window.fillRect(200,200,400,400);

      window.setColor(Color.WHITE);
      window.fillRect(230,230,100,100);
      window.fillRect(400,230,100,100);
      window.fillRect(400,500,50,100);

      window.setColor(Color.GREEN);
      window.fillRect(180,0,500,200);
   }
}
