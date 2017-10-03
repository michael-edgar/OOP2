package com.example.ProblemSet2;

public class Animal {
    private String type;
    private String [] continents;
    private double weight;
    private int age;

    public void setType(String type)
    {
        this.type = type;
    }//End of setType

    public void setContinents(String [] continents)
    {
        this.continents = continents;
    }//End of setContinents

    public void setWeight(double weight)
    {
        this.weight = weight;
    }//End of setWeight

    public void  setAge(int age)
    {
        this.age = age;
    }//End of setAge

    public String getType()
    {
        return type;
    }//End of getType

    public String[] getContinents()
    {
        return continents;
    }//End of getContinents

    public double getWeight()
    {
        return weight;
    }//End of getWeight

    public int getAge()
    {
        return age;
    }//End of getAge

    public Animal()
    {
        this("No type Specified", null,0.00f ,0 );
    }//End of default Animal set

    public Animal(String type, String [] continents, double weight, int age)
    {
        setType(type);
        setContinents(continents);
        setWeight(weight);
        setAge(age);
    }//End of Animal set

    public String toString()
    {
        String returning = "";
        if(continents != null)
        {
            for(int i = 0; i < continents.length; i++)
            {
                if(continents[i] != null)
                {
                    returning += " " +continents[i]+ ",";

                }
            }//End of for loop
        }//End of if null

        //returning += "\nWeight %-10.2f \n%-4d";

        return String.format("Type: %s\nContinents: %s\nWeight: %5.2f\nAge: %d\n\n",type, returning, weight, age);
    }//End of toString
}//End of Animal Class
