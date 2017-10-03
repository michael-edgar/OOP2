package com.example.ProblemSet2;

/**
 * Created by t00194492 on 28/09/2017.
 */

import javax.swing.JOptionPane;
public class TestFraction {
    public static void main(String[] args) {

        Fraction f1 = new Fraction(2,3);
        Fraction f2 = new Fraction(3,8);

        Fraction fAns = new Fraction();
        fAns = fAns.addFractions(f1, f2);

        Fraction fAns2 = new Fraction();
        fAns2 = fAns2.subtractFractions(f1, f2);

        Fraction fAns3 = new Fraction();
        fAns3 = fAns3.multiplyFractions(f1,f2);

        Fraction fAns4 = new Fraction();
        fAns4 = fAns4.divideFractions(f1,f2);

        JOptionPane.showMessageDialog(null, "The first fraction is: " +f1+
                                      "\nThe second fraction is: " +f2+
                                      "\n" +f1+ " + " +f2+ " = " +fAns+
                                      "\n" +f1+ " - " +f2+ " = " +fAns2+
                                      "\n" +f1+ " x " +f2+ " = " +fAns3+
                                      "\n" +f1+ " / " +f2+ " = " +fAns4);

    }//End of main
}//End of TestFraction Class
