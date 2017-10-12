package com.example.ProblemSet2_1;

import javax.swing.JOptionPane;

public class Test {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        char bankInterface;
        String balanceAsString, intefaceString, amountString;
        double amount;
        BankAccount [] accounts = new BankAccount[5];
        Person [] people = new Person[5];

        b1.setAccnum(JOptionPane.showInputDialog("Please enter your account number: "));
        balanceAsString = JOptionPane.showInputDialog("Please enter your balance: ");
        b1.setBalance(validNumber(balanceAsString));
        Person p1 = new Person(JOptionPane.showInputDialog("Please enter your name"));
        b1.setCustomer(p1);

        JOptionPane.showMessageDialog(null, b1);

        intefaceString = JOptionPane.showInputDialog("Please choose an option: \n\t1. Deposit Money \n\t2. Withdraw Money \n\t3.Exit");

        bankInterface = intefaceString.charAt(0);

        while(bankInterface != '3')
        {
            switch (bankInterface)
            {
                case '1':
                {
                    amountString = JOptionPane.showInputDialog("Please enter the amount you wish to deposit");
                    b1.deposit(validNumber(amountString));

                    JOptionPane.showMessageDialog(null, "Please wait for cash. \nNew balance: €" + b1.getBalance());
                }//End of Deposit

                case '2':
                {
                    amountString = JOptionPane.showInputDialog("Please enter the amount you wish to withdraw");
                    amount = validNumber(amountString);

                    while(amount > b1.getBalance())
                    {
                        amountString = JOptionPane.showInputDialog("Error not enough funds! Please enter a valid amount you wish to withdraw");
                        amount = validNumber(amountString);
                    }

                    b1.withdraw(amount);

                    JOptionPane.showMessageDialog(null, "Please wait for cash. \nNew balance: €" + b1.getBalance());
                    break;
                }//End of withdraw

                default:
                {
                    break;
                }//End of default
            }//End of bankInterface switch

            intefaceString = JOptionPane.showInputDialog("Please choose an option: \n\t1. Deposit Money \n\t2. Withdraw Money \n\t3.Exit");

            while(!intefaceString.equals("1") && !intefaceString.equals("2") && !intefaceString.equals("3"))
            {
                intefaceString = JOptionPane.showInputDialog("Error, invalid length, please enter a valid answer");
            }//End of while invalid char length

            bankInterface = intefaceString.charAt(0);
        }//End of while bankInterface not 3

        JOptionPane.showMessageDialog(null, "Thanks for using the system, goodbye");

        for(int i = 0; i < accounts.length; i++)
        {
            accounts[i].setAccnum(JOptionPane.showInputDialog("Please enter account number "+i+": "));
            balanceAsString = JOptionPane.showInputDialog("Please enter your balance: ");
            accounts[i].setBalance(validNumber(balanceAsString));
            people[i] = new Person(JOptionPane.showInputDialog("Please enter your name"));
            accounts[i].setCustomer(people[i]);

            JOptionPane.showMessageDialog(null, accounts[i]);

            intefaceString = JOptionPane.showInputDialog("Please choose an option: \n\t1. Deposit Money \n\t2. Withdraw Money \n\t3.Exit");

            bankInterface = intefaceString.charAt(0);

            while(bankInterface != '3')
            {
                switch (bankInterface)
                {
                    case '1':
                    {
                        amountString = JOptionPane.showInputDialog("Please enter the amount you wish to deposit");
                        b1.deposit(validNumber(amountString));

                        JOptionPane.showMessageDialog(null, "Please wait for cash. \nNew balance: €" + b1.getBalance());
                    }//End of Deposit

                    case '2':
                    {
                        amountString = JOptionPane.showInputDialog("Please enter the amount you wish to withdraw");
                        amount = validNumber(amountString);

                        while(amount > b1.getBalance())
                        {
                            amountString = JOptionPane.showInputDialog("Error not enough funds! Please enter a valid amount you wish to withdraw");
                            amount = validNumber(amountString);
                        }

                        JOptionPane.showMessageDialog(null, "Please wait for more cash. \nNew balance: €" + b1.getBalance());
                    }//End of withdraw

                    default:
                    {
                        break;
                    }//End of default
                }//End of bankInterface switch

                intefaceString = JOptionPane.showInputDialog("Please choose an option: \n\t1. Deposit Money \n\t2. Withdraw Money \n\t3.Exit");

                while(!intefaceString.equals("1") && !intefaceString.equals("2") && !intefaceString.equals("3"))
                {
                    intefaceString = JOptionPane.showInputDialog("Error, invalid length, please enter a valid answer");
                }//End of while invalid char length

                bankInterface = intefaceString.charAt(0);
            }//End of while bankInterface not 3

            JOptionPane.showMessageDialog(null, "Thanks for using the system, goodbye");

        }//End of for accounts


        System.exit(0);
    }//End of main

    public static double validNumber(String numberAsString)
    {
        boolean valid = false;
        double number;
        int i;

        while(!valid)
        {
            if(!numberAsString.equals(""))
            {
                for(i = 0; i < numberAsString.length(); i++)
                {
                    if(!Character.isDigit(numberAsString.charAt(i)) && numberAsString.charAt(i) != '.')
                    {
                        break;
                    }//End of if not character
                }//End of for digit test

                if(i == numberAsString.length())
                {
                    valid = true;
                }//End of if valid length

                else
                {
                    numberAsString = JOptionPane.showInputDialog("Error invalid number, please enter a valid number");
                }//End of if invalid length
            }//End of if not empty
            else
            {
               numberAsString = JOptionPane.showInputDialog("Empty Answer, please enter a valid number");
            }
        }//End of valid

        number = Double.parseDouble(numberAsString);

        return number;
    }//End of validNumber
}//End of Test Class
