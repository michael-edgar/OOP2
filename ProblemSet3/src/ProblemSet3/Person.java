package ProblemSet3;

import javax.swing.JOptionPane;

public class Person {
    //attributes
    private String name;
    private int age;
    private String phoneNo;

    //accessor methods
    public String getName()
    {
        return name;
    }//End of getName method

    public int getAge()
    {
        return age;
    }//End of getAge method

    public String getPhoneNo()
    {
        return phoneNo;
    }//End of getPhoneNo method

    //mutator methods
    public void setName(String name)
    {
        this.name = name;
    }//End of setName method

    public void setAge(int age)
    {
        this.age = age;
    }//End of setAge method

    public void setPhoneNo(String phoneNo)
    {
        this.phoneNo = phoneNo;
    }//End of setPhoneNo

    //toString method
    public String toString()
    {
        return String.format("Name: %s \nAge: %d \nPhone Number: %s", getName(), getAge(), getPhoneNo());
    }//End of toString method

    //constructor methods
    public Person()
    {
        this("No Name Specified", 0, "No Phone Number Specified");
    }//End of no-argument constructor

    public Person(String name, int age, String phoneNo)
    {
        setName(name);
        setAge(age);
        setPhoneNo(phoneNo);
    }//End of three-argument constructor

    //validation methods
    public static String validPhoneNo(String phoneNo)
    {
        String validPhone;
        boolean valid = false;
        int i;

        while(!valid)
        {
            if(!phoneNo.equals(""))
            {
                if(phoneNo.charAt(0) == '0')
                {
                    for(i = 1; i < phoneNo.length(); i++)
                    {
                        if(!Character.isDigit(phoneNo.charAt(i)))
                            break;
                    }//End of for digit test

                    if(i == phoneNo.length())
                    {
                        valid = true;
                    }//End of if valid phone number

                    else
                    {
                        phoneNo = JOptionPane.showInputDialog("Invalid phone number entered, please re-enter");
                    }//End of else invalid price
                }

                else
                {
                    phoneNo = JOptionPane.showInputDialog("Invalid phone number entered, " +
                            "must start with \"0\" please re-enter");
                }
            }//End of if not empty

            else
            {
                phoneNo = JOptionPane.showInputDialog("Empty phone number entered, please re-enter");
            }//End of else empty
        }//End of while invalid

        validPhone = phoneNo;

        return validPhone;
    }//End of validPhoneNo method

    public static int validAge(String ageAsString)
    {
        int age, i;
        boolean valid = false;

        while(!valid)
        {
            if(!ageAsString.equals(""))
            {
                for(i = 0; i < ageAsString.length(); i++)
                {
                    if(!Character.isDigit(ageAsString.charAt(i)))
                        break;
                }//End of for digit test

                if(i == ageAsString.length())
                {
                    valid = true;
                }//End of if valid age

                else
                {
                    ageAsString = JOptionPane.showInputDialog("Invalid age entered, please re-enter");
                }//End of else invalid age
            }//End of if not empty

            else
            {
                ageAsString = JOptionPane.showInputDialog("Empty age entered, please re-enter");
            }//End of else empty
        }//End of while invalid

        age = Integer.parseInt(ageAsString);

        return age;
    }//End of validAge method
}//End of Person class
