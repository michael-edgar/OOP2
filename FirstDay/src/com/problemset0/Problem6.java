package com.problemset0;

/**
 * Created by t00194492 on 14/09/2017.
 */
import sun.misc.JavaObjectInputStreamAccess;

import javax.swing.JOptionPane;
public class Problem6 {
    public static void main(String[] args) {

        String ChoiceAsString, Num1, Num2;
        float Number1, Number2, Answer = 0;
        boolean valid = false;
        char Choice;

        ChoiceAsString = JOptionPane.showInputDialog("Please choose an operation: Addition (A), " +
            "Subtraction (S), Multiplication (M) or Division (D): ");

        ChoiceAsString = ChoiceAsString.toUpperCase();

        Choice = ChoiceAsString.charAt(0);

        while(Choice != 'Q')
        {


            switch(Choice)
            {
                case 'A':
                {
                    Num1 = JOptionPane.showInputDialog("Please enter the first Number:");
                    Number1 = Float.parseFloat(Num1);

                    Num2 = JOptionPane.showInputDialog("Please enter the second Number:");
                    Number2 = Float.parseFloat(Num2);

                    Answer = Number1 + Number2;
                    valid = true;
                    break;
                }//End of Case A

                case 'S':
                {
                    Num1 = JOptionPane.showInputDialog("Please enter the first Number:");
                    Number1 = Float.parseFloat(Num1);

                    Num2 = JOptionPane.showInputDialog("Please enter the second Number:");
                    Number2 = Float.parseFloat(Num2);

                    Answer = Number1 - Number2;
                    valid = true;
                    break;
                }//End of Case S

                case 'M':
                {
                    Num1 = JOptionPane.showInputDialog("Please enter the first Number:");
                    Number1 = Float.parseFloat(Num1);

                    Num2 = JOptionPane.showInputDialog("Please enter the second Number:");
                    Number2 = Float.parseFloat(Num2);

                    Answer = Number1 * Number2;
                    valid = true;
                    break;
                }//End of Case M

                case 'D':
                {
                    Num1 = JOptionPane.showInputDialog("Please enter the first Number:");
                    Number1 = Float.parseFloat(Num1);

                    Num2 = JOptionPane.showInputDialog("Please enter the second Number:");
                    Number2 = Float.parseFloat(Num2);

                    Answer = Number1 / Number2;
                    valid = true;
                    break;
                }//End of Case D

                case 'Q':
                {
                    break;
                }//End of Case Q

                default:
                {
                    JOptionPane.showMessageDialog(null,
                            "Error!! Invalid Answer, Please re-enter: ", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }//End of Default Case
            }// End of Switch

            if(Choice == 'Q')
            {
                break;
            }//End of Exit Condition

            if(valid)
            {
                JOptionPane.showMessageDialog(null,
                    "The Answer to your question is " +Answer, "Answer",
                        JOptionPane.INFORMATION_MESSAGE);

                valid = false;
            }//End of Boolean

            ChoiceAsString = JOptionPane.showInputDialog("Please choose another operation: Addition (A), " +
                    "Subtraction (S), Multiplication (M) or Division (D): ");

            ChoiceAsString = ChoiceAsString.toUpperCase();

            Choice = ChoiceAsString.charAt(0);
        }//End of While
    }//End of Main
}//End of Class
