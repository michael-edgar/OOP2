package com.example.ProblemSet2;

/**
 * Created by t00194492 on 28/09/2017.
 */

import javax.swing.JOptionPane;

public class MyBicycle {
    public static void main(String[] args) {
        String ownersName, make, valueString;
        double value, totalValue;

        ownersName = JOptionPane.showInputDialog("Please enter your name");
        valueString = JOptionPane.showInputDialog("Please enter the value of the bicycle");
        value = isValue(valueString);
        make = JOptionPane.showInputDialog("Please enter the make of the bicycle");

        Bicycle bc1 = new Bicycle(ownersName, value, make);
        Bicycle bc2 = new Bicycle();

        ownersName = JOptionPane.showInputDialog("Please enter the name of the owner of the second bicycle");
        valueString = JOptionPane.showInputDialog("Please enter the value of the second bicycle");
        value = isValue(valueString);
        make = JOptionPane.showInputDialog("Please enter the make of the second bicycle");

        bc2.setOwnersName(ownersName);
        bc2.setValue(value);
        bc2.setMake(make);

        value = bc1.getValue();
        bc1.setValue((value+10));

        JOptionPane.showMessageDialog(null, "The owner of the first bicycle is: "+
                bc1.getOwnersName() + "\nThe owner of the second bicycle is: "+ bc2.getOwnersName());

        totalValue = (bc1.getValue()) + (bc2.getValue());

        JOptionPane.showMessageDialog(null, "The total value of the bicycles is: "+totalValue);

        System.exit(0);
    }//End of main method

    public static double isValue(String valueString)
    {
        double value;
        boolean valid = false;
        int i, dotCount = 0;

        while(!valid)
        {
            if(!valueString.equals(""))
            {
                for(i = 0; i < valueString.length(); i++)
                {
                    if(!Character.isDigit(valueString.charAt(i)) )
                    {
                        if(valueString.charAt(i) == '.' )
                            if(dotCount == 0)
                            {
                                dotCount ++;
                            }
                            else
                            {
                                break;
                            }
                        else
                            {
                                break;
                            }
                    }
                }//End of for loop

                if(i == valueString.length())
                {
                    valid = true;
                }

                else
                {
                    valueString = JOptionPane.showInputDialog("Error, Please enter a valid value");
                }
            }

            else
            {
                valueString = JOptionPane.showInputDialog("Error, Please enter a valid value");
            }
        }//End of while loop

        value = Double.parseDouble(valueString);

        return value;
    }//End of isValue
}//End of MyBicycle Class
