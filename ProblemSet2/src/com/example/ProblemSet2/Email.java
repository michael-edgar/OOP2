package com.example.ProblemSet2;

public class Email {
    public static void main(String[] args) {
        Message m1 = new Message();
        Message m2 = new Message("Bob Bilson", "Mike Edgar", "Ya boiiiiiiiiiii");

        System.out.print(m1.toString());
        System.out.print(m2.toString());
    }//End of main method
}//End of Email Class
