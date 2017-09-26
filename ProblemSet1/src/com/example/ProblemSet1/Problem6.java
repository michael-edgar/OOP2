package com.example.ProblemSet1;

/**
 * Created by t00194492 on 21/09/2017.
 */

import javax.swing.*;
import java.awt.*;
public class Problem6 {
    public static void main(String[] args) {

        JTextArea CubeArea = new JTextArea(16,20);

        Font textAreaFont = new Font("monospaced", Font.PLAIN, 12);
        CubeArea.setFont(textAreaFont);

        CubeArea.setText(String.format("%-15s%-5s\n%-15s%-5s\n", "Number", "Cube", "------", "----"));

        for(int i = 1; i <= 15; i++)
        {
            CubeArea.append(String.format("%-15d%-5d\n", i, cube(i)));
        }

        JOptionPane.showMessageDialog(null, CubeArea, "Cubes", JOptionPane.PLAIN_MESSAGE);
        System.exit(0);
    }//End of main method

    public static int cube(int x)
    {
        int cube;

        cube = (x*x*x);

        return cube;
    }
}//End of Class
