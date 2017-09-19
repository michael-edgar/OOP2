package com.problemset0;

/**
 * Created by t00194492 on 13/09/2017.
 */

import java.util.Scanner;
public class Problem3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String Name, Rate;
        Float Income, Under36 = .2f, Over36 = .41f;
        Float TaxDue, NetIncome;

        System.out.print("Please enter your name: ");
        Name = input.nextLine();

        System.out.print("Please enter your taxable income: ");
        Income = input.nextFloat();

        if(Income <= 20000)
        {
            TaxDue = 0f;
            Rate = "0%";
        }

        else if (Income <= 36000)
        {
            TaxDue = Income*Under36;
            Rate = "20%";
        }

        else
        {
            TaxDue = Income*Over36;
            Rate = "41%";
        }

        NetIncome = Income - TaxDue;

        System.out.println("\n\nGross Income: " +Income+ "\nTax Rate: " +Rate+
                            "\nIncome After Tax: " +NetIncome);
    }
}
