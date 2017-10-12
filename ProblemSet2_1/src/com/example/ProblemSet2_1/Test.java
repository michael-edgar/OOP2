package com.example.ProblemSet2_1;

import javax.swing.JOptionPane;

public class Test {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();

        b1.setAccnum(JOptionPane.showInputDialog("Please enter your account number: "));
        String balanceAsString = JOptionPane.showInputDialog("Please enter your balance: ");
        b1.setBalance(validNumber(balanceAsString));
        Person p1 = new Person(JOptionPane.showInputDialog("Please enter your name"));
        b1.setCustomer(p1);

        JOptionPane.showMessageDialog(null, b1);

        System.exit(0);
    }//End of main

    public static double validNumber(String numberAsString)
    {
        boolean valid = false;
        double number = 0;

        return number;
    }//End of validNumber
}//End of Test Class
