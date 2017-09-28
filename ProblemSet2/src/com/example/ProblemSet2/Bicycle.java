package com.example.ProblemSet2;

/**
 * Created by t00194492 on 28/09/2017.
 */
public class Bicycle {
    private String ownersName;
    private double value;
    private String make;

    public void setOwnersName(String ownersName)
    {
        this.ownersName = ownersName;
    }//End of setOwnersName

    public String getOwnersName()
    {
        return ownersName;
    }//End of getOwnersName

    public void setValue(double value)
    {
        this.value = value;
    }//End of setValue

    public double getValue()
    {
        return value;
    }//End of getValue

    public void setMake(String make)
    {
        this.make = make;
    }//End of setMake

    public String getMake()
    {
        return make;
    }//End of getMake

    public Bicycle()
    {
        this("No Owner Set", 0.00f, "No Make Set");
    }//End of Bicycle default

    public Bicycle(String ownersName, double value, String make)
    {
        setOwnersName(ownersName);
        setValue(value);
        setMake(make);
    }//End of Bicycle

    public String toString()
    {
        return String.format("Owners Name: %-20s \nValue: %-5.2f \nMake: %-20s\n");
    }//End of toString
}//End of Bicycle Class
