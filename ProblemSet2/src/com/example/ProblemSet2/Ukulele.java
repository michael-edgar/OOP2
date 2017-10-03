package com.example.ProblemSet2;


import javax.swing.JOptionPane;
public class Ukulele {
    public static void main(String[] args) {
        char ukuleleTuning [] = new char[4];
        char guitarTuning [] = new char[6];

        ukuleleTuning [0] = 'G';
        ukuleleTuning [1] = 'C';
        ukuleleTuning [2] = 'E';
        ukuleleTuning [3] = 'A';

        guitarTuning [0] = 'E';
        guitarTuning [1] = 'A';
        guitarTuning [2] = 'D';
        guitarTuning [3] = 'G';
        guitarTuning [4] = 'B';
        guitarTuning [5] = 'E';

        Instrument ukulele = new Instrument("Kala", "Cherry Oak", ukuleleTuning, 2, 4, 250.00);
        Instrument guitar = new Instrument("Fender", "Ash", guitarTuning, 5, 6, 750.00);

        JOptionPane.showMessageDialog(null, "" + ukulele, "Ukulele", JOptionPane.PLAIN_MESSAGE);

        JOptionPane.showMessageDialog(null, "" + guitar, "Guitar", JOptionPane.PLAIN_MESSAGE);

        System.exit(0);
    }
}
