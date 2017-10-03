package com.example.ProblemSet2;

public class Instrument {
    private String manufacturer;
    private String material;
    private char [] tuning;
    private int age;
    private int strings;
    private double worth;

    public void setManufacturer(String manufacturer)
    {
        this.manufacturer = manufacturer;
    }//End of setManufacturer

    public String getManufacturer()
    {
        return manufacturer;
    }//End of getManufacturer

    public void setMaterial(String material)
    {
        this.material = material;
    }//End of setMaterial

    public String getMaterial()
    {
        return material;
    }//End of getMaterial

    public void setTuning(char [] tuning)
    {
        this.tuning = tuning;
    }//End of setTuning

    public char[] getTuning()
    {
        return tuning;
    }//End of getTuning

    public void setAge(int age)
    {
        this.age = age;
    }//End of setAge

    public int getAge()
    {
        return age;
    }//End of getAge

    public void setStrings(int strings)
    {
        this.strings = strings;
    }//End of setStrings

    public int getStrings()
    {
        return strings;
    }//End of getStrings

    public void setWorth(double worth)
    {
        this.worth = worth;
    }//End of setWorth

    public double getWorth()
    {
        return worth;
    }//End of getWorth

    public Instrument()
    {
        this("No manufacturer", "No material", null, 0, 0, 0.00f);
    }//End of Instrument default

    public Instrument(String manufacturer, String material, char [] tuning, int age, int strings, double worth)
    {
        setManufacturer(manufacturer);
        setMaterial(material);
        setTuning(tuning);
        setAge(age);
        setStrings(strings);
        setWorth(worth);
    }//End of Instrument method

    public String toString()
    {
        String returning = "";


        if(tuning != null)
        {
            for(int i = 0; i < tuning.length; i++)
            {
                if(tuning[i] != '\u0000')
                {
                    returning += " " +tuning[i]+ ", ";
                }
            }
        }

        return String.format("Manufacturer: %-30s \nMaterial: %-15s \nTuning: %s \nAge: %-3dYears\nNumber of strings: %-2d \nWorth: %-8.2f",
                manufacturer, material, returning, age, strings, worth);
    }//End of toString
}//End of class
