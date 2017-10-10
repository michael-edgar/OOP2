package com.example.ProblemSet2;

public class VendingTest {
    public static void main(String[] args) {
        VendingMachine cola = new VendingMachine();
        double [] size = new double [3];

        for (int i = 0; i < size.length; i++)
        {
            size[i] = (Math.random()*100);
        }

        cola.setSize(size);

        
    }
}
