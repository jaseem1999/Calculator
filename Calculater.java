import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculater implements ActionListener {
    boolean isOperatorClicked = false;
    boolean isMinOperatorClick = false;
    String oldVariable;
    JFrame jf;
    String oldValue;
    JLabel displayLabel;
    JButton seveButton;
    JButton eightButton;
    JButton nineButton;
    JButton fiveButton;
    JButton fourButton;
    JButton sixButton;
    JButton oneButton;
    JButton twoButton;
    JButton threeButton;
    JButton dotButton;
    JButton zeroButton;
    JButton equalButton;
    JButton divButton;
    JButton mulButton;
    JButton minButton;
    JButton plusButton;
    JButton clearButton;/// define the jbuttons 


    public Calculater() {
        jf = new JFrame("Calculater");///set frame JFrame and Entered heading
        jf.setLayout(null);// set layout null
        jf.setSize(600,500);// set size of the frame JFrame
        jf.setLocation(300,50);//Application location for the screen opening
        displayLabel = new JLabel();// set the label JLabel
        displayLabel.setBounds(30,50,540,40);//set the location of the label and size
        displayLabel.setBackground(Color.gray);//set the background color of the displayLabel
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);// set the displayLabel's horizontal alignment to right numaric '
        displayLabel.setForeground(Color.white);//set the foreground color of the displayLabel
        displayLabel.setOpaque(true);//set true for seeing
        jf.add(displayLabel);// displayLabel adding to the frame 


        seveButton = new JButton("7");// Jbutton for 7 
        seveButton.setBounds(30,130,50,50);/// set location and size of the button
        seveButton.addActionListener(this);///// adding to, action listeners
        jf.add(seveButton);// add the 7 button in frame Jframe


        eightButton = new JButton("8");// Jbutton for 8
        eightButton.setBounds(100,130,50,50);/// set location and size of the button
        eightButton.addActionListener(this);/// adding to, action listeners
        jf.add(eightButton);// add the 8 button in frame Jframe

        nineButton = new JButton("9");// Jbutton for 9
        nineButton.setBounds(170, 130, 50, 50);/// set location and size of the button
        nineButton.addActionListener(this);/// adding to, action listeners
        jf.add(nineButton);// add the 9 button in frame Jframe

        fourButton = new JButton("4");// Jbutton for 4
        fourButton.setBounds(100, 190, 50, 50);/// set location and size of the button
        fourButton.addActionListener(this);/// adding to, action listeners
        jf.add(fourButton);// add the 6 button in frame Jframe

        fiveButton = new JButton("5");// Jbutton for 5
        fiveButton.setBounds(170, 190, 50, 50);/// set location and size of the button100, 190, 50, 50
        fiveButton.addActionListener(this);/// adding to, action listeners
        jf.add(fiveButton);// add the 5 button in frame Jframe

        

        sixButton = new JButton("6");// Jbutton for 6
        sixButton.setBounds(30, 190, 50, 50);/// set location and size of the button
        sixButton.addActionListener(this);/// adding to, action listeners
        jf.add(sixButton);// add the 6 button in frame Jframe

        oneButton = new JButton("1");// Jbutton for 1
        oneButton.setBounds(30, 260, 50, 50);/// set location and size of the button
        oneButton.addActionListener(this);/// adding to, action listeners
        jf.add(oneButton);// add the 2 button in frame Jframe

        twoButton = new JButton("2");// Jbutton for 2
        twoButton.setBounds(100, 260, 50, 50);/// set location and size of the button
        twoButton.addActionListener(this);/// adding to, action listeners
        jf.add(twoButton);// add the 2 button in frame Jframe

        threeButton = new JButton("3");// Jbutton for 3
        threeButton.setBounds(170, 260, 50, 50);/// set location and size of the button
        threeButton.addActionListener(this);/// adding to, action listeners
        jf.add(threeButton);// add the 3 button in frame Jframe

        dotButton = new JButton(".");// Jbutton for '.'
        dotButton.setBounds(30, 330, 50, 50);/// set location and size of the button
        dotButton.addActionListener(this);// / adding to, action listeners
        jf.add(dotButton);// add the '.' button in frame Jframe

        zeroButton = new JButton("0");// Jbutton for 0
        zeroButton.setBounds(100, 330, 50, 50);/// set location and size of the button
        zeroButton.addActionListener(this);
        jf.add(zeroButton);// add the 0 button in frame Jframe

        equalButton = new JButton("=");// Jbutton for =
        equalButton.setBounds(170, 330, 50, 50);/// set location and size of the button
        equalButton.addActionListener(this);/// adding to, action listeners
        jf.add(equalButton);// add the = button in frame Jframe

        divButton = new JButton("/");// Jbutton for '/'
        divButton.setBounds(240, 130, 50, 50);/// set location and size of the button
        divButton.addActionListener(this);/// adding to, action listeners
        jf.add(divButton);// add the '/' button in frame Jframe

        mulButton = new JButton("X");// Jbutton for '*'
        mulButton.setBounds(240, 190, 50, 50);/// set location and size of the button
        mulButton.addActionListener(this);
        jf.add(mulButton);// add the '*' button in frame Jframe

        minButton = new JButton("-");// Jbutton for '-'
        minButton.setBounds(240, 260, 50, 50);/// set location and size of the button
        minButton.addActionListener(this);/// adding to, action listeners
        jf.add(minButton);// add the '-' button in frame Jframe

        plusButton = new JButton("+");// Jbutton for '+'
        plusButton.setBounds(240, 330, 50, 50);/// set location and size of the button
        plusButton.addActionListener(this);/// adding to, action listeners
        jf.add(plusButton);// add the '+' button in frame Jframe

        clearButton = new JButton("Cl");// Jbutton for 'clear'
        clearButton.setBounds(310, 330, 50, 50);/// set location and size of the button
        clearButton.addActionListener(this);///adding to, action listeners
        jf.add(clearButton);// add the 'clear' button in frame Jframe

        /* 

          Jbutton 
          ________________
         |________________|

          7  8  9  /
          6  5  4  *
          3  2  1  -
          .  0  =  +  clear
        */

        jf.setVisible(true);// visible the frame
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//set for clossing the application window with stop the pogramme
        
    }
    public static void main(String[] args) {
        new Calculater();//function called
    }
    
    /*
     * 
     * implements Action ActionListener 
     * Button and operators Clicked chacking if condition to the action implement
     * 
     * 
     * 
     */ 
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == seveButton) {
            /*
            isOperstorClicked is boolean variable 
    
            */
            if(isOperatorClicked){
                displayLabel.setText("7");// isOperatorClicked is True the button will become primary 
                isOperatorClicked = false;// isOperatorClicked then button become primary value then isOperatorClicked must will be false
            }else{
                displayLabel.setText(displayLabel.getText() + "7");///Didn't  isOperatorClicked the if any exit value add primary value
            }


        }else if(e.getSource() == eightButton){
            if (isOperatorClicked) {
                displayLabel.setText("8");
                isOperatorClicked = false;
            }else{
                displayLabel.setText(displayLabel.getText() + "8");
            }
             
           
        }else if (e.getSource() == nineButton) {
            if (isOperatorClicked) {
                displayLabel.setText("9");
                isOperatorClicked = false;
            }else{
                displayLabel.setText(displayLabel.getText() + "9");
            }
        }else if(e.getSource() == fiveButton) {
            if (isOperatorClicked) {
                displayLabel.setText("5");
                isOperatorClicked = false;
            }else{
                displayLabel.setText(displayLabel.getText() + "5");
            }
        }else if (e.getSource() == fourButton) {
            if (isOperatorClicked) {
                displayLabel.setText("4");
                isOperatorClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "4");
            }
           
        }else if(e.getSource() == sixButton) {
            if (isOperatorClicked) {
                displayLabel.setText("6");
                isOperatorClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "6");
            }
           
        }else if (e.getSource() == oneButton ) {
            if (isOperatorClicked) {
                displayLabel.setText("1");
                isOperatorClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "1");
            }
            
        }else if (e.getSource() == twoButton) {
            if (isOperatorClicked) {
                displayLabel.setText("2");
                isOperatorClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "2");
            }
            
        }else if(e.getSource() == threeButton) {
            if (isOperatorClicked) {
                displayLabel.setText("3");
                isOperatorClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "3");
            }
            
        }else if (e.getSource() == zeroButton) {
            if (isOperatorClicked) {
                displayLabel.setText("0");
                isOperatorClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "0");
            }
            
        } else if (e.getSource() == clearButton) {
            displayLabel.setText("");
        }
        else if (e.getSource() == dotButton) {
            if (isOperatorClicked) {
                displayLabel.setText(".");
                isOperatorClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + ".");
                
            }
            
            
        }else if(e.getSource() == equalButton) {
            String newValue = displayLabel.getText();
            float oldValueF = Float.parseFloat(oldValue);
            float newValueF = Float.parseFloat(newValue); 
            float result;   
            result = oldValueF + newValueF;
            displayLabel.setText(result + "");
            
            String newValueMe = displayLabel.getText();
            float oldValueM = Float.parseFloat(oldVariable);
            float newValueM = Float.parseFloat(newValueMe);
            float resultm; 
            resultm = oldValueM - newValueM;
            displayLabel.setText(resultm + "");
            

            
            
            
        }else if (e.getSource() == divButton) {

        }else if (e.getSource() == mulButton){

        }else if (e.getSource() == plusButton){
            isOperatorClicked = true;
            oldValue = displayLabel.getText();

        }else if (e.getSource() == minButton) {
            isMinOperatorClick = true;
            oldValue = displayLabel.getText();
            

        }
    
    }
}
