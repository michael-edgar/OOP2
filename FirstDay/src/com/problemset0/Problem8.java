package com.problemset0;

/**
 * Created by t00194492 on 19/09/2017.
 */

import javax.swing.JOptionPane;
public class Problem8 {
    public static void main(String[] args) {
        int Length, i;
        String LengthAsString;
        boolean Valid = false;

        LengthAsString = JOptionPane.showInputDialog("Please enter the amount of numbers you will enter");

        while(!Valid)
        {
            if(!LengthAsString.equals(""))
            {
                for(i = 0; i <= LengthAsString.length(); i++)
                {
                    if(!Character.isDigit(LengthAsString.charAt(i)));
                    {
                        break;
                    }//End of if Digits
                }//End of for loop validation

                if(i == LengthAsString.length())
                {
                    Valid = true;
                }//End of if correct length

                else
                {
                    LengthAsString = JOptionPane.showInputDialog("1Error! Please enter a valid number");
                }
            }//End of if blank

            else
            {
                LengthAsString = JOptionPane.showInputDialog("2Error! Please enter a valid number");
            }


        }//End of validation loop

        JOptionPane.showMessageDialog(null, LengthAsString, "Test", JOptionPane.PLAIN_MESSAGE);
        /*
        Length = Integer.parseInt(LengthAsString);

        int [] Numbers = new int[Length];

        for(int j = 0; j < Length; j++)
        {

        }*/
    }//End of main method
}//End of Class
