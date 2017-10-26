package Questions;

import javax.swing.JOptionPane;

public class House extends Person{
    //House Attributes
    private String address;
    private String type;
    private double price;
    public Person owner = new Person();

    //accessor methods
    public String getAddress()
    {
        return address;
    }//End of getAddress method

    public String getType()
    {
        return type;
    }//End of getType method

    public double getPrice()
    {
        return price;
    }//End of getPrice method

    public Person getOwner()
    {
        return owner;
    }//End of getOwner

    //Mutator methods

    public void setAddress(String address)
    {
        this.address = address;
    }//End of setAddress method

    public void setType(String type)
    {
        this.type = type;
    }//End of setType method

    public void setPrice(double price)
    {
        this.price = price;
    }//End of setPrice method

    public void setOwner(String name, int age, String phoneNo)
    {
        owner.setName(name);
        owner.setAge(age);
        owner.setPhoneNo(phoneNo);
    }//End of setOwner method

    //toString method

    public String toString()
    {
        return String.format("Address: %s \nType: %s \nPrice: %.2f \nOwner %s",
                getAddress(), getType(), getPrice(), getOwner());
    }//End of toString method

    //Constructors

    public House()
    {
        this("No Address Specified", "No Type Specified", 0.00f,
                "No Owner Specified", 0, "No Phone Number Specified");
    }//End of no-argument constructor

    public House(String address, String type, double price, String name, int age, String phoneNo)
    {
        setAddress(address);
        setType(type);
        setPrice(price);
        owner.setName(name);
        owner.setAge(age);
        owner.setPhoneNo(phoneNo);
    }//End of six-argument constructor

    //Validation method
    public static double validPrice(String priceAsString)
    {
        double price;
        boolean valid = false;
        int i;

        while(!valid)
        {
            if(!priceAsString.equals(""))
            {
                for(i = 0; i < priceAsString.length(); i++)
                {
                    if(!Character.isDigit(priceAsString.charAt(i)) && priceAsString.charAt(i) != '.')
                        break;
                }//End of for digit test

                if(i == priceAsString.length())
                {
                    valid = true;
                }//End of if valid price

                else
                {
                    priceAsString = JOptionPane.showInputDialog("Invalid price entered, please re-enter");
                }//End of else invalid price
            }//End of if not empty

            else
            {
                priceAsString = JOptionPane.showInputDialog("Empty price entered, please re-enter");
            }//End of else empty
        }//End of while invalid

        price = Double.parseDouble(priceAsString);

        return price;
    }//End of validPrice method
}//End of House class
