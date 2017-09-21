package com.example.ProblemSet1;

/**
 * Created by t00194492 on 21/09/2017.
 */

import javax.swing.JOptionPane;

public class Problem5 {
    public static void main(String[] args) {
        int a, b, c;
        String A, B, C;
        Double Answer1, Answer2;

        A = JOptionPane.showInputDialog("Please enter the coefficient of x2");
        a = Validation(A);

        B = JOptionPane.showInputDialog("Please enter the coefficient of x");
        b = Validation(B);

        C = JOptionPane.showInputDialog("Please enter the constant");
        c = Validation(C);

        Answer1 = (-b + Math.sqrt((b*b)-(4*a*c)))/(2*a);
        Answer2 = (-b - Math.sqrt((b*b)-(4*a*c)))/(2*a);

        JOptionPane.showMessageDialog(null, "The answers to the quadratic equation are: "
            + String.format("%.0f", Answer1) + ", " + String.format("%.0f", Answer2) ,
            "Answer", JOptionPane.PLAIN_MESSAGE);

    }//End of main method

    public static int Validation(String Number)
    {
        int num, i;
        boolean valid = false;

        while(!valid)
        {
            if(!Number.equals(""))
            {
                for(i = 0; i < Number.length(); i++)
                {
                    if(!Character.isDigit(Number.charAt(i)) && (i == 0 && Number.charAt(i) != '-'))
                    {
                        break;
                    }
                }//End of for digit test

                if(i == Number.length())
                {
                    valid = true;
                }//End of if valid

                else
                {
                    Number = JOptionPane.showInputDialog("Error! Invalid Number, Please re-enter");
                }//End of else valid
            }//End of if empty

            else
            {
                Number = JOptionPane.showInputDialog("Error! Invalid Number, Please re-enter");
            }//End of else empty
        }//end of while

        num = Integer.parseInt(Number);

        return num;
    }//end of validation method
}//End of class
