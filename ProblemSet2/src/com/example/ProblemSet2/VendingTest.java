package com.example.ProblemSet2;

public class VendingTest {
    public static void main(String[] args) {
        VendingMachine cola = new VendingMachine();
        double [] size = new double [3];
        boolean greaterZero = false;
        int coinCapacity = 30;
        int coins = 0;
        int cans = 0;

        for (int i = 0; i < size.length; i++)
        {
            size[i] = (Math.random()*1000);
        }//End of for size set

        for(int i = 0; i < coinCapacity; i++)
        {
                if((int)(Math.random()*10) % 2 == 0)
                {
                    coins++;
                }//End of if even

                else
                {
                    cans++;
                    greaterZero = true;
                }//End of else odd


        }//End of for coins

        cola.setSize(size);
        cola.setCoinCapacity(coinCapacity);
        cola.setCoins(coins);
        cola.setGreaterZero(greaterZero);
        cola.setCans(cans);

        System.out.print(cola);

        cola.insertToken();

        cola.fillUp((int)(Math.random()*10));

        System.out.print(cola.getCanCount());

        System.out.print(cola.getTokenCount());

    }
}
