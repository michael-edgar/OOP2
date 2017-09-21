package com.example.ProblemSet1;

import javax.swing.JOptionPane;

public class Problem1 {
    public static void main(String[] args) {
        float Rate, Pounds, Euro;
        String RateString, PoundsString;

        RateString = JOptionPane.showInputDialog("Please enter the current rate of £ to €");

        while(RateString.equals("0"))
        {
            RateString = JOptionPane.showInputDialog("Error cannot be 0! Please enter the current rate of £ to €");
        }

        Rate = IsValidAnswer(RateString);

        PoundsString = JOptionPane.showInputDialog("Please enter a number you want to convert from £ to €");

        while(!PoundsString.equals("0"))
        {
            Pounds = IsValidAnswer(PoundsString);

            Euro = Pounds * Rate;

            JOptionPane.showMessageDialog(null, "£" +String.format("%.2f", Pounds)+ " is equal to €" +
                    String.format("%.2f", Euro), "Answer", JOptionPane.INFORMATION_MESSAGE);

            PoundsString = JOptionPane.showInputDialog("Please enter another number you want to convert from £ to €");

        }
    }//End of Main method

    public static float IsValidAnswer(String NumString)
    {
        float Number;
        boolean Valid = false;
        int i;

        while(!Valid)
        {
            if(!NumString.equals(""))
            {
                for(i = 0; i < NumString.length(); i++)
                {
                    if(!Character.isDigit(NumString.charAt(i)) && NumString.charAt(i) != '.')
                    {
                        break;
                    }//End of not digit
                }//End of for

                if(i == NumString.length())
                {
                    Valid = true;
                }//End of is Valid

                else
                {
                    NumString = JOptionPane.showInputDialog("Error must be digits! Please enter the current rate of £ to €");
                }//End of else not digits
            }//End of empty

            else
            {
                NumString = JOptionPane.showInputDialog("Error, empty string! Please enter the current rate of £ to €");
            }//End of else empty
        }//End of while

        Number = Float.parseFloat(NumString);

        return Number;
    }
}//End of Class
