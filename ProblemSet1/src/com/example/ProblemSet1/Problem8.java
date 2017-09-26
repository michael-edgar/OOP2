package com.example.ProblemSet1;

import javax.swing.JOptionPane;

public class Problem8 {
    public static void main(String[] args) {
        int [] intArray = new int[10];
        String numString;

        for(int i = 0; i < 10; i++)
        {
            numString = (JOptionPane.showInputDialog("Please enter integer " +(i+1)+ ": "));

            intArray[i] = Problem6V3.validInt(numString);
        }//End of array for

        JOptionPane.showMessageDialog(null, "The first value in the array is " +intArray[0]+
                "\nThe 5th number in the array is " +intArray[4], "Results", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }//End of main
}//End of class
