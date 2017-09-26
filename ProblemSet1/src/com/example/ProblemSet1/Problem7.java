package com.example.ProblemSet1;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

public class Problem7 {
    public static void main(String[] args) {
        String numAsString;
        int number;

        do {
            numAsString = JOptionPane.showInputDialog("Please enter an integer: ");
            number = isInt(numAsString);

            if(number == -1)
            {
                System.exit(0);
            }

            else if(isEven(number))
            {
                JOptionPane.showMessageDialog(null, number+" is even",
                        "Even", JOptionPane.INFORMATION_MESSAGE);
            }

            else
            {
                JOptionPane.showMessageDialog(null, number+ " is odd",
                        "Odd", JOptionPane.INFORMATION_MESSAGE);
            }
        }while(number != -1);

        System.exit(0);
    }//End of main

    public static boolean isEven(int number)
    {
       boolean valid;

       if(number % 2 == 0)
       {
           valid = true;
       }

       else
       {
           valid = false;
       }

       return valid;
    }//End of isEven method

    public static int isInt(String numString)
    {
        int number, i;
        boolean valid = false;

        if(numString.equals("-1"))
        {
            valid = true;
        }

        while(!valid)
        {
            if(!numString.equals(""))
            {
                for(i = 0; i < numString.length(); i++)
                {
                    if(!Character.isDigit(numString.charAt(i)))
                    {
                        break;
                    }
                }

                if(i == numString.length())
                {
                    valid = true;
                }

                else
                {
                    numString = JOptionPane.showInputDialog("Invalid Integer, please re-enter");
                }
            }
            else
            {
                numString = JOptionPane.showInputDialog("Invalid integer, please re-enter");
            }
        }

        number = Integer.parseInt(numString);

        return number;
    }//End of Int validation
}//End of class
