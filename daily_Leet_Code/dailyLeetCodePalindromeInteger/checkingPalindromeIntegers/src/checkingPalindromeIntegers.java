import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//class for checking whether the number entered is a palindrome or not
public class checkingPalindromeIntegers implements ActionListener {

    //importing all the required instance variables
    private static JPanel panel;
    private static JFrame frame;
    private static JLabel numberLabel;
    private static JPasswordField numberText;
    private static JButton button;
    private static JLabel result;

    //the backbone (main method)
    public static void main(String[] args){

        //instantiating the new JPanel and the JFrame
        panel = new JPanel();
        frame = new JFrame();

        /*
         * setting the size of the frame,
         * setting the default close operation,
         * adding the panel to the frame
          */
        frame.setSize(800,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        //setting the layout of the panel to null
        panel.setLayout(null);

        //instantiating numberLabel as the new JLabel()
        numberLabel = new JLabel();

        /*
        * setting the text to display in the numberLabel JLabel()
        * setting the bounds of the numberLabel
        * adding the numberLabel JLabel() to the panel
         */
        numberLabel.setText("Kindly enter the number to check whether it's palindrome or not: ");
        numberLabel.setBounds(80,80,375,20);
        panel.add(numberLabel);

        /*
         * instantiating the numberText JPasswordField(), and also limiting maximum characters being added
         * setting the bounds of the numberText
         * adding the numberText JPasswordField() to the panel
         */
        numberText = new JPasswordField(20);
        numberText.setBounds(470,80,100,20);
        panel.add(numberText);

        /*
         * instantiating a new button JButton(),
         * setting the text to be displayed in the button
         * setting the bounds of the button
         * adding an actionListener to the button
         * adding the button to the panel
         */
        button = new JButton();
        button.setText("Check");
        button.setBounds(410,140,100,20);
        button.addActionListener(new checkingPalindromeIntegers());
        panel.add(button);

        /*
         * instantiating the new JLabel() result
         * setting the text to display in result JLabel() to be an empty string for now
         * setting the bounds of the result label
         * adding the result label to the panel
         */
        result = new JLabel("");
        result.setBounds(410,180,400,20);
        panel.add(result);

        // setting the value of setVisible of the frame to be true
        frame.setVisible(true);
    }

    // the method which takes care of the actionListener event
    @Override
    public void actionPerformed(ActionEvent e) {
        // declaring a string which stores the number being entered in the numberText field
        String number = numberText.getText();

        // converting the string to an integer as we are finding whether the integer is a palindrome or not
        int num = Integer.parseInt(number);

        /*
        * passing in the value enterd by the user in numberText field to the isPalindrome method and
        * storing the returned boolean value in a boolean variable called palindrome
        */
        boolean palindrome = isPalindrome(num);

        // using if conditionals to show the result to the user, by setting the text of the result JLabel
        if(palindrome){
            result.setText(num + " is a palindrome integer.");
        }
        else{
            result.setText(num + " isn't a palindrome integer.");
        }

    }

    /**
     * isPalindrome() method which is checks the logic and returns a boolean value based on whether the integer is a palindrome or not
     * @param x an integer value entered by the user
     * @return result, a boolean value which returns a boolean value based on whether the value entered by the user is palindrome or not
     */
    public static boolean isPalindrome(int x) {

            // an integer variable remove which stores each value which is removed in each step
            int remove = 0;

            // an integer variable reverse which stores the reverse value for the input
            int reverse = 0;

            // an integer variable org which stores the original value passed to the method
            int org = x;

            // a boolean variable result which is the returning value for the isPalindrome method
            boolean result = false;

            // beginning of the while loop, which ends only when the value of x is equal to zero
            while(x!=0){
                // updating the value of remove, reverse and x
                remove = x%10;
                reverse = reverse*10 + remove;
                x= x/10;
            }

            // conditional statements which compare the value of reversed and original integers, and  update the returning value accordingly
            if(reverse == org){
                result = true;
            }
            else{
                result = false;
            }

            //return statement, which returns the boolean variable based on the code executed above
            return result;
        }
}
