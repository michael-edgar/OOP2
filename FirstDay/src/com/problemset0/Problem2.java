package com.problemset0;

/**
 * Created by t00194492 on 13/09/2017.
 */

import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String FirstName, Initial, LastName;
        Float Distance, MoneyEarned, DistanceOver10 = 0f;

        System.out.print("Please enter your first name: ");
        FirstName = input.nextLine();

        System.out.print("Please enter your initial: ");
        Initial = input.nextLine();

        System.out.print("Please enter your surname: ");
        LastName = input.nextLine();

        System.out.print("Please enter the distance you travelled in km: ");
        Distance = input.nextFloat();

        if(Distance > 10)
        {
            DistanceOver10 = (Distance - 10);
            MoneyEarned = ((DistanceOver10 * .1f) + (10 * .07f));
        }

        else
        {
            MoneyEarned = Distance * .07f;
        }

        System.out.println("\n\nName: " +FirstName+ " " +Initial+ " " +LastName +
                            "\nDistance Travelled: " + Distance+ "\nTotal Earnings: " +
                            MoneyEarned);
    }
}
