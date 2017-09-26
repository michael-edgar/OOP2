package com.example.ProblemSet1;

import javax.swing.JOptionPane;

public class Problem9 {
    public static void main(String[] args) {
        double [] calfWeights = new double[10];
        int less250 = 0;
        float over400 = 0, average;
        double lightest = 1000000000, total = 0;
        String weightString = "Weights: ";

        arrayFiller(calfWeights);

        for(int i = 0; i < calfWeights.length; i++)
        {
            if(calfWeights[i] < 250)
            {
                less250++;
            }

            if(calfWeights[i] < lightest)
            {
                lightest = calfWeights[i];
            }

            if(calfWeights[i] >= 400)
            {
                over400++;
            }

            total += calfWeights[i];
            if(i < 9)
            {
                weightString += String.format("%.1f", calfWeights[i]) + ", ";
            }

            else
            {
                weightString += String.format("%.1f", calfWeights[i]);
            }
        }



        JOptionPane.showMessageDialog(null, weightString+ "\nNumber under 250kg: " + less250+
        "\nPercentage over 400kg: " +String.format("%.1f", (over400/calfWeights.length)*100)+ "%\nLightest animal: " +String.format("%.1f", lightest)+ " kg\n" +
        "Average weight: " + String.format("%.1f", (total/calfWeights.length))+ " kg");

        System.exit(0);
    }//End of main

    public static void arrayFiller(double[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            array[i] = Math.random()*1000;
        }
    }//End of arrayFiller
}//End of class
