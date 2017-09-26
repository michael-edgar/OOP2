package com.example.ProblemSet1;

import javax.swing.*;
import java.awt.Font;

public class Problem6V2 {
    public static void main(String[] args) {
        int number;

        JTextArea cubeArea = new JTextArea(16,20);

        Font cubeFont = new Font("monospaced", Font.PLAIN, 12);
        cubeArea.setFont(cubeFont);

        cubeArea.setText(String.format("%-15s%-5s\n%-15s%-5s\n", "Number", "Cube", "------", "----"));

        for(int i = 1; i <= 15; i++)
        {
            cubeArea.append(String.format("%-15s%-5s\n", i, MyMethods.cube(i)));
        }

        JOptionPane.showMessageDialog(null, cubeArea, "Cubes", JOptionPane.PLAIN_MESSAGE);
        System.exit(0);
    }//End of main
}//End of class
