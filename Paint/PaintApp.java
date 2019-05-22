// This is the RUNNER FILE
// DO NOT MODIFY THIS FILE EXCEPT FOR EXTRA CREDIT
// APCS 2019
// Put your name and class period here

// to draw, choose the mode and then use the mouse to click and drag

// FOR EXTRA CREDIT:
// 1) add a Point class to draw a Point
// 2) add a Triangle class to draw a Triangle (click on points and then connect them )
// 3) add a Polygon class to draw a Polygon
// 4) modify the code to make the thickness work
// 5) add the ability to fill an object
// 6) add an undo feature

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.*;
import java.io.*;

class PaintApp extends JFrame implements ActionListener
{
    // the draw panel
    JPanel content;
    CustomPanel contentCustom;

    String filename = "";
   	File file = null;

    // Menu Bar
	JMenuBar bar;

    // file menu
    JMenu     fileMenu;
    JMenuItem openItem;
    JMenuItem saveItem;
    JMenuItem exitItem;

	// mode menu
	JMenu     modeMenu;
	JMenuItem lineItem;
	JMenuItem rectItem;
	JMenuItem ellipseItem;
	JMenuItem freeItem;
  JMenuItem pointItem;

    // color menu
    JMenu     colorMenu;
    JMenuItem colorItem;

    public PaintApp()
	{
		super("Paint - Line Mode   Color=" + Color.BLUE );
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // create the menu bar
        bar = new JMenuBar();

        // create the menus
        fileMenu = new JMenu("File");
        fileMenu.setMnemonic('F');    // Alt F

        modeMenu = new JMenu("Mode");

        colorMenu = new JMenu("Color");

        // **** create the menu items
        // file menu items
        saveItem = new JMenuItem("Save");
        saveItem.setMnemonic('s');
        saveItem.addActionListener(this);

        openItem = new JMenuItem("Open");
        openItem.setMnemonic('o');
        openItem.addActionListener(this);

        exitItem = new JMenuItem("Exit");
        exitItem.setMnemonic('x');
        exitItem.addActionListener(this);

        // mode menu items
        lineItem = new JMenuItem("Line");
        lineItem.addActionListener(this);

        rectItem = new JMenuItem("Rectangle");
        rectItem.addActionListener(this);

        ellipseItem = new JMenuItem("Ellipse");
        ellipseItem.addActionListener(this);

        pointItem = new JMenuItem("Point");
        pointItem.addActionListener(this);

        freeItem = new JMenuItem("Free Draw");
        freeItem.addActionListener(this);

        // color menu items
        colorItem = new JMenuItem("Color");
        colorItem.addActionListener(this);


        // **** add menu items to the menus
        // fileMenu
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        // modeMenu
        modeMenu.add(lineItem);
        modeMenu.add(rectItem);
        modeMenu.add(ellipseItem);
        modeMenu.add(pointItem);
        modeMenu.add(freeItem);

        // colorMenu
        colorMenu.add(colorItem);

        // **** add the menus to the bar
        bar.add(fileMenu);
        bar.add(modeMenu);
        bar.add(colorMenu);

        // **** set the bar to be the menu bar
        setJMenuBar(bar);

        // Container content = getContentPane(); replace this with our own
        content = new CustomPanel();
        contentCustom = (CustomPanel) content;

        FlowLayout lay = new FlowLayout(FlowLayout.LEFT);
        content.setLayout(lay);

		setContentPane(content);
        setVisible(true); // always do this last
    }

	public void actionPerformed(ActionEvent e)
	{
	  Object source = e.getSource();

	  if (source == exitItem)
	  {
	   System.exit(0);
	  }
	  else if (source == lineItem)
	  {
	    contentCustom.setMyMode("Line");
        setTitle("Paint - " + ((CustomPanel) content).getMyMode() + " Mode   Color="+
        	      ((CustomPanel) content).getColor()
        	    );
	  }
      else if (source == rectItem)
      {
        ((CustomPanel) content).setMyMode("Rectangle");
        setTitle("Paint - " + ((CustomPanel) content).getMyMode() + " Mode   Color="+
        	      ((CustomPanel) content).getColor()
        	    );
      }
      else if (source == ellipseItem)
      {
        ((CustomPanel) content).setMyMode("Ellipse");
        setTitle("Paint - " + ((CustomPanel) content).getMyMode() + " Mode   Color="+
        	      ((CustomPanel) content).getColor()
        	    );
      }
      else if (source == freeItem)
      {
        ((CustomPanel) content).setMyMode("Free");
        setTitle("Paint - " + ((CustomPanel) content).getMyMode() + " Mode   Color="+
        	      ((CustomPanel) content).getColor()
        	    );
      }
      else if (source == colorItem)
      {
        Color  color = Color.black;
        Color newColor = JColorChooser.showDialog(this,"Draw Color",color);
        if (newColor != null)
          ((CustomPanel) content).setColor(newColor);
        setTitle("Paint - " + ((CustomPanel) content).getMyMode() + " Mode   Color="+
        	      ((CustomPanel) content).getColor()
        	    );
      }
      else if(source == pointItem)
      {
        ((CustomPanel) content).setMyMode("Point");
        setTitle("Paint - " + ((CustomPanel) content).getMyMode() + " Mode   Color="+
        	      ((CustomPanel) content).getColor()
        	    );
      }
      else if (source == saveItem)
      {
        try
        {
          JFileChooser fileChooser = null;
          int result = JFileChooser.APPROVE_OPTION;

          if (filename.equals(""))
          {
            fileChooser = new JFileChooser();
            result = fileChooser.showSaveDialog(this);
          }

          if (result == JFileChooser.APPROVE_OPTION)
          {
            if (filename.equals(""))
              {
              filename = fileChooser.getSelectedFile().getName();
              file = fileChooser.getSelectedFile();
              }
            // use contentCustom to reference the CustomPanel variables

            FileWriter fw=null;
            BufferedWriter bw=null;
            try
            {
              fw = new FileWriter(file);
              bw = new BufferedWriter(fw);

              for (int j=0; j < contentCustom.myList.size(); j++)
              {
                AbstractShapeObject myShape =  contentCustom.myList.get(j);
                String outLine = myShape.toString();


                bw.write(outLine);
                bw.newLine();
              }
            }
            catch (Exception e1)
            {
            }
            finally
            {
              try
              {
                bw.close();
              }
              catch (Exception e2)
              {
              }
            }
          }
          else if (result == JFileChooser.CANCEL_OPTION)
          {
          }
        }
        catch (Exception ee)
        {
        }

      }
      else if (source == openItem)
      {
        try
        {
          JFileChooser fileChooser = new JFileChooser();
          int result = fileChooser.showOpenDialog(this);
          if (result == JFileChooser.APPROVE_OPTION)
          {
            file = fileChooser.getSelectedFile();

            if (file != null)
            {
            filename = fileChooser.getSelectedFile().getName();
            contentCustom.myList.clear();


            FileReader fr=null;
            BufferedReader br=null;
            try
            {
              fr = new FileReader(file);
              br = new BufferedReader(fr);

              String s = br.readLine();
              while (s != null)
              {

                StringTokenizer st = new StringTokenizer(s,",");

                String mode = st.nextToken();

                if (mode.equals("Line"))
                {
                	int x1 = Integer.parseInt(st.nextToken());
                	int y1 = Integer.parseInt(st.nextToken());
                	int x2 = Integer.parseInt(st.nextToken());
                	int y2 = Integer.parseInt(st.nextToken());
                    int red = Integer.parseInt(st.nextToken());
                    int green = Integer.parseInt(st.nextToken());
                    int blue = Integer.parseInt(st.nextToken());
                    Color color = new Color(red,green,blue);
                    AbstractShapeObject myShape = new Line(x1,y1,x2,y2,color);
		            myShape.setMode("Line");
        		    myShape.setKeep(true);
                    contentCustom.myList.add(myShape);
                }
                else if (mode.equals("Rectangle"))
                {
                	int x = Integer.parseInt(st.nextToken());
                	int y = Integer.parseInt(st.nextToken());
                	int width = Integer.parseInt(st.nextToken());
                	int height = Integer.parseInt(st.nextToken());
                    int red = Integer.parseInt(st.nextToken());
                    int green = Integer.parseInt(st.nextToken());
                    int blue = Integer.parseInt(st.nextToken());
                    Color color = new Color(red,green,blue);
                    AbstractShapeObject myShape = new Rectangle(x,y,width,height,color);
		            myShape.setMode("Rectangle");
        		    myShape.setKeep(true);
                    contentCustom.myList.add(myShape);
                }
                else if (mode.equals("Point"))
                {
                	int x = Integer.parseInt(st.nextToken());
                	int y = Integer.parseInt(st.nextToken());
                    int red = Integer.parseInt(st.nextToken());
                    int green = Integer.parseInt(st.nextToken());
                    int blue = Integer.parseInt(st.nextToken());
                    Color color = new Color(red,green,blue);
                    AbstractShapeObject myShape = new Point(x,y,color);
		            myShape.setMode("Point");
        		    myShape.setKeep(true);
                    contentCustom.myList.add(myShape);
                }
                else if (mode.equals("Ellipse"))
                {
                	int x = Integer.parseInt(st.nextToken());
                	int y = Integer.parseInt(st.nextToken());
                	int width = Integer.parseInt(st.nextToken());
                	int height = Integer.parseInt(st.nextToken());
                    int red = Integer.parseInt(st.nextToken());
                    int green = Integer.parseInt(st.nextToken());
                    int blue = Integer.parseInt(st.nextToken());
                    Color color = new Color(red,green,blue);
                    AbstractShapeObject myShape = new Ellipse(x,y,width,height,color);
		            myShape.setMode("Rectangle");
        		    myShape.setKeep(true);
                    contentCustom.myList.add(myShape);
                }

              	s = br.readLine();
              } // end of while loop

            contentCustom.repaint();
            }
            catch (Exception e1)
            {
            }
            finally
            {
              try
              {
                br.close();
              }
              catch (Exception e2)
              {
              }
            }

            }
          }
          else if (result == JFileChooser.CANCEL_OPTION)
          {
          }
        }
        catch (Exception ee)
        {
        }

      }

    }

    public static void main(String[] args)
	{
		PaintApp paint = new PaintApp();
	}


}
