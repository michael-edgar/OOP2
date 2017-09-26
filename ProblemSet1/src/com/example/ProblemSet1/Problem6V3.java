package com.example.ProblemSet1;

import javax.swing.*;
import java.awt.Font;

public class Problem6V3 {
    public static void main(String[] args) {
        int length, cube;
        String lengthAsString;

        lengthAsString = JOptionPane.showInputDialog("Please enter the length of the container of face cream " +
                        "to the nearest cm");

        length = validInt(lengthAsString);

        cube = MyMethods.cube(length);

        if(cube > 100)
        {
            JOptionPane.showMessageDialog(null, "You can't take this on board, " +
                    "put it into your check-in luggage", "Too Large", JOptionPane.INFORMATION_MESSAGE);
        }

        else
        {
            JOptionPane.showMessageDialog(null, "You can take this on board", "Small Enough",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        System.exit(0);
    }//End of main

    public static int validInt(String x)
    {
        int number, i;
        boolean valid = false;

        while(!valid)
        {
            if(!x.equals(""))
            {
                for(i = 0; i < x.length(); i++)
                {
                    if(!Character.isDigit(x.charAt(i)))
                    {
                        break;
                    }
                }

                if(i == x.length())
                {
                    valid = true;
                }

                else
                {
                    x = JOptionPane.showInputDialog("Invalid int, please re-enter");
                }
            }

            else
            {
                x = JOptionPane.showInputDialog("Invalid int, please re-enter");
            }
        }

        number = Integer.parseInt(x);
        return number;
    }//End of valid int
}//End of class
