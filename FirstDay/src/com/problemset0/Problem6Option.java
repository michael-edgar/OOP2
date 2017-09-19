package com.problemset0;

/**
 * Created by t00194492 on 14/09/2017.
 */

import javax.swing.JOptionPane;
public class Problem6Option {
    public static void main(String[] args) {

        String ChoiceAsString, Num1, Num2;
        float Number1, Number2, Answer = 0;
        boolean valid = false;
        char Choice;
        int ChoiceAsInt;

        ChoiceAsInt = JOptionPane.showConfirmDialog(null, "Do you wish to make a calculation?", "Calculation?", JOptionPane.YES_NO_OPTION);

        while(ChoiceAsInt == JOptionPane.YES_OPTION)
        {
         ChoiceAsString = JOptionPane.showInputDialog("Please choose an operation: Addition (A), " +
                "Subtraction (S), Multiplication (M) or Division (D): ");

         while(ChoiceAsString.equals("") || ChoiceAsString.equals(JOptionPane.CANCEL_OPTION) || ChoiceAsString.equals(JOptionPane.CLOSED_OPTION))
         {
             ChoiceAsString = JOptionPane.showInputDialog("Error! Please choose a valid operation: Addition (A), " +
                     "Subtraction (S), Multiplication (M) or Division (D): ");
         }

            ChoiceAsString = ChoiceAsString.toUpperCase();

            Choice = ChoiceAsString.charAt(0);

                switch(Choice)
                {
                    case 'A':
                    {
                        Num1 = JOptionPane.showInputDialog("Please enter the Number:");
                        while(Num1.equals("") ||!Character.isDigit(Num1.charAt(0)) || Num1.equals(JOptionPane.CANCEL_OPTION) || Num1.equals(JOptionPane.CLOSED_OPTION))
                        {
                            Num1 = JOptionPane.showInputDialog("Error! Please enter a valid number: ");
                        }
                        Number1 = Float.parseFloat(Num1);

                        Num2 = JOptionPane.showInputDialog("Please enter the second Number:");
                        while(Num2.equals("") || !Character.isDigit(Num2.charAt(0)) || Num2.equals(JOptionPane.CANCEL_OPTION) || Num2.equals(JOptionPane.CLOSED_OPTION))
                        {
                            Num2 = JOptionPane.showInputDialog("Error! Please enter a valid number: ");
                        }
                        Number2 = Float.parseFloat(Num2);

                        Answer = Number1 + Number2;
                        valid = true;
                        break;
                    }//End of Case A

                    case 'S':
                    {
                        Num1 = JOptionPane.showInputDialog("Please enter the Number:");
                        while(Num1.equals("") ||!Character.isDigit(Num1.charAt(0)) || Num1.equals(JOptionPane.CANCEL_OPTION) || Num1.equals(JOptionPane.CLOSED_OPTION))
                        {
                            Num1 = JOptionPane.showInputDialog("Error! Please enter a valid number: ");
                        }
                        Number1 = Float.parseFloat(Num1);

                        Num2 = JOptionPane.showInputDialog("Please enter the second Number:");
                        while(Num2.equals("") || !Character.isDigit(Num2.charAt(0)) || Num2.equals(JOptionPane.CANCEL_OPTION) || Num2.equals(JOptionPane.CLOSED_OPTION))
                        {
                            Num2 = JOptionPane.showInputDialog("Error! Please enter a valid number: ");
                        }
                        Number2 = Float.parseFloat(Num2);

                        Answer = Number1 - Number2;
                        valid = true;
                        break;
                    }//End of Case S

                    case 'M':
                    {
                        Num1 = JOptionPane.showInputDialog("Please enter the Number:");
                        while(Num1.equals("") ||!Character.isDigit(Num1.charAt(0)) || Num1.equals(JOptionPane.CANCEL_OPTION) || Num1.equals(JOptionPane.CLOSED_OPTION))
                        {
                            Num1 = JOptionPane.showInputDialog("Error! Please enter a valid number: ");
                        }
                        Number1 = Float.parseFloat(Num1);

                        Num2 = JOptionPane.showInputDialog("Please enter the second Number:");
                        while(Num2.equals("") || !Character.isDigit(Num2.charAt(0)) || Num2.equals(JOptionPane.CANCEL_OPTION) || Num2.equals(JOptionPane.CLOSED_OPTION))
                        {
                            Num2 = JOptionPane.showInputDialog("Error! Please enter a valid number: ");
                        }
                        Number2 = Float.parseFloat(Num2);

                        Answer = Number1 * Number2;
                        valid = true;
                        break;
                    }//End of Case M

                    case 'D':
                    {
                        Num1 = JOptionPane.showInputDialog("Please enter the Number:");
                        while(Num1.equals("") ||!Character.isDigit(Num1.charAt(0)) || Num1.equals(JOptionPane.CANCEL_OPTION) || Num1.equals(JOptionPane.CLOSED_OPTION))
                        {
                            Num1 = JOptionPane.showInputDialog("Error! Please enter a valid number: ");
                        }
                        Number1 = Float.parseFloat(Num1);

                        Num2 = JOptionPane.showInputDialog("Please enter the second Number:");
                        while(Num2.equals("") || !Character.isDigit(Num2.charAt(0)) || Num2.equals(JOptionPane.CANCEL_OPTION) || Num2.equals(JOptionPane.CLOSED_OPTION))
                        {
                            Num2 = JOptionPane.showInputDialog("Error! Please enter a valid number: ");
                        }
                        Number2 = Float.parseFloat(Num2);

                        Answer = Number1 / Number2;
                        valid = true;
                        break;
                    }//End of Case D

                    default:
                    {
                        JOptionPane.showMessageDialog(null,
                                "Error!! Invalid Answer, Please re-enter: ", "Error",
                                JOptionPane.ERROR_MESSAGE);
                    }//End of Default Case
                }// End of Switch

                if(valid)
                {
                    JOptionPane.showMessageDialog(null,
                            "The Answer to your question is " +Answer, "Answer",
                            JOptionPane.INFORMATION_MESSAGE);

                    valid = false;
                }//End of Boolean

                ChoiceAsInt = JOptionPane.showConfirmDialog(null,"Do you Wish to do another calculation?", "Another Calculation?", JOptionPane.YES_NO_OPTION);

                Choice = ChoiceAsString.charAt(0);
            }//End of While

        if(ChoiceAsInt != JOptionPane.YES_OPTION)
        {
            JOptionPane.showMessageDialog(null, "Thanks for using this program. Goodbye!", "Goodbye", JOptionPane.PLAIN_MESSAGE);
        }
    }//End of Main Method
}//End of Class
