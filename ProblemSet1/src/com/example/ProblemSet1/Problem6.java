package com.example.ProblemSet1;

/**
 * Created by t00194492 on 21/09/2017.
 */

import javax.swing.*;
import java.awt.*;
public class Problem6 {
    public static void main(String[] args) {

        JTextArea CubeArea = new JTextArea(18,20);

        Font textAreaFont = new Font("monospaced", Font.PLAIN, 12);
        CubeArea.setFont(textAreaFont);

        CubeArea.setText(String.format("%-15s%-5s"));

        for(int i = 1; i <= 15; i++)
        {
            cube(i);
        }
    }//End of main method

    public static int cube(int i)
    {
        int I = 0;

        return I;
    }
}//End of Class
