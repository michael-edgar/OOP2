package com.example.ProblemSet2;

import sun.security.util.BitArray;

/**
 * Created by t00194492 on 05/10/2017.
 */
public class VendingMachine {

    private double [] size = new double[3];
    private boolean greaterZero;
    /*private int [] spirals;
    private int rows;
    private int columns;
    private int capacityPerSpiral;*/
    private int coins;
    private int cans;
    private int coinCapacity;
    /*private char state;
    private String messageDisplay;*/

    public void setSize(double [] size)
    {
        this.size = size;
    }//End of setSize

    public double[] getSize()
    {
        return size;
    }//End of getSize

    public void setCoins(int coins)
    {
        this.coins = coins;
    }//End of setCoins

    public int getCoins()
    {
        return coins;
    }//End of getCoins

    public void setGreaterZero(boolean greaterZero)
    {
        this.greaterZero = greaterZero;
    }//End of setGreaterZero

    public boolean getGreaterZero()
    {
        return greaterZero;
    }//End of getGreaterZero

    /*public void setSpirals(int [] spirals)
    {
        this.spirals = spirals;
    }//End of setSpirals

    public int [] getSpirals()
    {
        return spirals;
    }//End of getSpirals

    public void setRows(int rows)
    {
        this.rows = rows;
    }//End of setRows

    public int getRows()
    {
        return rows;
    }//End of getRows

    public void setColumns(int columns)
    {
        this.columns = columns;
    }//End of setColumns

    public int getColumns()
    {
        return columns;
    }//End of getColumns

    public void setCapacityPerSpiral(int capacityPerSpiral)
    {
        this.capacityPerSpiral = capacityPerSpiral;
    }//End of setCapacityPerSpiral

    public int getCapacityPerSpiral()
    {
        return capacityPerSpiral;
    }//End of getCapacityPerSpiral
    */
    public void setCans(int cans)
    {
        this.cans = cans;
    }//End of setCans

    public int getCans()
    {
        return cans;
    }//End of getCans

    public void setCoinCapacity(int coinCapacity)
    {
        this.coinCapacity = coinCapacity;
    }//End of setCoinCapacity

    public int getCoinCapacity()
    {
        return coinCapacity;
    }//End of getCoinCapacity

    /*public void setState(char state)
    {
        this.state = state;
    }//End of setState

    public char getState()
    {
        return state;
    }//End of getState

    public void setMessageDisplay(String messageDisplay)
    {
        this.messageDisplay = messageDisplay;
    }//End of setMessageDisplay

    public String getMessageDisplay()
    {
        return messageDisplay;
    }//End of getMessageDisplay
    */
    public VendingMachine()
    {
        //this(null,null,false,null,0,0,0,0,0,'\u0000',"");
        this(null, null, false, 0, 0);
    }//End of default answers

    public VendingMachine(double [] size, boolean [] coinHolder, boolean greaterZero, //int [] spirals, int rows, int columns, int capacityPerSpiral,
                           int cans, int coinCapacity/*, char state, String messageDisplay*/)
    {
        setSize(size);
        setCoins(coins);
        setGreaterZero(greaterZero);
        /*setSpirals(spirals);
        setRows(rows);
        setColumns(columns);
        setCapacityPerSpiral(capacityPerSpiral);*/
        setCans(cans);
        setCoinCapacity(coinCapacity);
        /*setState(state);
        setMessageDisplay(messageDisplay);*/
    }//End of VendingMachine Method

    public String toString()
    {
        return String.format("Size: %.2f cm,%.2f cm,%.2f cm \nCurrent coins: %-5d \nCurrent cans: %-5d \nCoin capacity: %-5d", size[0], size[1], size[2], coins, cans, coinCapacity );
    }//End of toString

    public void insertToken()
    {
        if(greaterZero)
        {
            setCoins(getCoins()+1);
            setCans(getCans()-1);

            System.out.print("\n\n" +toString());
        }
        else
        {
            System.out.print("\n\nError! No cans!!");
        }
    }

    public void fillUp(int cans)
    {
        if(this.cans + cans <= 30)
        {
            setCans(getCans()+cans);

            System.out.print("\n\n" + toString());
        }

        else
        {
            System.out.print("\n\nError! too many cans");
        }

    }//End of fillUp

    public String getCanCount()
    {
        String a ="\n\nCans: " +getCans();

        return a;
    }//End of getCanCount

    public String getTokenCount()
    {
        String a = "\n\nCoins: " +getCoins();

        return a;
    }//End of getTokenCount
}//End of Class
