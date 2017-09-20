package com.example.ProblemSet1;

import javax.swing.*;
import java.awt.Font;

public class Problem3 {
    public static void main(String[] args) {
        String Name;
        Float Length, Width, TotalArea, Cost, FullCost;

        Name = JOptionPane.showInputDialog("Please enter your name");

        Length = Float.parseFloat(JOptionPane.showInputDialog("Please enter the length of the room"));

        Width = Float.parseFloat(JOptionPane.showInputDialog("Please enter the breadth of the room"));

        TotalArea = Length * Width;

        Cost = Float.parseFloat(JOptionPane.showInputDialog("Please enter the cost per square metre of the carpet"));

        FullCost = Cost * TotalArea;

        JTextArea TextArea = new JTextArea(10,50);

        Font textAreaFont = new Font("monospaced", Font.PLAIN, 12);
        TextArea.setFont(textAreaFont);

        TextArea.setText(String.format("%-40s\n%-40s%.2f%-1s\n%-40s%.2f%-1s\n%-40s%.2f%-4s\n%-40s%.2f%-4s\n%-40s%.2f%-4s",
                "Quotation for " + Name, "Length of Room:", Length, "m", "Breadth of Room:", Width, "m", "Total area of room:",
                TotalArea, "sq.m", "Cost per square metre of carpet:", Cost, "Euro", "Total cost of carpet", FullCost, "Euro"));

        JOptionPane.showMessageDialog(null, TextArea, "Cost of Carpet", JOptionPane.PLAIN_MESSAGE);
    }
}
