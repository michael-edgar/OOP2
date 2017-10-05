package com.example.ProblemSet2;

import javax.swing.JOptionPane;
import java.util.*;

public class BorrowBook {

    static int i;
    static boolean leapYear;

    public static void main(String[] args) {

        String dayString, monthString, yearString;
        int day, month, year, lengthBorrowing;

        yearString = JOptionPane.showInputDialog("Please enter the year you borrowed the book in the format YYYY");
        year = validYear(yearString);

        monthString = JOptionPane.showInputDialog("Please enter the month you borrowed the book in the format MM");
        month = validMonth(monthString);

        dayString = JOptionPane.showInputDialog("Please enter the day you borrowed the book in the format DD");
        day = validDay(dayString, month);

        GregorianCalendar borrowDate = new GregorianCalendar(year,month,day);

        yearString = JOptionPane.showInputDialog("Please enter the year you will return the book in the format YYYY");
        year = validYear(yearString);

        monthString = JOptionPane.showInputDialog("Please enter the month you will return the book in the format MM");
        month = validMonth(monthString);

        dayString = JOptionPane.showInputDialog("Please enter the day you will return the book in the format DD");
        day = validDay(dayString, month);

        GregorianCalendar returnDate = new GregorianCalendar(year, month, day);

        JOptionPane.showMessageDialog(null, "The borrow date is: " +borrowDate);

        while(returnDate.before(borrowDate) || (borrowDate.get(Calendar.YEAR) != returnDate.get(Calendar.YEAR)))
        {
            JOptionPane.showMessageDialog(null, "Invalid return date, please re-enter");

            yearString = JOptionPane.showInputDialog("Please enter the year you will return the book in the format YYYY");
            year = validYear(yearString);

            monthString = JOptionPane.showInputDialog("Please enter the month you will return the book in the format MM");
            month = validMonth(monthString);

            dayString = JOptionPane.showInputDialog("Please enter the day you will return the book in the format DD");
            day = validDay(dayString, month);

            returnDate = new GregorianCalendar(year, month, day);
        }

        JOptionPane.showMessageDialog(null, "The return date is: " +returnDate);

        lengthBorrowing = (borrowDate.get(Calendar.DAY_OF_YEAR) + returnDate.get(Calendar.DAY_OF_YEAR));

        JOptionPane.showMessageDialog(null, "The length the book is borrowed is: " +lengthBorrowing);

        System.exit(0);


    }//End of main

    public static int validYear(String yearString)
    {
        int year;
        boolean valid = false;

        while(!valid)
        {
            if(yearString.equals(""))
            {
                if(yearString.length() == 4)
                {
                    for(i = 0; i < yearString.length(); i++)
                    {
                        if(!Character.isDigit(yearString.charAt(i)))
                        {
                            break;
                        }//End of if digit test
                    }//End of for digit test

                    if(i == yearString.length())
                    {
                        valid = true;
                    }//End of if valid

                    else
                    {
                        yearString = JOptionPane.showInputDialog("Invalid year, please enter a valid year!");
                    }//End of else invalid
                }//End of if valid length

                else
                {
                    yearString = JOptionPane.showInputDialog("Invalid year length, please enter a valid year!");
                }
            }//End of if not empty

            else
            {
                yearString = JOptionPane.showInputDialog("Empty year, please enter a valid year!");
            }//End of else empty
        }//End of while invalid

        year = Integer.parseInt(yearString);

        if (year % 4 == 0)
        {
            leapYear = true;
        }//End of if leapYear
        else
        {
            leapYear = false;
        }//End of else leapYear

        return year;
    }//End of validYear

    public static int validMonth(String monthString)
    {
        int month;
        boolean valid = false;

        while(!valid)
        {
            if(!monthString.equals(""))
            {
                if(monthString.length() == 2)
                {
                    for(i = 0; i < monthString.length(); i++)
                    {
                        if(!Character.isDigit(monthString.charAt(i)))
                        {
                            break;
                        }//End of if digit test
                    }//End of for digit test

                    if(i == monthString.length())
                    {
                        month = Integer.parseInt(monthString);

                        if(month >= 1 && month <= 12)
                        {
                            valid = true;
                        }//End of if valid month

                        else
                        {
                            monthString = JOptionPane.showInputDialog("Invalid month value, please enter a valid month!");
                        }//End of else invalid month
                    }//End of if valid string

                    else
                    {
                        monthString = JOptionPane.showInputDialog("Invalid month, please enter a valid month!");
                    }//End of else invalid string
                }//End of if valid length

                else
                {
                    monthString = JOptionPane.showInputDialog("Invalid month length, please enter a valid month!");
                }//End of else invalid length
            }//End of if not empty

            else
            {
                monthString = JOptionPane.showInputDialog("Empty month, please enter a valid month!");
            }//End of else empty
        }//End of while invalid

        month = Integer.parseInt(monthString);

        return month;
    }//End of vslidMonth

    public static int validDay(String dayString, int month)
    {
        int day;
        boolean valid = false;

        while(!valid)
        {
            if (!dayString.equals(""))
            {
                if (dayString.length() == 2)
                {
                    for(i = 0; i < dayString.length(); i++)
                    {
                        if(!Character.isDigit(dayString.charAt(i)))
                        {
                            break;
                        }//End of if not digit
                    }//End of for loop digit test

                    if(i == dayString.length())
                    {
                        day = Integer.parseInt(dayString);

                        switch(month)
                        {
                            case 1:
                            case 3:
                            case 5:
                            case 7:
                            case 8:
                            case 10:
                            case 12:
                            {
                                if(day >= 1 && day <= 31)
                                {
                                    valid = true;
                                }//End of if valid day
                                break;
                            }//End of case 31 day month

                            case 4:
                            case 6:
                            case 9:
                            case 11:
                            {
                                if(day >= 1 && day <= 30)
                                {
                                    valid = true;
                                }//End of if valid day
                                break;
                            }//End of case 30 day month

                            default:
                            {
                                if(leapYear = true)
                                {
                                    if(day >= 1 && day <= 29)
                                    {
                                        valid = true;
                                    }//End of valid day
                                }//End of if leap year

                                else
                                {
                                    if(day >= 1 && day <= 28)
                                    {
                                        valid = true;
                                    }//End of if valid day
                                }//End of else not leap year
                            }//End of default case
                        }//End of switch day

                        if(valid)
                        {
                            break;
                        }//End of if valid

                        else
                        {
                            dayString = JOptionPane.showInputDialog("Invalid day value, please enter a valid day!");
                        }//End of else invalid day
                    }//End of if valid string

                    else
                    {
                        dayString = JOptionPane.showInputDialog("Invalid day, please enter a valid day!");
                    }//End of else invalid string
                }//End of if valid length

                else
                {
                    dayString = JOptionPane.showInputDialog("Invalid day length, please enter a valid day!");
                }//End of else invalid length
            }//End of if not empty

            else
            {
                dayString = JOptionPane.showInputDialog("Empty day, please enter a valid day!");
            }//End of else empty
        }//End of while invalid

        day = Integer.parseInt(dayString);

        return day;
    }//End of validDate
}//End of class
