package com.example.ProblemSet2_1;

public class Person {
    private String name;

    public void setName(String name)
    {
        this.name = name;
    }//End of setName

    public String getName()
    {
        return name;
    }//End of getName

    public Person()
    {
        this("Unknown");
    }//End of default Person

    public Person(String name)
    {
        setName(name);
    }//End of Person

    public String toString()
    {
        return String.format("Name: %s", name);
    }//End of toString
}
