import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;  //ArrayList, Stack

// FIND ALL OF THE FINISH ME comments
// There is only one (line 300)


public class ArrayListMathRunner extends JFrame implements ActionListener {

  // ***** declaration of JFrame variables *****


  // define a mainPanel for components
  JPanel mainPanel;

  // ***** declaration of menu variables *****

  // define a menu bar variable to hold JMenus
  JMenuBar  menuBar;

  // define some JMenus and their JMenuItems
  // define a JMenu called fileMenu and add menuItems
  JMenu     fileMenu;
  JMenuItem exitMenuItem;


  // define JPanels for a BorderLayout
  JPanel     northPanel;
  JPanel     southPanel;
  JPanel     westPanel;
  JPanel     eastPanel;
  JPanel     centerPanel; // for entire middle area
  JPanel     centerPanel1; // to hold the array
  JPanel     centerPanel2; // to hold the answers
  JPanel     centerPanel3; // to hold the answers
  JPanel     centerPanelSpacer; // to hold space

  ArrayList<JButton> buttons1;
  ArrayList<JButton> buttons2;

  JButton calculateButton;
  JButton nextListButton;


  int    theBits = 8;


  JLabel spacer1;
  JLabel spacer2;
  JLabel spacer3;
  JLabel spacer4;
  JLabel spacer11;
  JLabel spacer22;
  JLabel spacer33;
  JLabel spacer44;

  JLabel sumValueLabel;
  JLabel averageValueLabel;
  JLabel largestValueLabel;
  JLabel smallestValueLabel;


  JLabel evensValueLabel;
  JLabel oddsValueLabel;
  JLabel gte90ValueLabel;
  JLabel lt70ValueLabel;


  int whichList = 1;
  ArrayList<Integer> list1;




  // ***** public void initialize *****


  public void initialize( )
  {


	// create an ArrayList of Integer objects
	list1 = new ArrayList<Integer>();
	list1.add(90);
	list1.add(85);
	list1.add(65);
	list1.add(98);
	list1.add(100);
	list1.add(95);
	list1.add(100);
	list1.add(100);

    // create a mainPanel for components
    mainPanel = new JPanel();

    // ***** assignments for menu variables *****

    menuBar            = new JMenuBar();

    fileMenu           = new JMenu("File");
    exitMenuItem       = new JMenuItem("Exit");


    // add mnemonics to the menu system
    fileMenu.setMnemonic('F');
    exitMenuItem.setMnemonic('x');

    // add the menuItem addActionListener(this) calls
    // fileMenu
    exitMenuItem.addActionListener(this);

    // add menuItems to the fileMenu
    fileMenu.add(exitMenuItem);

    // add menus to the menuBar
    menuBar.add(fileMenu);


    // attach the JMenuBar to the Window
    setJMenuBar(menuBar);


    // ***** create JPanels for a BorderLayout *****
    northPanel          = new JPanel();
    southPanel          = new JPanel();
    westPanel           = new JPanel();
    eastPanel           = new JPanel();
    centerPanel         = new JPanel();
    centerPanel1        = new JPanel(); // to hold the array
    centerPanel2        = new JPanel(); // Answers
    centerPanel3        = new JPanel(); // Answers
	centerPanelSpacer   = new JPanel(); // space

	Font fontForValueLabels = new Font("Courier New",Font.BOLD,24);

	sumValueLabel = new JLabel("Sum: ");
	sumValueLabel.setFont(fontForValueLabels);
	// this has no affect
	// sumValueLabel.setBackground(Color.CYAN);

	// this works for the text color
	// sumValueLabel.setForeground(Color.RED);


	spacer1 = new JLabel("   |   ");

	averageValueLabel = new JLabel("Average: ");
	averageValueLabel.setFont(fontForValueLabels);

	spacer2 = new JLabel("   |   ");

	largestValueLabel = new JLabel("Largest: ");
	largestValueLabel.setFont(fontForValueLabels);

	spacer3 = new JLabel("   |   ");

	smallestValueLabel = new JLabel("Smallest: ");
	smallestValueLabel.setFont(fontForValueLabels);


	evensValueLabel = new JLabel("Number of Evens: ");
	evensValueLabel.setFont(fontForValueLabels);

	spacer11 = new JLabel("   |   ");

	oddsValueLabel = new JLabel("Number of Odds: ");
	oddsValueLabel.setFont(fontForValueLabels);

	spacer22 = new JLabel("   |   ");

	gte90ValueLabel = new JLabel("Number >= 90: ");
	gte90ValueLabel.setFont(fontForValueLabels);


	spacer33 = new JLabel("   |   ");

	lt70ValueLabel = new JLabel("Number < 70: ");
	lt70ValueLabel.setFont(fontForValueLabels);



  	calculateButton = new JButton("Calculate");
  	calculateButton.addActionListener(this);

  	nextListButton  = new JButton("Next List");
	nextListButton.addActionListener(this);


	centerPanel2.add(averageValueLabel);
	centerPanel2.add(spacer1);
	centerPanel2.add(sumValueLabel);
	centerPanel2.add(spacer2);
	centerPanel2.add(largestValueLabel);
	centerPanel2.add(spacer3);
	centerPanel2.add(smallestValueLabel);

	centerPanel3.add(evensValueLabel);
	centerPanel3.add(spacer11);
	centerPanel3.add(oddsValueLabel);
	centerPanel3.add(spacer22);
	centerPanel3.add(gte90ValueLabel);
	centerPanel3.add(spacer33);
	centerPanel3.add(lt70ValueLabel);

	centerPanelSpacer.add(new JLabel("   "));


	centerPanel.setLayout(new GridLayout(4,1));
	centerPanel1.setLayout(new GridLayout(2,8));

	southPanel.add(calculateButton);
	southPanel.add(nextListButton);


	Font titleFont = new Font("Courier New",Font.BOLD,24);
	String titleString = "Array Math 2019";
	JLabel titleLabel = new JLabel(titleString);
	titleLabel.setFont(titleFont);
	northPanel.add(titleLabel);

	Font font = new Font("Courier New",Font.BOLD,18);


	buttons1 = new ArrayList<JButton>();

	Stack <JButton> stack = new Stack<JButton>();

	int k = 0;  // shows the indexes on the buttons 0,1,2,...
	for (int i=1; i<=theBits; i++,k++)
	{
		JButton button = new JButton(""+k);
		button.setFont(font);
		button.addActionListener(this);
		// buttons1.add(button);
		stack.add(button);
		centerPanel1.add(button);
	}

	for (int i=1; i<=theBits; i++)
	{
		buttons1.add(stack.pop());
	}

    buttons2 = new ArrayList<JButton>();
	String theText = "";

	// these are the array values

	for (int i=1; i<=theBits; i++)
	{
		int value = list1.get(i-1);
		theText = value + "";
		JButton button = new JButton(theText);
		button.setFont(font);
		buttons2.add(button);
		centerPanel1.add(button);

	}



    mainPanel.setLayout(new BorderLayout());

    northPanel.setBackground(new Color(115,205,255));
    southPanel.setBackground(new Color(115,205,255));
    westPanel.setBackground(new Color(115,205,255));
    eastPanel.setBackground(new Color(115,205,255));
    // ***** You need to add buttons, etc. to the 5 panels *****

	centerPanel.add(centerPanel1);
	centerPanel.add(centerPanelSpacer);
	centerPanel.add(centerPanel2);
	centerPanel.add(centerPanel3);

    // ***** add the panels to the mainPanel 5 areas *****
    mainPanel.add(northPanel,BorderLayout.NORTH);
    mainPanel.add(southPanel,BorderLayout.SOUTH);
    mainPanel.add(eastPanel,BorderLayout.EAST);
    mainPanel.add(westPanel,BorderLayout.WEST);
    mainPanel.add(centerPanel,BorderLayout.CENTER);

    // make the mainPanel be the main content area and show it
    setContentPane(mainPanel);
    setVisible(true);  // always show the screen last
  }   // end of public void initialize

  // ***** default constructor *****

  public ArrayListMathRunner( )
  {
    // initialize variables

    setSize(1120,600);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    // FINISH ME
    setTitle("ArrayList Math by NEO WANG  YOUR NAME GOES HERE 2019");


    initialize( );

  }




 // ***** ActionListener interface methods *****

  // start of actionPerformed (ActionListener interface)
  public void actionPerformed(ActionEvent e) {
    Object source = e.getSource();
    if (source == exitMenuItem) {
      System.exit(0);
    }  // end of if

	else if (nextListButton == source)
	{
		list1.clear();

		for (int i=0; i<theBits; i++)
		{
			int x = (int) (Math.random() * 41 + 60);
			list1.add(x);
		}

		sumValueLabel.setText("Sum = ");
		averageValueLabel.setText("Average = ");
		largestValueLabel.setText("Largest = ");
		smallestValueLabel.setText("Smallest = ");
		evensValueLabel.setText("Number of Evens = ");
		oddsValueLabel.setText("Number of Odds = ");
		gte90ValueLabel.setText("Number >= 90:");
		lt70ValueLabel.setText("Number < 70:");

		// these are the array values
		for (int i=1; i<=theBits; i++)
		{
			int value = list1.get(i-1);
			String theText = value + "";
			buttons2.get(i-1).setText(theText);

		}


	}

	else if (calculateButton == source)
	{

		int sum = ArrayListMath.getSum(list1);  // call the appropriate static method in class ArrayLibrary
		sumValueLabel.setText("Sum: "+sum);


		double average = ArrayListMath.getAverage(list1); // call the appropriate static method in class ArrayListLibrary
		averageValueLabel.setText("Average: "+average);


		// finds the largest number in the list
		int largest = ArrayListMath.getLargestValue(list1); // call the appropriate static method in class ArrayListLibrary
		largestValueLabel.setText("Largest: "+largest);

		// finds the smallest number in the list
		int smallest = ArrayListMath.getSmallestValue(list1); // call the appropriate static method in class ArrayListLibrary
		smallestValueLabel.setText("Smallest: "+smallest);


		// finds the number of numbers in the list
		// that are even numbers
		int numEvens = ArrayListMath.getNumberOfEvens(list1); // call the appropriate static method in class ArrayListLibrary
		evensValueLabel.setText("Number of Evens: "+numEvens);


		// finds the number of numbers in the list
		// that are odd numbers
		int numOdds = ArrayListMath.getNumberOfOdds(list1);  // call the appropriate static method in class ArrayListLibrary
		oddsValueLabel.setText("Number of Odds: "+numOdds);


		// finds the number of numbers in the list
		// that are greater than or equal to 90
		int numGTE90 = ArrayListMath.getNumberOfNumbersGTE(list1,90);  // call the appropriate static method in class ArrayListLibrary
		gte90ValueLabel.setText("Number >= 90: "+numGTE90);


		// finds the number of numbers in the list
		// that are less than 70
		int numLT70 = ArrayListMath.getNumberOfNumbersLT(list1,70);  // call the appropriate static method in class ArrayListLibrary
		lt70ValueLabel.setText("Number < 70: "+numLT70);


	}
  }  // end of actionPerformed



  // ***** main method *****
  public static void main(String[] arguments) {
    ArrayListMathRunner arrayListMath = new ArrayListMathRunner( );
  }


} // end of class ArrayListMathRunner
