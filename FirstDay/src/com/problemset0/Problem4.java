package com.problemset0;

/**
 * Created by t00194492 on 13/09/2017.
 */

import java.util.Scanner;
public class Problem4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int Total = 0, NumberOfNumbers = 0,Numbers /*f*/;
        String Number;

        System.out.print("Please enter a number (positive, negative or zero)(q to exit): ");
        Number = input.nextLine();

        /*for(f = 0; f < Number.length(); f++)      Started unnecessary input validation
        {
            if(!Character.isDigit(Number.charAt(f)))
            {
                break;
            }
        }

        if(f != Number.length())
        {
            if(Number != "q")
            {
                System.out.print("Invalid Answer! Please enter a number (positive, negative " +
                        "or zero)(q to exit): ");
                Number = input.nextLine();
            }
        }*/

        while(!Number.equals("q"))
        {
            Numbers = Integer.parseInt(Number);

            Total += Numbers;
            NumberOfNumbers ++;

            System.out.print("Please enter a number (positive, negative or zero)(q to exit): ");
            Number = input.nextLine();
        }

        System.out.println("\n\nGrand Total: " +Total+ "\nNumber of Entries: " +NumberOfNumbers);
    }
}
