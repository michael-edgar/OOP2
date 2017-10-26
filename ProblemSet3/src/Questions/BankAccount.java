package Questions;

public abstract class BankAccount implements Transactable, Taxable{

    //attributes
    protected String name;
    protected int accnum;

    //Transactable methods
    public void lodge(double amount)
    {

    }//End of lodge method

    public void withdraw(double amount)
    {

    }//End of withdraw method

    //Taxable methods
    public double calcTax()
    {
        double tax = 0;



        return tax;
    }//End of calcTax method

    //accessor methods
    public String getName()
    {
        return name;
    }//End of getName method

    public int getAccnum()
    {
        return accnum;
    }//End of getAccnum method

    //mutator methods
    public void setName(String name)
    {
        this.name = name;
    }//End of setName method

    public void setAccnum(int accnum)
    {
        this.accnum = accnum;
    }//End of setAccnum method
}//End of BankAccount Class
