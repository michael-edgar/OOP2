package com.example.ProblemSet2;

public class Library {
    public static void main(String[] args) {
        Book bk1 = new Book();
        Book bk2 = new Book("The Ask and the Answer", 12f, "5542793501346", 567);

        System.out.println(bk1.toString());
        System.out.println(bk2.toString());
    }
}
