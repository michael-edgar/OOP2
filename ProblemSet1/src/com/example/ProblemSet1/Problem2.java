package com.example.ProblemSet1;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.Font;

public class Problem2 {
    public static void main(String[] args) {
        int Yard, Foot, Inch;

        JTextArea YardConversion = new JTextArea(10,20);

        Font TextAreaFont = new Font("monospaced", Font.PLAIN,12);
        YardConversion.setFont(TextAreaFont);

        YardConversion.setText(String.format("%-6s%-5s%-6s\n", "Yards", "Feet", "Inches"));

        for(Yard = 1; Yard <= 10; Yard ++)
        {
            Foot = Yard * 3;
            Inch = Foot * 12;

            YardConversion.append(String.format("%-6d%-5d%-6d\n", Yard, Foot, Inch));
        }

        JOptionPane.showMessageDialog(null, YardConversion, "Yard Conversion", JOptionPane.PLAIN_MESSAGE);

        System.exit(0);
    }
}
