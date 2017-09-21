package com.example.ProblemSet1;

/**
 * Created by t00194492 on 21/09/2017.
 */

import javax.swing.*;
import java.awt.Font;

public class Problem4 {
    public static void main(String[] args) {
        String FullName, UppercaseName, Surname;
        char Initial;
        int NameLength, LastSpace;

        JTextArea NameArea = new JTextArea(5,50);

        Font NameFont = new Font("monospaced", Font.PLAIN, 12);
        NameArea.setFont(NameFont);

        FullName = JOptionPane.showInputDialog("Please enter your full name including any middle name you may have:");

        FullName = NameValidator(FullName);

        NameLength = FullName.length();
        Initial = FullName.charAt(0);
        UppercaseName = FullName.toUpperCase();
        LastSpace = FullName.lastIndexOf(' ');
        Surname = FullName.substring(LastSpace);

        NameArea.setText(String.format("%-30s%-30s\n%-30s%-1s\n%-30s%-30s\n%-29s%-20s", "Full name:", FullName,
                "First name initial:", Initial, "Name in uppercase:", UppercaseName, "Surname:", Surname));

        JOptionPane.showMessageDialog(null, NameArea, "Results", JOptionPane.PLAIN_MESSAGE);

    }//End of Main Method

    public static String NameValidator(String Name)
    {
        String ValidName;
        boolean valid = false;
        int i;

        while(!valid)
        {
            if(!Name.equals(""))
            {
                for(i = 0; i < Name.length(); i++)
                {
                    if (!Character.isLetter(Name.charAt(i)) && Name.charAt(i) != ' '
                            && Name.charAt(i) != '\'' && Name.charAt(i) != '-')
                    {
                        break;
                    }//End of if letter/space
                }//End of for letter test

                if(i == Name.length())
                {
                    valid = true;
                }//End of valid if

                else
                {
                    Name = JOptionPane.showInputDialog("Error! The name you entered is invalid, please re-enter your name:");
                }//End of invalid symbol error
            }

            else
            {
                Name = JOptionPane.showInputDialog("Error! The name you entered is invalid, please re-enter your name:");
            }//End of empty string error
        }//End of Validation while loop

        ValidName = Name;

        return ValidName;
    }//End of Validation Method
}//End of Class




