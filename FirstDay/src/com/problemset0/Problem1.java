package com.problemset0;

/**
 * Created by t00194492 on 13/09/2017.
 */

import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {
        String Name, ClassName;
        int NumOfSnacks, Price;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        Name = input.nextLine();

        System.out.print("Please enter your class name: ");
        ClassName = input.nextLine();

        System.out.print("Please enter the amount of snacks " +
                         "you would like to purchase: ");
        NumOfSnacks = input.nextInt();

        Price = NumOfSnacks*2;

        System.out.println("\n\nName: " +Name+ "\nClass Name: " +ClassName+
                           "\nNumber of Snacks Ordered: " +NumOfSnacks+
                            "\nPrice: " +Price );
    }
}
