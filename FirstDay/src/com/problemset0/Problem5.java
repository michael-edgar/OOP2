package com.problemset0;

/**
 * Created by t00194492 on 14/09/2017.
 */
import java.util.Scanner;
public class Problem5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String choiceAsString;
        float Number1, Number2, Answer;
        char choice;
        boolean Valid = true;

        System.out.print("Please choose an operation, Addition (A), Subtraction (S), " +
                "Multiplication (M) or Division (D): ");
        choiceAsString = input.nextLine();
        
        choiceAsString = choiceAsString.toUpperCase();

        choice = choiceAsString.charAt(0);

        switch(choice)
        {
            case 'A':
            {
                System.out.print("Please enter the first Number: ");
                Number1 = input.nextFloat();

                System.out.print("Please enter the second Number: ");
                Number2 = input.nextFloat();

                Answer = Number1 + Number2;
                break;
            }

            case 'S':
            {
                System.out.print("Please enter the first Number: ");
                Number1 = input.nextFloat();

                System.out.print("Please enter the second Number: ");
                Number2 = input.nextFloat();

                Answer = Number1 - Number2;
                break;
            }

            case 'M':
            {
                System.out.print("Please enter the first Number: ");
                Number1 = input.nextFloat();

                System.out.print("Please enter the second Number: ");
                Number2 = input.nextFloat();

                Answer = Number1 * Number2;
                break;
            }

            case 'D':
            {
                System.out.print("Please enter the first Number: ");
                Number1 = input.nextFloat();

                System.out.print("Please enter the second Number: ");
                Number2 = input.nextFloat();

                Answer = Number1 / Number2;
                break;
            }

            default:
            {
                System.out.println("\n\nError!! The choice you entered is not valid!");
                Valid = false;
                Answer = 0;
            }
        }

        if(Valid)
        {
            System.out.println("\nThe answer to the question is " + Answer);
        }
    }
}
